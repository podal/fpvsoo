package se.mejsla.podal.fpvsoo;

import se.mejsla.podal.fpvsoo.util.List;

/**
 * Bra util klass för att göra operationer på en lista.
 */
public class Lab4 {
	private Lab4() {
	}

	/**
	 * Returnerar en lista med all objekt som är samma enligt
	 * <code>Equals</code> utbytta till <code>replace</code>. Ifall inte
	 * objektet finns så läggs det till i listan.
	 *
	 * @param list
	 * @param equals
	 * @param t
	 * @return
	 */
	public static <T> List<T> replaceOrAdd(List<T> list, Equals<T> equals, T replace) {
		return replaceOrAdd(list, equals, replace, false);
	}

	public static <T> List<T> replaceOrAdd(List<T> list, Equals<T> equals, T replace, boolean found) {
		if (list.isEmpty() && found) {
			return list;
		} else if (list.isEmpty()) {
			return list.addHead(replace);
		}
		if (equals.isEqual(list.head(), replace)) {
			return replaceOrAdd(list.tail(), equals, replace, true).addHead(replace);
		} else {
			return replaceOrAdd(list.tail(), equals, replace, found).addHead(list.head());
		}
	}

}
