package com.practice.multithreading;

public class MyThread extends Thread {
	@Override
	//defining a thread
	public void run() {
		//job of thread --executed by child thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}	
}

class MainThread{
	public static void main(String []args) {
		MyThread t= new MyThread(); //thread instantiation
		t.start();//starts of a thread
		
		//executed by main thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Parent Thread");
		}
	}
}