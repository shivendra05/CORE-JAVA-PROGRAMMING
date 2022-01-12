package com.practice.multithreading;

public class MyThread_start_start extends Thread {
	@Override
	public void run() {
		System.out.println("Child Thread");
	}
}

class StartStartThread1{
	public static void main(String []args) {
		/*
		 * after starting a thread if we are trying to re-start the same thread then we will get run time exception
		 * 	illeagalTHreadExecprion
		 */
		MyThread_start_start t= new MyThread_start_start(); //thread instantiation
		t.start();//starts of a thread
		System.out.println("Parent Thread");
		t.start();
	}
}