package com.practice.multithreading;

public class MyRunnable2 implements Runnable {
	//defining a thread
	public void run() {
		//job of thread --executed by child thread
		System.out.println("Runnable --> Child Thread");
	}	
}

class MainRunnable1{
	public static void main(String []args) {
		MyRunnable2 mr= new MyRunnable2(); //thread instantiation

		Thread t1= new Thread();
		Thread t2= new Thread(mr);//target runnable-- because we want to run runnable class run()

		//case::1 -->new thread will be created and responsible for execution of thread class run() which has empty implementation.
		t1.start();

		//case::2 -->No new thread will be created and thread class run() will be executed just like a normal method call.
		t1.run();

		//case::3 -->new thread will be created and responsible for execution of Runnable class run() which has empty implementation.
		t2.start();

		//case::4 -->No new thread will be created and myRunnbale class run() will be executed just like a normal method call.
	t2.run();

		//case::5 -->compile time error, myRunnable class doesnt have start capability
		//mr.start();

		//case::6 -->No new thread will be created and myRunnbale class run() will be executed just like a normal method call.
	mr.run();

		//executed by main thread
		System.out.println("Main Thread");
	}
}