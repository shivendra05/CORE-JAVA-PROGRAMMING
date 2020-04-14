package SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
//child class of HashSet
//It uses LinkedList + HashTable as underlaying Data Structure.
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Shiv");
		lhs.add('A');
		lhs.add(10);
		lhs.add(12.3);
		lhs.add(true);
		lhs.add(200);
		lhs.add(10);//Duplicate not allowed
		lhs.add(null);
		System.out.println("LinkedHashSet Stored elements: Before removal: "+lhs);
		lhs.remove(2);
		System.out.println("LinkedHashSet Stored elements: After removal: "+lhs);
		
	}
}