package MapInterface;

import java.util.Comparator;

public class TreeMapWithCompratorImpl implements Comparator{

	public int compare(Object o1, Object o2) {
		String str1 =  o1.toString();
		String str2 =  o2.toString();
		//return str1.compareTo(str2);
		//return -str2.compareTo(str1);
		return -str1.compareTo(str2);
		///return str2.compareTo(str1);
		
	}
}