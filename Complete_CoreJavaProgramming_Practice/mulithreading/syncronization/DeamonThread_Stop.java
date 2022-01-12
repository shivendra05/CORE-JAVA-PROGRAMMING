package com.practice.mulithreading.syncronization;

public class DeamonThread_Stop extends Thread {
	/*
	green thread model..thread which is managed completely by JVM with OS support is called green thread.
	sun Solaris --provides green thread model, green thread model is deprecated and not recommended to use

	the thread which is managed by OS is called Native OS model, 
	windows OS is called Native OS model

	 *we can stop thread execution using stop() of thread class, if we call stop() then thread goes to dead state
	 *step() is deprecated and not recommended to use
	 */

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread:: "+i);
		}
	}

	public static void main(String[] args) {
		//create child/One more Thread
		DeamonThread_Stop dt= new DeamonThread_Stop();

		dt.start();
		System.out.println("Main Thread Closes");
		dt.stop();// stop the thread .. thread moves to dead state
	}	
}
