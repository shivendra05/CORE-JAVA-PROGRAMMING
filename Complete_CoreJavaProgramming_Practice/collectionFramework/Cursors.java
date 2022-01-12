package com.practice.collectionFramework;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Cursors {
	/* Enumeration limitation::
	 * 1. it can be applied only legacy class and it is not a universal cursor.
	 * 2. we can get only read access, and cant perform remove operation.
	 * 
	 * to overcome above limitation we should go for Iterator(I)
	 * 1. we can apply iterator concept for any collection object hence its universal cursor.
	 * 2. we can get perform read and remove operation.
	 * 
	 * Iterator iterator();
	 * Iterator itr = coll.iterator(); //coll is any collection reference.
	 * 
	 * boolean hasNext();
	 * Object next();
	 * void remove();
	 */
	/* ListIterator(I)::
	 * 
	 * ListIterator(I) is a child interface of Iterator(I)
	 * Using Iterator we can move forward only, not backward direction
	 * Using Iterator we can perform only read and Remove operation. we cant perform replace/addition operation
	 * 
	 * to overcome Iterator we have ListIterator
	 * 
	 * using ListIterator we can move either forward work backward direction hence its bi-directional iterator.
	 * we can perform replacement and addition of new object in addition to read and Remove operations 
	 * 
	 * ListIterator listIterator()
	 *  ListIterator itr = coll.listIterator();
	 * 
	 * boolean hasNext()
	 * Object next()
	 * int nextIndex()
	 * void remove()
	 * boolean hasPrevious()
	 * Object previous()
	 * int previousIndex()
	 * void add()
	 * void set(Object old)
	 */
	public static void main(String[] args) {

		System.out.println("************Iterator");
		List l= new ArrayList();
		for (int i = 0; i < 10; i++) {
			l.add(i);
		}
		System.out.println(l);
		Iterator itr = l.iterator();
		System.out.println("Using Iterator");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("ListIterator Example*******");
		List ll= new LinkedList();
		for (int i = 0; i < 10; i++) {
			ll.add(i);
		}
		
		System.out.println(ll);
		ListIterator listItr = ll.listIterator();
		System.out.println("Using ListIterator");
		System.out.println("******hasNext");
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		System.out.println("******hasPrevious");
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		
		/* 			Enumeration(I)	           			Iterator(I)					ListIterator(I)
		 * -----------------------------------------------------------------------------------
		 * 		Legacy						                 Not a legacy				        Not a Legacy
		 * 		Forward Direction				     Forward Direction			Forward and Backward Direction	
		 * 		colObj.getElements()			     colObj.iterator()			    colObj.listIterator()
		 * 		read()							                 read()/remove()			     read()/remove()/replace()/add()
		 * 	    2 methods						             3 methods				             9 methods
		 */
	}
}