package com.practice.multithreading;

public class MyRunnable implements Runnable {
	//defining a thread
	public void run() {
		//job of thread --executed by child thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Runnable --> Child Thread");
		}
	}	
}

class MainRunnable{
	public static void main(String []args) {
		MyRunnable mr= new MyRunnable(); //thread instantiation
		Thread t= new Thread(mr);//target runnable-- because we want to run runnable class run()
		t.start();//starts of a thread
		
		//executed by main thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
	}
}