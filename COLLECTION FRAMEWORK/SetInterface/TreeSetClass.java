package SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		//child of SortedSet Interface
		//It uses Balanced Tree as underlaying Data Structure. Provides natural sorting order...Character
		//If it is a number...Ascending order.
		TreeSet ts = new TreeSet();
		ts.add("Shiv");
		ts.add("Ram");
		ts.add("Hanumaan");
		ts.add("Lakshman");
		ts.add("Balram");
		ts.add("Krishna");
		ts.add("Krishna");//Duplicate not allowed Since it implements Set
		//null not alllowed
		System.out.println("LinkedHashSet Stored elements: Before removal: "+ts);
	}
}