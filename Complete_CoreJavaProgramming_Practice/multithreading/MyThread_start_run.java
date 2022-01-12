package com.practice.multithreading;

public class MyThread_start_run extends Thread {
	/*if we override start(), then our start() will be executed just like a normal methods and
	 * new thread wont be created
	 */
	public void start() { 
		System.out.println("start method"); 
	}

	@Override
	public void run() {
		System.out.println("Child Thread");
	}
}
class StartRunThread{
	public static void main(String []args) {
		MyThread_start_run t= new MyThread_start_run(); //thread instantiation
		t.start();//starts of a thread class start() will be called.. 
		//executed by main thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Parent Thread");
		}
	}
}