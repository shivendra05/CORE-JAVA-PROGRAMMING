package com.practice.garbageCollector;

public class GarbageCollector {
	/*	in old languages like c++, programmer is responsible to create and destroy useless object.
	 *	usually programmer taking very much care while creating object but neglecting on destruction of object because of
	 *	this negligence, at certain point for creation of new object sufficient memory may not be available(memory is full with useless objects).
	 *
	 * and application will be down because of memory issue. OutOfMemoryError is very common in c++
	 * 
	 *   but in Java,  Programmer is responsible only for creation of object and not responsible for object destruction
	 *   sun has provided assistance for useless object destructions(daemon thread always running in the background). because of this
	 *   assistance failure of java project is very very low. this assistance is nothing but garbage collector.
	 *   
	 * main objective of garbage collector is to destroy useless object.
	 */
	/* making object eligible for Garbage collector
	 *	 Even though programmer is not responsible to destroy useless objects it is highly recommended to make an object eligible 
	 *for GC if object is no longer required.
	 *
	 *  an object is said to be eligible for GC, iFF it doesnt contains any reference variable
	 *  
	 *  the following are ways to make an object eligible for GC.
	 *  
	 *  1. Nullifying the reference variable --> if an object is no longer required then assign null to all its reference variable
	 *  		to make it eligible for GC.
	 *  2. ReAssigning Object reference to another Object --> if an object is on longer required then re-assign its reference variable to
	 *  		some other object then old object by default eligible for GC
	 *  3. objects created inside a method, be default eligible for GC, once method completes.
	 */

	public static void main(String[] args) {
		GarbageCollector cg1 = new GarbageCollector();
		GarbageCollector cg2 = new GarbageCollector();
		GarbageCollector cg3 = new GarbageCollector();

		//Case1:: Nullifying the reference variable
		cg1 = null;//making object eligible for GC
		cg2 = null;//making object eligible for GC
		cg3 = null;//making object eligible for GC
		//3 object eligible for GC

		//Case2:: ReAssigning Object reference to another Ojbect
		GarbageCollector cg4 = new GarbageCollector();
		GarbageCollector cg5 = new GarbageCollector();

		cg4 = new GarbageCollector(); // new object created and reference given to cg4 since cg4 has completed its work
		cg5=cg4;// new object created and reference given to cg4 since cg4 has completed its work
		//2 object eligible for GC
	}

	public void m1() {
		//object created inside method/local are eligible for GC after completion of method execution.
		GarbageCollector cg1 = new GarbageCollector();
		GarbageCollector cg2 = new GarbageCollector();
		//2 object eligible for GC		
	}
}