package se.mejsla.podal.fpvsoo;

import se.mejsla.podal.fpvsoo.util.List;
import static se.mejsla.podal.fpvsoo.util.ListUtil.Lists;

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
		List<T> newList = Lists.emptyList();
		for(T t:list) {
			if(t.equals(find)) {
				newList = newList.addTail(replace);
			} else {
				newList = newList.addTail(t);				
			}
		}
		return newList;
	}
}
