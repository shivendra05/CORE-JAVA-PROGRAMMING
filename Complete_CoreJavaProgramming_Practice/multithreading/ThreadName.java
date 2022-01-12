package com.practice.multithreading;

public class ThreadName extends Thread {
	@Override
	//defining a thread
	public void run() {
		//job of thread --executed by child thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}	
}

class ThreadNameMain{
	public static void main(String []args) {
		System.out.println(Thread.currentThread().getName());
		
		ThreadName t= new ThreadName(); //thread instantiation
		System.out.println(t.getName());;
		
		t.setName("Pavan Kalyan");
		Thread.currentThread().setName("RamCharan");
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getName());
	}
}