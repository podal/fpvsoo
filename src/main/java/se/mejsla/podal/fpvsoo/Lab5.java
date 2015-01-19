package se.mejsla.podal.fpvsoo;

import se.mejsla.podal.fpvsoo.util.List;

/**
 * Bra util klass för att göra operationer på en lista.
 */
public class Lab5 {
	private Lab5() {
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
	public static <T> List<T> remove(List<T> list, T delete) {
		if (list.isEmpty()) {
			return list;
		} else if (list.head().equals(delete)) {
			return remove(list.tail(), delete);
		} else {
			return remove(list.tail(), delete).addHead(list.head());
		}
	}

}
