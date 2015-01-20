package se.mejsla.podal.fpvsoo;

import se.mejsla.podal.fpvsoo.util.List;
import static se.mejsla.podal.fpvsoo.util.ListUtil.Lists;
/**
 * Bra util klass för att göra operationer på en lista.
 */
public class Lab7 {
	private Lab7() {
	}

	/**
	 * Tar en sorterad lista och stopar in ett object på sin plats.
	 * 
	 * @param list en sorterad lista
	 * @param add object att lägga till
	 * @return returnerar en ny lista med add object in skutet på sin plats
	 */
	public static <T extends java.lang.Comparable<T>> List<T> addInOrder(List<T> list, T add) {
		boolean added = false;
		List<T> newList = Lists.emptyList(); 
		for(T t:list) {
			if(!added && t.compareTo(add)>=0) {
				newList = newList.addTail(add);
				added =true;
			}
			newList = newList.addTail(t);
		}
		if(!added) {
			newList = newList.addTail(add);			
		}
		return newList;
	}

}
