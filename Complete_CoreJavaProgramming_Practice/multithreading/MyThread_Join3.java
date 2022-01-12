package com.practice.multithreading;

/*
 * deadlock program
 * */
public class MyThread_Join3 extends Thread {

	public static void main(String []args) throws InterruptedException {
		Thread.currentThread().join(); //Deadlock, because thread called join in same thread

		for (int i = 0; i < 5; i++) {
			System.out.println("Parent Thread");
			Thread.sleep(1000);
		}
	}
}