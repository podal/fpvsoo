package se.mejsla.podal.fpvsoo;

import se.mejsla.podal.fpvsoo.util.List;

/**
 * Bra util klass för att göra operationer på en lista.
 */
public class Lab3 {
	private Lab3() {
	}

	/**
	 * Returnerar en lista där alla dubletter är borttagna.
	 * 
	 * @param list
	 *            lista med eventuelt några dubleter.
	 * @return en lista utan dubletter.
	 */
	public static <T> List<T> distinct(List<T> list) {
		if (list.isEmpty()) {
			return list;
		} else {
			List<T> returnList = distinct(list.tail());
			if (Lab1.exists(returnList, list.head())) {
				return returnList;
			} else {
				return returnList.addHead(list.head());
			}
		}
	}
}
