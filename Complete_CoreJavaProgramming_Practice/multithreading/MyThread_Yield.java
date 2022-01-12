package com.practice.multithreading;

public class MyThread_Yield extends Thread {
	@Override
	//defining a thread
	/*
	 * yield() --> pauses the current thread execution and give priority to thread have same priority
	 * if there is no waiting thread or all waiting thread have low priority then same thread can continue it execution.
	 * 
	 * yield() --> pauses current execution and give chance to other same priority thread
	 * 
	 * if multiple thread are waiting with same priority, then we cant expect execution of thread execution order.
	 * 
	 * the thread which is yielded we cant guess its chance to get back its chance, order is totally with processor
	 */
	public void run() {
		//job of thread --executed by child thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}	
}

class Yeild_JoinMain{
	public static void main(String []args) {
		MyThread_Yield t= new MyThread_Yield(); //thread instantiation
		t.start();//starts of a thread
		//executed by main thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Parent Thread");
		}
	}
}