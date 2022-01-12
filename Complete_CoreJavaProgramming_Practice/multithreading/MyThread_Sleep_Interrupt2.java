package com.practice.multithreading;

public class MyThread_Sleep_Interrupt2 extends Thread {
	/*Thread.sleep(1000);
	 * 
	 * 1. after completion of sleep time
	 * 2. after getting interrupted --> public void interrupt()
	 */

	@Override
	//defining a thread
	public void run() {
		//job of thread --executed by child thread
		for (int i = 0; i < 1000; i++) {
			System.out.println("I am lazy thread::"+i);
		}
		System.out.println("Outside Lazy loop");
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted");
		}
	}	
}

class Interrupt_Main1{
	public static void main(String []args) {
		MyThread_Sleep_Interrupt2 t= new MyThread_Sleep_Interrupt2(); //thread instantiation
		t.start();//main thread starts child thread

		/*A thread get interrupted only when thread goes to sleep .. Thread.sleep().
		 * 
		 * below code will print 1000 times "I am lazy Thread" and then outside Lazy loop 
		 * as Thread.sleep() comes JVM will invoke Interrupted exception
		 */
		t.interrupt(); // main thread starts interrupted 
		//executed by main thread
		System.out.println("Main Thread ends");
	}
}