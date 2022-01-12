package com.practice.multithreading;

public class MyThread_default_run extends Thread {
	/*if we dont override Thread class run(), then Thread class run() will be executed which has empty implementation
	 * hence we wont get any output. 
	 */
	/* it is highly recommended to override run(), other wise dont go for multi-threading
	 */
}

class DefaultRunThread{
	public static void main(String []args) {
		
		MyThread_default_run t= new MyThread_default_run(); //thread instantiation
		t.start();//starts of a thread
		
		//executed by main thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Parent Thread");
		}
	}
}