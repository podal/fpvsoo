package se.mejsla.podal.fpvsoo;

import se.mejsla.podal.fpvsoo.util.List;

/**
 * Bra util klass för att göra operationer på en lista.
 */
public class Lab1 {
	private Lab1() {
	}

	/**
	 * Tittar ifall ett object finns i en lista.
	 * 
	 * @param list
	 *            listan att söka igenom.
	 * @param t
	 *            objectet att söka efter.
	 * @return returnerar sant ifall objectet t finns i listan
	 */
	public static <T> boolean exists(List<T> list, T t) {
		if (list.isEmpty()) {
			return false;
		} else if (list.head().equals(t)) {
			return true;
		} else {
			return exists(list.tail(), t);
		}
	}
}
