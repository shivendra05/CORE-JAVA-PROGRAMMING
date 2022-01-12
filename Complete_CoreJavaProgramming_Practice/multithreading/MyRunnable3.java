package com.practice.multithreading;

public class MyRunnable3 extends Thread {
	//defining a thread
	public void run() {
		//job of thread --executed by child thread
		System.out.println("Child Thread");
	}	
}

class MainRunnable2{
	public static void main(String []args) {
		MyRunnable3 mr= new MyRunnable3(); //thread instantiation

		Thread t1= new Thread(mr);

		//case::1 -->new thread will be created and responsible for execution of thread class run() which has empty implementation.
		t1.start();
		
		//case::2 -->new thread will be created and responsible for execution of thread class run() which has empty implementation.
		mr.start();
		//executed by main thread
		System.out.println("Main Thread");
	}
}