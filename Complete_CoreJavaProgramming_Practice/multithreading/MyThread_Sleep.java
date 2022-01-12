package com.practice.multithreading;

public class MyThread_Sleep extends Thread {
	public static void main(String []args) throws InterruptedException {
		/* Thread.sleep(1000);
		 * 
		 * 1. after completion of sleep time
		 * 2. after getting interrupted --> public void interrupt()
		 */
		//executed by main thread
		for (int i = 0; i < 10; i++) {
			System.out.println("slide--"+i);
			Thread.sleep(1000);
		}
	}
}