package se.mejsla.podal.fpvsoo;

import se.mejsla.podal.fpvsoo.util.List;

/**
 * Bra util klass för att göra operationer på en lista.
 */
public class Lab6 {
	private Lab6() {
	}

	/**
	 * Kollar ifall en lista är i ordning.
	 * 
	 * @param list
	 *            en sorterad lista
	 * @return returnerar true ifall listan är sorterad
	 */
	public static <T extends java.lang.Comparable<T>> boolean inOrder(List<T> list) {
		T before = null;
		for (T t : list) {
			if (before != null && t.compareTo(before)<0) {
				return false;
			}
			before = t;
		}
		return true;
	}
}
