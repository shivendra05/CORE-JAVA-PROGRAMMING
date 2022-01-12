package com.practice.multithreading;

public class MyThread_start_run2 extends Thread {

	/*if we override start(), then our start() will be executed just like a normal methods and
	 * new thread wont be created
	 */
	public void start() {
		super.start();
		System.out.println("start method");
	}

	@Override
	public void run() {
		System.out.println("Child Thread");
	}
}

class StartRunThread1{
	public static void main(String []args) {
		MyThread_start_run2 t= new MyThread_start_run2(); //thread instantiation
		t.start();//starts of a thread
		//executed by main thread
		System.out.println("Parent Thread");
	}
}