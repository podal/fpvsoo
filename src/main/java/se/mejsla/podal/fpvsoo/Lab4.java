package se.mejsla.podal.fpvsoo;

import se.mejsla.podal.fpvsoo.util.List;
import static se.mejsla.podal.fpvsoo.util.ListUtil.Lists;

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
		boolean found = false;
		List<T> newList = Lists.emptyList();
		for(T t:list) {
			if(equals.isEqual(t, replace)) {
				newList = newList.addTail(replace);
				found = true;
			} else {
				newList = newList.addTail(t);
			}
		}
		if(!found) {
			newList = newList.addTail(replace);			
		}
		return newList;
	}

}
