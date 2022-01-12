package com.practice.mulithreading.Enhancement;

/* 
 * With Synchronized keyword
 */
public class ThreadGroup_Test extends Thread {
	/*advantage of maintaining thread in group is, we can perform common operation easily.
	 * 
	 * every thread in java belongs to some group, main thread belongs to main group.
	 * every thread group in java is child of either SystemGroup directly or indirectly, Hence SystemGroup acts as root
	 * for all thread group in java
	 * 
	 *  SystemGroup contains several system level threads like
	 *  finalize, reference handler, signal dispatcher, attached listener
	 *  
	 *  ThreadGroup is java class, present in java.lang package and direct child of Object
	 */

	public static void main(String[] args) {
		//main thread group name
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		//main thread group parent name
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		//creates new thread group
		ThreadGroup g= new ThreadGroup("FirstGroup");
		System.out.println(g.getName());
		System.out.println(g.getParent().getName());
		
		//creating child threadGroup g
		ThreadGroup g1= new ThreadGroup(g,"SecondGroup");
		System.out.println(g1.getName());
		System.out.println(g1.getParent().getName());
	}	
}
