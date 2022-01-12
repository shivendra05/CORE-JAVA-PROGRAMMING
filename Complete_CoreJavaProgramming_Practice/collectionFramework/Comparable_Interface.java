package com.practice.collectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparable_Interface {
	/* Comparable(I) -->it is present in java.lang and it contains only one method compareTo()
	 * 
	 * obj1.compareTo(obj2)
	 * Obj1 --> New item about to insert
	 * Obj2 --> already inserted Element
	 * return -ve --> iff obj1 comes before obj2
	 * return +ve --> iff obj1 comes after obj2
	 * return 0 --> iff obj1 and obj2 are equals
	 */
	
	/* Comparable mean for default sorting order --> have compareTo() only method..java.lang
	 * Comparator meant for customized sorting order --> have compare() and equal() 2 methods.. java.util
	 * 
	 * compare(Object obj1, Object obj2)
	 * 
	 * return -ve --> iff obj1 comes before obj2
	 * return +ve --> iff obj1 comes after obj2
	 * return 0 --> iff obj1 and obj2 are equals
	 * boolean equal(Object)
	 */
	public static void main(String[] args) {
		System.out.println("A".compareTo("B"));//"A" new item about to insert, "B" old item
		System.out.println("Z".compareTo("B"));//"Z" new item about to insert, "B" old item
		System.out.println("A".compareTo("A"));//"A" new item about to insert, "A" old item
		TreeSet ts = new TreeSet();
		ts.add("B");
		ts.add("A");
		ts.add("V");
		ts.add("X");
		ts.add("C");
		System.out.println(ts);
		
		TreeSet treeSet = new TreeSet(new MyComparator());
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(5);
		treeSet.add(1);
		treeSet.add(3);
		System.out.println(treeSet);
	}
}

class MyComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		int value1 = (Integer)o1;
		int value2 = (Integer)o2;
		if(value1<value2)
			return +1;
		else if(value1>value2)
			return -1;
		else
			return 0;
	}
}