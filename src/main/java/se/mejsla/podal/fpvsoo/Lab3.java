package se.mejsla.podal.fpvsoo;

import se.mejsla.podal.fpvsoo.util.List;
import static se.mejsla.podal.fpvsoo.util.ListUtil.Lists;

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
		List<T> newList = Lists.emptyList();
		for(T t:list) {
			if(!Lab1.exists(newList, t)) {
				newList = newList.addTail(t);
			}
		}
		return newList;
	}
}
