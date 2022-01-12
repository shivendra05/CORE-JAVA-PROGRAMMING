package com.practice.collectionFramework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class Collection_Interface_ArrayList_LinkedList {
	/* 1.Collection(I) --> if we want to represent group of individual object as a single entity then we go for collection.
	 * 		Collection(I), defines most common method which are applicable for any collection object.
	 * 		in general Collection(I) considered as root interface of a Collection Framework.
	 * add(Object)
	 * addAll(Object)
	 * remove(Object)
	 * removeAll(Object)
	 * clear()
	 * retainAll(Object)
	 * Iterator iterator()
	 */

	/*2.List(I) --> is child interface of collection, if we want to represent group of individual object as a single 
	 * 		entity, where duplicates are allowed and insertion order is preserved then we go for List.
	 * 
	 * Implementation classes of List(I)-- > ArrayList, LinkedList, Vector(legacy class jdk1.0), Stack(legacy class jdk1.0)
	 * 
	 * add(Object)
	 * addAll(Object)
	 * get(Object)
	 * indexOf(Object)
	 * LastIndexOf(Object)
	 * ListIterator listIterator()
	 */

	/*3.ArrayList --> Under line data Structure is Array. Allows Duplicate, insertion order preserves, Heterogeneous Data Allowed
	 *				ArryaList and vector class implements RandomAccess (I) --> for fast access 
	 * 
	 * add(Object)
	 * addAll(Object)
	 * get(Object)
	 * indexOf(Object)
	 * LastIndexOf(Object)
	 * ListIterator listIterator()
	 */

	/*RandomAccess (I) -> it is present in java.utli package, and it doesnt contain any method,
	 *it is a marker interface. where required ability will be automatically provided by JVM. 
	 */
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();

		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);

		System.out.println(ll instanceof Serializable);
		System.out.println(ll instanceof Cloneable);
		System.out.println(ll instanceof RandomAccess);
	}

	/* ArrayList is the best choice if the frequent operation is retrieval operation because ArrayLst implements RandomAccess interface.
	 * 
	 * ArrayList is the worst choice id the frequent operation is insertion in the middle.
	 */

	/*			ArrayList			                  	vs 		             			Vector
	 * ----------------------------------------------------------------------------------------------
	 * non Legacy												                       	Legacy
	 * Every method present in ArrayList is 						Every method present in ArrayList is synchronized
	 * non- Synchronized														Synchronized 
	 * Not Thread Safe												            Thread Safe
	 * Performance is high											            Performance is low
	 */

	/*3.LinkedList --> Under line data Structure is Doubly List. Allows Duplicate, insertion order preserves, Heterogeneous Data Allowed
	 *				LinkedList class implements Cloneble and Serializable (I) --> for fast access 
	 * best choice when our frequent operation is insertion in the middle, but worst choice when frequent operation is retrieval
	 * 
	 * LinkedList specific methods to support Stack and Queue
	 * 
	 * void addFirst()
	 * void addLast()
	 * Object getFirst()
	 * Object getLast()
	 * Object removeFirst()
	 * Object removeLast()
	 */

	/*			ArrayList			                               	vs 		             			LinkedList
	 * -----------------------------------------------------------------------------------------------------------
	 * RandomAccess interface impl									RandomAccess interface isnt impl
	 * preferred if frequent operation is 							preferred if frequent operation is 
	 *                           Retrieval 													             insertion or deletion in middle
	 * Worst choice if insertion at the middle					Worst choice if retrieval
	 * (because of shift of Objects)
	 * ArrayList element stored in continuous memory	LinkedList Elements wont be stored on non-contineou  
	 * 									location														memory location.
	 */

	/*3.Vector --> Under line data Structure is Array. Allows Duplicate, insertion order preserves, Heterogeneous Data Allowed
	 * best choice when our frequent operation is insertion in the middle, but worst choice when frequent operation is retrieval
	 * 
	 * LinkedList specific methods to support Stack and Queue
	 */
}