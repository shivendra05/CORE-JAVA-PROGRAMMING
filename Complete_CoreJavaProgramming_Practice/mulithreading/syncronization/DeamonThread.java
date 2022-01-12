package com.practice.mulithreading.syncronization;

/* 
 * With Synchronized keyword
 */
public class DeamonThread extends Thread {
	/*the thread which are executing in the background
	 * 1. Garbage collector
	 * 2. signal dispatcher
	 * 3. Attached Listener
	 * 
	 * purpose of Daemon thread(BackGround thread) is to provide support to non-Daemon/main thread(foreGround thread)
	 * if memory is not free then Daemon thread make memory free.
	 * 
	 * usually Daemon thread have low priority, based on need can work with high priority.
	 * 
	 *  to check whether a thread is a Daemon or not use isDaemon().
	 *  to set a thread as Daemon, use setDaemon(boolean b).
	 *  
	 *  its impossible to change Daemon nature of Main thread, because its already started by JVM at the beginning.
	 *  
	 *  If main thread terminates all child/Daemon thread will be closed/terminated forcefully
	 */

	public static void main(String[] args) {
		//check whether main thread is daemon or not
		System.out.println(Thread.currentThread().isDaemon());
		
		//set main thread as Daemon.
		//Thread.currentThread().setDaemon(true);
		
		//create child/One more Thread
		Thread t= new Thread();
		
		//check whether child/new thread is daemon or not
		System.out.println(t.isDaemon());

		//set child/new thread as Daemon.
		t.setDaemon(true);
		
		//check whether child/new thread is daemon or not
		System.out.println(t.isDaemon());
		//check priority of Daemon thread
		System.out.println(t.getPriority());
	}	
}