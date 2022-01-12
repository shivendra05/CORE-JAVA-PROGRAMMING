package com.practice.mulithreading.syncronization;

/* 
 * With Synchronized keyword
 */
public class Synchronized_block_this {
	/*
	 * Synchronized_block have advantage over Synchronized_method 
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

/*	//a)get lock on current object
	public void displayC() {
		System.out.println(" Print Alphabets with 2 threads"+Thread.currentThread().getName());
		synchronized (this) {
			System.out.println(" Syn Block started "+Thread.currentThread().getName());
			for (int i = 65; i < 75; i++) {
				System.out.print((char) i);
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}*/

	//a)get lock on current class Object
	public void displayC() {
		System.out.println(" Print Alphabets with 2 threads"+Thread.currentThread().getName());
		synchronized (Synchronized_block_this.class) {
			System.out.println(" Syn Block started "+Thread.currentThread().getName());
			for (int i = 65; i < 75; i++) {
				System.out.print((char) i);
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}
}

class MyThread_this extends Thread{
	Synchronized_block_this s;

	MyThread_this(Synchronized_block_this s){
		this.s= s;
	}

	@Override
	public void run() {
		s.displayC();
	}
}

class Synchronized_Main_this  {
	public static void main(String []args) {
		Synchronized_block_this s = new Synchronized_block_this();
		MyThread_this mt1= new MyThread_this(s); //thread instantiation
		MyThread_this mt2= new MyThread_this(s); //thread instantiation
		mt1.start();//starts of a thread
		mt2.start();//starts of a thread
	}
}