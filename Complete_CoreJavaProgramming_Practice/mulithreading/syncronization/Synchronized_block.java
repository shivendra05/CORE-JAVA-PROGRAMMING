package com.practice.mulithreading.syncronization;

/* 
 * With Synchronized keyword
 */
public class Synchronized_block extends Thread {
	/* Synchronized_block have advantage over Synchronized_method 
	 * 
	 * Synchronized_block take less time to complete the task
	 * 
	 * we can declared Synchronized_block as follows
	 
	a)get lock on current object
    synchronized(this) {
		for (int i = 0; i < 5; i++) {
			System.out.print("Good Morning::");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	b)get lock on any particular object
    synchronized(b) {
		for (int i = 0; i < 5; i++) {
			System.out.print("Good Morning::");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	c)get lock on any particular class
    synchronized(Synchronized_block.class) {
		for (int i = 0; i < 5; i++) {
			System.out.print("Good Morning::");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	*/
}
