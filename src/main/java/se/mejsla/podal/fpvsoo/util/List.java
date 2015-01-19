package se.mejsla.podal.fpvsoo.util;

/**
 * Detta är en lista med object av typen <code>T</code>. Listan ör statisk med
 * andra ord den går inte att ändra bara göra nya object.
 * 
 * @param <T>
 *            innehållet i listan
 */
public interface List<T> {
	/**
	 * Här får du första elemntet i listan.
	 * 
	 * @throws EmptyListException
	 *             om listan är tom kastas <code>EmptyListException</code>
	 * @return första elemntet i listan.
	 */
	T head();

	/**
	 * Här får du en ny lista med alla element i listan utom första elemntet.
	 * 
	 * @throws EmptyListException
	 *             om listan är tom kastas <code>EmptyListException</code>
	 * @return en lista utan första elementet.
	 */
	List<T> tail();

	/**
	 * Här får du en ny lista med <code>head</code> som första elementet i
	 * lista.
	 * 
	 * @return en list med <code>head</code> som huvud
	 */
	List<T> addHead(T head);

	/**
	 * Här får du en ny lista med <code>tail</code> som sista elementet i lista.
	 * 
	 * @return en list med <code>tail</tail> som svans.
	 */
	List<T> addTail(T tail);

	/**
	 * Tittar ifall listan är tom.
	 * 
	 * @return retunerar <code>true</code> ifall listan är tom, annars
	 *         <code>false</code>
	 */
	boolean isEmpty();

	/**
	 * Här får du längden på listan
	 * 
	 * @return listans längd
	 */
	int size();

}
