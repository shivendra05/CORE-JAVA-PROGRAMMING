package com.practice.multithreading;

public class MyThread_Sleep_interrupt extends Thread {
/*Thread.sleep(1000);
 * 
 * 1. after completion of sleep time
 * 2. after getting interrupted --> public void interrupt()
 */
	@Override
	//defining a thread
	public void run() {
		//job of thread --executed by child thread
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("I am lazy thread");
				Thread.sleep(2000);
			}
		}catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted");
		}
	}	
}

class Interrupt_Main{
	public static void main(String []args) {
		MyThread_Sleep_interrupt t= new MyThread_Sleep_interrupt(); //thread instantiation

		t.start();//main thread starts child thread
		/* A thread get interrupted only when thread goes to sleep .. Thread.sleep().
		 */

		t.interrupt(); // main thread starts interrupted 
		//executed by main thread
		System.out.println("Main Thread ends");
	}
}