import java.util.Comparator;

class ListComparator implements Comparator<String> {

	/**
	 * Compares string by string length.
	 */
	@Override
	public int compare(String o1, String o2) {
		return(o1.length() - o2.length());
	}
	
}