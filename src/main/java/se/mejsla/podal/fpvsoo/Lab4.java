package se.mejsla.podal.fpvsoo;

import se.mejsla.podal.fpvsoo.util.List;

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
		return replaceOrAdd(list, equals, replace, false);
	}

	public static <T> List<T> replaceOrAdd(List<T> list, Equals<T> equals, T replace, boolean found) {
		throw new RuntimeException("Inte riktigt färdig.");
	}

}
