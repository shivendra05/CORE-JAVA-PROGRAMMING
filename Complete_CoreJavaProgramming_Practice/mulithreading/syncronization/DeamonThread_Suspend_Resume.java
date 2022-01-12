package com.practice.mulithreading.syncronization;

public class DeamonThread_Suspend_Resume extends Thread {
	/*we can suspend a thread using suspend() of thread class, immediately thread moves to suspend stage.
	 *we can resume a thread using resume() of thread class then suspended thread can continue its execution.
	 *
	 *anyways these methods are deprecated and not recommended to use
	 */
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread:: "+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		//create child/One more Thread
		DeamonThread_Suspend_Resume dt= new DeamonThread_Suspend_Resume();
		dt.start();
		System.out.println("Main Thread Closes");
		dt.suspend();//stopped execution and moved to ready state
		System.out.println("thread suspended;");
		Thread.sleep(20000);
		dt.resume();//again started execution and moved to running state
	}	
}