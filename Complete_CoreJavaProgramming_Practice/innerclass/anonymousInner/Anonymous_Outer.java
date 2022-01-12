package com.practice.innerclass.anonymousInner;

//outerClass
class PopCorn{
}

public class Anonymous_Outer {
	/*3. Anonymous Inner Class
	 * 
	 * main purpose of it is just for instance uses(one time uses)
	 * 3.1 Anonymous Inner class that extends a class
	 * 3.2 Anonymous Inner class that implements an interface
	 * 3.3 Anonymous Inner class that defined inside arguments
	 */

	// our class(anonymous) extends PopCorn class(Parent class), and object created (new PopCorn()) for our class or child class(new PopCorn()) object
	PopCorn popCorn = new PopCorn() {

	};

	// our class(anonymous) extends Thread class(Parent class), and object created (new Thread()) for our class or child class(new Thread()) object
	Thread thread = new Thread() {

	};

	// our class(anonymous) implements Runnable Interface(Parent class), and object created (new Runnable()) for our class or child class(new Runnable()) object
	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
		}
	};
}