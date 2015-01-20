package se.mejsla.podal.fpvsoo.util;


/**
 * En list hjälpinterface
 */
public interface Lists {

	/**
	 * Här får du en tom lista. 
	 */;
	public  <T> List<T> emptyList();

	/**
	 * Vill du sortera en lista så gör det här. Du får tillbaka en ny lista sorterad. 
	 * @return En ny sorterad lista.
	 */
	<T extends java.lang.Comparable<T>> List<T> sort(List<T> list);

	/**
	 * Här skapar du en lista med argumenten.
	 * @param as elementen att stoppa i listan
	 * @return returnerar en lista med elementen.
	 */
	@SuppressWarnings("unchecked")
	<T> List<T> list(T... as);

}
