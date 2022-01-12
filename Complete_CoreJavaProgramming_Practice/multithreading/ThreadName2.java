package com.practice.multithreading;

public class ThreadName2 extends Thread {
	
	@Override
	//defining a thread
	public void run() {
		//job of thread --executed by child thread
			System.out.println("child block -- Thread Name::"+Thread.currentThread().getName());
	}	
}

class ThreadNameMain2{
	public static void main(String []args) {
		System.out.println(Thread.currentThread().getName());
		
		ThreadName2 t= new ThreadName2();
		t.start();
		
		System.out.println("Main Block-- Thread Name::"+Thread.currentThread().getName());;
	}
}