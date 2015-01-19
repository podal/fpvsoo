package se.mejsla.podal.fpvsoo.util;


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
			return _addTail(list.tail(),tail).addHead(list.head());
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
}
