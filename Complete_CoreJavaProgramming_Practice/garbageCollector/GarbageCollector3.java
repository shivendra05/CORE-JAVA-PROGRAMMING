package com.practice.garbageCollector;

import java.util.Date;

public class GarbageCollector3 {
	/*
	 *	in old languages like c++ programmer is responsible to create and destroy useless object.
	 *	usually programmer taking very must care while creating object but neglecting destruction of object because of
	 *	this negligence, at certain point for creation of new object sufficient memory may not be available(memory is full with useless objects).
	 *
	 * and application will be down because of memory issue. OutOfMemoryError is very common in c++
	 * 
	 *   but in Java, Programmer is responsible for only creation of object and not responsible for object destruction
	 *   sun has provided assistance for useless object destructions(daemon thread always running in the background). because of this
	 *   assistance failure of java project is very very low. this assistance is nothing but garbage collector.
	 *   
	 * main objective of garbage collector is to destroy useless object.
	 */
	/*
	 * ways to request JVM for GC
	 * 1. By Using System class -> System class contains static method gc() for this purpose
	 * 	System.gc()
	 * 
	 * 2. By Using Runtime Class -> Java Application can communicate with JVM by using Runtime class Object
	 * 			Runtime class present in java.lang package and its a singleton class, we can create Runtime object
	 * 
	 *  	Runtime r = Runtime.getRuntime();
	 *  
	 *  we can call following method with RunTime Object.
	 *  1. r.totalMemory() -> return no. byte total memory available 
	 *  2. r.freeMemory() -> return no. byte memory is free
	 *  3. r.gc() -> calling Garbage collector to free memory.
	 */
	public static void main(String[] args) {
		//case1:: using System class
		//System.gc();

		//case2:: using Runtime Class
		Runtime r= Runtime.getRuntime();
		System.out.println("Total:: "+r.totalMemory());;
		System.out.println("Free:: "+r.freeMemory());;

		for (int i = 0; i < 10000; i++) {
			Date d = new Date();
			d=null;
		}
		System.out.println("Free:: "+r.freeMemory());;
		r.gc();
		System.out.println("Free:: "+r.freeMemory());;
	}
}