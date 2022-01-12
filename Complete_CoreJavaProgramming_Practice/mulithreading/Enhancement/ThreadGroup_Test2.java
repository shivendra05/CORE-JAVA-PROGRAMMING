package com.practice.mulithreading.Enhancement;

/* 
 * With Synchronized keyword
 * 
 * */
public class ThreadGroup_Test2 extends Thread {
	/*advantage of maintaining thread in group is, we can perform common operation easily.
	 * 
	 * every thread in java belongs to some group, main thread belongs to main group.
	 * every thread group in java is child of either SystemGroup directly or indirectly, Hence SystemGroup acts as root
	 * for all thread group in java
	 * 
	 *  SystemGroupcontains several system level threads like
	 *  finalize, reference handler, signal dispatcher, attached listener
	 *  
	 * ThreadGroup is java class, present in java.lang package and direct child of Object
	 */

	public static void main(String[] args) {
		
		//creates new thread group
		ThreadGroup g= new ThreadGroup("FirstGroup");
		Thread t1= new Thread(g,"ThreadGroup1");
		Thread t2= new Thread(g,"ThreadGroup2");
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		g.setMaxPriority(3);
		Thread t3= new Thread(g,"ThreadGroup3");
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
	}	
}
