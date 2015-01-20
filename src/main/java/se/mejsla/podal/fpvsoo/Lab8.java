package se.mejsla.podal.fpvsoo;

import se.mejsla.podal.fpvsoo.util.List;
import static se.mejsla.podal.fpvsoo.util.ListUtil.Lists;
/**
 * Bra util klass för att göra operationer på en lista.
 */
public class Lab8 {
	private Lab8() {
	}

	/**
	 * Här sorterar vi listan vi skickar in.
	 * 
	 * @param list en godtycklig lista
	 * @return returnerar listan sorterad
	 */
	public static <T extends java.lang.Comparable<T>> List<T> sort(List<T> list) {
		List<T> newList = Lists.emptyList();
		for(T t:list) {
			newList = Lab7.addInOrder(newList, t);
		}
		return newList;
	}

}
