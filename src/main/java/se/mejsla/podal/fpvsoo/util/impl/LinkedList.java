package se.mejsla.podal.fpvsoo.util.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

import se.mejsla.podal.fpvsoo.util.EmptyListException;
import se.mejsla.podal.fpvsoo.util.List;

/**
 * Är en implementation av List av typen länkad lista.
 */
public class LinkedList<T> implements List<T> {
	private T head = null;
	private LinkedList<T> tail = null;

	public LinkedList() {
	}

	private LinkedList(T head, LinkedList<T> tail) {
		this.head = head;
		this.tail = tail;
	}

	@Override
	public T head() {
		if (head == null) {
			throw new EmptyListException();
		}
		return head;
	}

	@Override
	public LinkedList<T> tail() {
		if (head == null) {
			throw new EmptyListException();
		}
		return tail;
	}

	@Override
	public LinkedList<T> addHead(T head) {
		return new LinkedList<T>(head, this);
	}

	@Override
	public LinkedList<T> addTail(T tail) {
		return _addTail(this, tail);
	}

	private LinkedList<T> _addTail(LinkedList<T> list, T tail) {
		if (list.isEmpty()) {
			return list.addHead(tail);
		} else {
			return _addTail(list.tail(), tail).addHead(list.head());
		}
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public int size() {
		if (isEmpty()) {
			return 0;
		}
		return tail.size() + 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		} else if (!(obj instanceof List)) {
			return false;
		}
		@SuppressWarnings("rawtypes")
		List list = (List) obj;
		if (list.isEmpty() && isEmpty()) {
			return true;
		} else if (list.isEmpty() || isEmpty()) {
			return false;
		} else if (head().equals(list.head())) {
			return tail().equals(list.tail());
		}
		return false;
	}

	@Override
	public String toString() {
		return mkString("[", ", ", "]");
	}

	public String mkString(String head, String beetween, String tail) {
		if (this.isEmpty()) {
			return head + tail;
		} else if (tail().isEmpty()) {
			return head + head().toString() + tail;
		} else
			return head + head().toString() + beetween + tail().mkString("", beetween, tail);
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator<T>(this);
	}
}

class LinkedListIterator<T> implements Iterator<T> {

	private LinkedList<T> linkedList;

	LinkedListIterator(LinkedList<T> linkedList) {
		this.linkedList = linkedList;
	}

	@Override
	public boolean hasNext() {
		return !linkedList.isEmpty();
	}

	@Override
	public T next() {
		if (linkedList.isEmpty()) {
			throw new NoSuchElementException();
		}
		T t = linkedList.head();
		linkedList = linkedList.tail();
		return t;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}