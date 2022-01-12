package com.practice.collectionFramework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.TreeSet;
import java.util.Vector;

public class Set_Interface {
	/*Set --> Set is  child interface of Collection(I), if we want to represent a group of individual object as a single entity
	 *		where duplicate isnt allowed, insertion order isnt preserved.
	 *
	 *Set Interface doesnt contains any new methods it have collection(I) methods
	 *1. HasSet -> user line data Structures is hashTable, duplicate not allowed, insertion order not preserved, Null insertion is possible allowed(only once),
	 * 					Heterogeneous allowed. 
	 * 			used for search as a frequent operation,
	 * if we try to insert duplicate, we wont get any error (add() will return false.)
	 */

	/* 		HashSet							                                          LinkedHashSet
	 * -------------------------------------------------------------------------------------------------
	 *	Hash Table								                                   Hash Table+LinkedList
	 * Insertion Order Not preserved			                       Insertion Order preserved
	 */

	/* SortedSet(I):: is a child interface of Set, if we want to represent group of individual objects according to some 
	 * 				sorting without duplicate, then we should go for sorted set.
	 * 
	 * SortedSet(I)-- defines following methods..
	 * first()
	 * last()
	 * headSet()
	 * tailSet()
	 * SubSet(int, int)
	 * 
	 * comparator() -- internal sorting technique
	 */

	/* TreeSet(I):: underlying DS is Balanced Tree, duplicate not allowed, heterogeneous object not allowed, 
	 * 				insertion order not preserved, null insertion possible only once.
	 * TreeSet implements Serializable, Cloneable but not RandomAccess.
	 * 
	 * All element will be inserted based on some sorting order, it may be default natural sorting or customized order.
	 * 
	 * TreeSet ts = new TreeSet() -> Default Natural Sorting order
	 * TreeSet ts = new TreeSet(Comparator) -> Customized Natural Sorting order specified by Comparator Object.
	 * TreeSet ts = new TreeSet(Collection )
	 * TreeSet ts = new TreeSet(SortedSet)
	 * 
	 * comparator() -- internal sorting technique
	 */
	public static void main(String[] args) {

		HashSet hset = new HashSet();
		hset.add("A");
		hset.add("B");
		hset.add("C");
		hset.add("D");
		hset.add(null);
		hset.add("A");

		System.out.println("HashSet:: "+hset);

		LinkedHashSet lhSet= new LinkedHashSet();
		lhSet.add("A");
		lhSet.add("B");
		lhSet.add("C");
		lhSet.add("D");
		lhSet.add(null);
		lhSet.add("A");

		System.out.println("Link edHashSet:: "+lhSet);

		TreeSet tSet= new TreeSet();
		tSet.add("A");
		tSet.add("B");
		tSet.add("C");
		tSet.add("D");
		//tSet.add(null);
		tSet.add("A");

		System.out.println("Tree Set:: "+tSet);

		TreeSet tSetSB= new TreeSet();
		tSetSB.add(new StringBuffer("AA"));
		tSetSB.add(new StringBuffer("BB"));
		tSetSB.add(new StringBuffer("CC"));
		tSetSB.add(new StringBuffer("DD"));
		//tSet.add(null);
		tSetSB.add(new StringBuffer("AA"));
		System.out.println("Tree Set:: "+tSetSB);
	}
}