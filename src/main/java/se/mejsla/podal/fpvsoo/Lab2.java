package se.mejsla.podal.fpvsoo;

import se.mejsla.podal.fpvsoo.util.List;

/**
 * Bra util klass för att göra operationer på en lista.
 */
public class Lab2 {
	private Lab2() {
	}

	/**
	 * Denna byter ut den alla <code>find</code> med <code>replace</code>.
	 * 
	 * @param list
	 *            listan som behöver bytet berör.
	 * @param find
	 *            objectet som ska bytas ut
	 * @param replace
	 *            objectet som det ska bytas till
	 * @return en ny lista där objecten är utbytta
	 */
	public static <T> List<T> replace(List<T> list, T find, T replace) {
		if (list.isEmpty()) {
			return list;
		} else if (list.head().equals(find)) {
			return replace(list.tail(), find, replace).addHead(replace);
		} else {
			return replace(list.tail(), find, replace).addHead(list.head());
		}
	}
}
