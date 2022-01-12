 package com.practice.collectionFramework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Vector;

public class Vector_Stack_Class {
	/*3.Vector --> Underlying data Structure is re-sizable or Growable Array. 
	 *				Allows Duplicate, insertion order preserves, Heterogeneous Data Allowed.
	 *
	 *				Vector class implements Cloneable, RandomAccess and Serializable (I) and --> 
	 *it is synchronized so objects are thread safe.
	 *
	 *add(Object)
	 *add(int index, Object obj)
	 *addElement(Object ele)
	 *remove(Object obj)
	 *clear()
	 *removeElement()
	 *addElementAt(int)
	 *removeAllElement()
	 *int size()
	 *int capacity()
	 * 
	 * Enumeration elements()
	 */
	public static void main(String[] args) {
		Vector vector = new Vector();
		System.out.println(vector.capacity());
		
		for (int i = 0; i < 10; i++) {
			vector.addElement(i);
		}
		System.out.println(vector.capacity());
		vector.add('a');
		System.out.println(vector.capacity());
		System.out.println(vector);
		Enumeration enm = vector.elements();
		
		while(enm.hasMoreElements()) {
			Integer i=(Integer)enm.nextElement();
			System.out.println(i);
		}
	}
	
	/*
	 *3.Stack --> Underlying data Structure is re-sizable or Growable Array. 
	 *				Allows Duplicate, insertion order preserves, Heterogeneous Data Allowed.
	 *
	 *				Vector class implements Cloneable, RandomAccess and Serializable (I) and --> 
	 *it is synchronized so objects are thread safe.
	 * 
	 * Stack stack = new Stack()
	 * void	push(object)
	 * Object pop()
	 * Object peek()
	 * int search()
	 * boolean empty()
	 * 
	 * Enumeration elements()
	 */
}