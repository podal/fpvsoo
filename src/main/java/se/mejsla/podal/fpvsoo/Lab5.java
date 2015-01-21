package se.mejsla.podal.fpvsoo;

import se.mejsla.podal.fpvsoo.util.List;

/**
 * Bra util klass för att göra operationer på en lista.
 */
public class Lab5 {
	private Lab5() {
	}

	/**
	 * Här tar vi bort ifall objectet finns i listan.
	 *
	 * @param list lista att ta bort ifrån
	 * @param delete object att ta bort
	 * @return returnera en ny lista med objectet borttaget ifall det finns.
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
