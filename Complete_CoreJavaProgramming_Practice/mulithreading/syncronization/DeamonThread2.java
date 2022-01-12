package com.practice.mulithreading.syncronization;

public class DeamonThread2 extends Thread {
	/*
	 * the thread which are executing in the background
	 * 1. Garbage collector
	 * 2. signal dispatcher
	 * 3. Attached Listener
	 * 
	 * purpose of Daemon thread(BackGround thread) is to provide support to non-Daemon/main thread(foreGround thread)
	 * if memory is free then Daemon thread make memory free.
	 * 
	 * usually Daemon thread have low priority, based on need can work with high priority.
	 *  to check whether a thread is a Daemon or not use isDaemon(). to set a thread as Daemon, use setDaemon(boolean b).
	 *  
	 *  its impossible to change Daemon nature of Main thread, because its already started by JVM at the beginning.
	 *  If main thread terminates all child/Daemon thread will be closed/terminated forcefully
	 */

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Child Thread:: "+i);
		}
	}

	public static void main(String[] args) {
		//create child/One more Thread
		DeamonThread2 dt= new DeamonThread2();

		//check whether child/new thread is daemon or not
		System.out.println(dt.isDaemon());

		//set child/new thread as Daemon. 
		//If main thread terminates all child/Daemon thread will be closed/terminated forcefully
		dt.setDaemon(true);
		System.out.println("Daemon Thread Priority::"+dt.getPriority());
		dt.start();
		
		System.out.println("Main Thread Closes");
	}	
}
