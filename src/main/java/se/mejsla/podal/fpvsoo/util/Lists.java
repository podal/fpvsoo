package se.mejsla.podal.fpvsoo.util;


/**
 * En list hjälp klass
 */
public class Lists {
	private Lists() {
	}

	/**
	 * Här får du en tom lista. 
	 */
	public static <T> List<T> emptyList() {
		return new LinkedList<T>();
	}

	/**
	 * Vill du sortera en lista så gör det här. Du får tillbaka en ny lista sorterad. 
	 * @return En ny sorterad lista.
	 */
	public static <T extends java.lang.Comparable<T>> List<T> sort(List<T> list) {
		if (list.isEmpty()) {
			return list;
		}
		return addInOrder(sort(list.tail()), list.head());
	}

	private static <T extends java.lang.Comparable<T>> List<T> addInOrder(List<T> list, T add) {
		if(list.isEmpty()) {
			return list.addTail(add);
		} if(list.head().compareTo(add) <= 0) {
			return addInOrder(list.tail(),add).addHead(list.head());
		} else {
			return list.addHead(add);
		}
	}

	/**
	 * Här skapar du en lista med argumenten.
	 * @param as elementen att stoppa i listan
	 * @return returnerar en lista med elementen.
	 */
	@SafeVarargs
	public static <T> List<T> list(T... as) {
		List<T> list = emptyList();
		for (T a : as) {
			list = list.addTail(a);
		}
		return list;
	}

}
