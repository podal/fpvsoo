package se.mejsla.podal.fpvsoo.util.impl;

import se.mejsla.podal.fpvsoo.util.List;
import se.mejsla.podal.fpvsoo.util.Lists;

public class ListsImpl implements Lists {

	public <T> List<T> emptyList() {
		return new LinkedList<T>();
	}

	public <T extends java.lang.Comparable<T>> List<T> sort(List<T> list) {
		if (list.isEmpty()) {
			return list;
		}
		return addInOrder(sort(list.tail()), list.head());
	}

	private <T extends java.lang.Comparable<T>> List<T> addInOrder(List<T> list, T add) {
		if (list.isEmpty()) {
			return list.addTail(add);
		}
		if (list.head().compareTo(add) <= 0) {
			return addInOrder(list.tail(), add).addHead(list.head());
		} else {
			return list.addHead(add);
		}
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> list(T... as) {
		List<T> list = emptyList();
		for (T a : as) {
			list = list.addTail(a);
		}
		return list;
	}

}
