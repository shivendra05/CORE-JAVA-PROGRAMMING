package com.practice.garbageCollector;

public class GarbageCollector2 {
	/*in old languages like c++ programmer is responsible to create and destroy useless object.
	 *	usually programmer taking very much care while creating object but neglecting destruction of object because of
	 *	this negligence, at certain point for creation of new object sufficient memory may not be available(memory is full with useless objects).
	 *
	 * and application will be down because of memory issue. OutOfMemoryError is very common in c++
	 * 
	 *   but in Java programmer is responsible for only creation of object and not responsible for object destruction
	 *   sun has provided assistance for useless object destructions(daemon thread always running in the background). because of this
	 *   assistance failure of java project is very very low. this assistance is nothing but grabage collector.
	 *   
	 * main objective of garbage collector is to destroy useless object.
	 */
	/*making object eligible for Garbage collector
	 *	 Event hough programmer is not responsible to destroy useless objects it is highly recommended to make an object eligible 
	 * for GC if object is no longer required.
	 *
	 *  an object is said to be eligible for GC iFF it doesnt contains any reference variable
	 *  
	 *  the following are ways to make an object eligible for GC.
	 *  
	 *  1. Nullifying the reference variable --> if an object is no longer required then assign null to all its reference variable
	 *  		to make it eligible for GC.
	 *  2. ReAssigning Object reference to another Object --> if an object is on longer required then re-assign its reference variable to
	 *  		some other object then old object by default eligible for GC
	 *  3. objects created inside a method, be default eligible for GC, once method completes.
	 *  4. If all references are internal reference then also object are eligible for GC
	 */

	GarbageCollector2 i;
	public static void main(String[] args) {
		GarbageCollector2 cg1 = new GarbageCollector2();
		GarbageCollector2 cg2 = new GarbageCollector2();
		GarbageCollector2 cg3 = new GarbageCollector2();
		cg1.i=cg2;
		cg2.i=cg3;
		cg3.i=cg1;
		//If all references are internal reference then also object are eligible for GC
		cg1=null;
		cg2=null;
		cg3=null;
		//If all references are internal reference then also object are eligible for GC
	}
}