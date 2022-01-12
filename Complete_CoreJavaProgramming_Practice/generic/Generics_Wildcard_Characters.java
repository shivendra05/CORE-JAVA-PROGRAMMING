package com.practice.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Generics_Wildcard_Characters {

	/*1. intro
	 *2. Generic classes
	 *3. Bounded Types
	 *4. Generic Methods and Wildcard character
	 *5. Communication with Generic Code
	 *
	 * Generic Methods and Wildcard character(?)
	 * --------------------------------------------------------
	 * m1(ArrayList<String> al) -> we can call this method by passing ArrayList only String type
	 * but within the method we can add only String type of object to List, but if we add any other type then we will get compile time error.
	 * 
	 * m1(ArrayList<?>) -> we can call this method by passing ArrayList(Any Unknown/any Type)
	 * but within the method we cant add anything to the list except null, because we dont know the type exactly. Null is allowed because its valid for any type.
	 * 
	 * this methods are best suitable for reading purpose.
	 * 
	 * m1(ArrayList<? extends X>) ->X can be either class or interface, if X is a class then we can call this method by passing ArrayList either
	 * ArrayList or its child class, if X is an interface then we cant call this method by passing ArrayList type or its implementation type
	 * 
	 * but within the method we cant add anything to the list except null, because we dont know the type of X excatly.
	 * this type of method is best suitable for read only operation.
	 */
	
	//Case1
	public void m1(ArrayList<String> al){
		al.add("sihv");
		al.add(null);
		//al.add(10); invalid because type is String
	}

	//Case2
	public void m2(ArrayList<?> al){
		al.add(null);
		//al.add("Shivendra");
		/*ArrayList<String> l = new ArrayList<String>();
			l.add("Shivendra");
			ArrayList<Number> n = new ArrayList<Number>();
			n.add(10);
			n.add(100);
			n.add(10.4);*/
	}

	//Case3
	public void m3(ArrayList<?> al X){
		al.add(null);
		//
		/*ArrayList<String> l = new ArrayList<String>();
				l.add("Shivendra");
				ArrayList<Number> n = new ArrayList<Number>();
				n.add(10);
				n.add(100);
				n.add(10.4);*/
	}

	//Case4
	public void m3(ArrayList<?> super X){
		al.add(null);
		//
		/*ArrayList<String> l = new ArrayList<String>();
					l.add("Shivendra");
					ArrayList<Number> n = new ArrayList<Number>();
					n.add(10);
					n.add(100);
					n.add(10.4);*/
	}
}
