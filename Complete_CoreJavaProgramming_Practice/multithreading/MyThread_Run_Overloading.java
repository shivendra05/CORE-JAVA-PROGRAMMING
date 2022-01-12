package com.practice.multithreading;

public class MyThread_Run_Overloading extends Thread {
	/*
	 * run() ---> overloading is possible  but t.start()
	 * will always call no-args run() as a child thread.
	 * 
	 *  other overloaded methods must be called explicitly as a part of main thread
	 * */
	@Override
	//defining a thread
	public void run() {
		//job of thread --executed by child thread
		for (int i = 0; i < 5; i++) {
			System.out.println("No-Arg Method");
		}
	}	
	
	//overloaded method
	public void run(int i) {
		//job of thread --executed by child thread
		for (int j = 0; j < 5; j++) {
			System.out.println("1-Arg Method");
		}
	}	
}

class MyMainThread{
	public static void main(String []args) {
		
		MyThread_Run_Overloading t= new MyThread_Run_Overloading(); //thread instantiation
		t.start();//starts of a thread
		
		//executed by main thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Parent Thread");
		}
	}
}