package SetInterface;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
//child of Set interface
//It uses HashTable as underlaying Data Structure.
		HashSet hs = new HashSet();
		hs.add("Shiv");
		hs.add('A');
		hs.add(10);
		hs.add(12.3);
		hs.add(true);
		hs.add(200);
		hs.add(10);//Duplicate not allowed
		hs.add(null);
		System.out.println("HashSet Stored elements: Before removal: "+hs);
		hs.remove(2);
		System.out.println("HashSet Stored elements: After removal: "+hs);
		
	}
}