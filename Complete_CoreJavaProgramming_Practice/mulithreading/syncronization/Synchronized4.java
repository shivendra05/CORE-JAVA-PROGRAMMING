package com.practice.mulithreading.syncronization;

/* 
 * With Synchronized keyword
 * 
 * */
public class Synchronized4 {
	/*
	 * Synchronized keyword is applicable only for methods and blocks
	 * but not for variable and Class
	 * 
	 * if a method is declared as synchronized then that method allows only one method to use method/block
	 * its advantage, is to avoid data inconsistency. 
	 * 
	 * but it give performance issue.
	*/


	/*
	 * internally Synchronized is implemented using lock, every object have a unique lock.
	 * when ever we use Synchronized keyword, then only lock is applicable.
	 * 
	 * if a thread wants to execute Synchronized method, first need to get the lock
	 * then it is allowed to any Synchronized method on that object.
	 * 
	 * once method execution completes thread releases the lock.
	 */

	/*
	 * while a thread is executing Synchronized method on a given object then remaining object is not allowed
	 * to execute any Synchronized method on the same object but the remaining threads are allowed to execute 
	 * non-Synchronized method simultaneously.   
	 */

	 synchronized public void displayN() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	 synchronized public void displayC() {
		for (int i = 65; i < 75; i++) {
			System.out.print((char) i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread11 extends Thread{
	Synchronized4 s;
	MyThread11(Synchronized4 s){
		this.s= s;
	}
	
	@Override
	public void run() {
		s.displayN();
	}
}

class MyThread22 extends Thread{
	Synchronized4 s;
	MyThread22(Synchronized4 s){
		this.s= s;
	}
	
	@Override
	public void run() {
		s.displayC();
	}
}

class Synchronized_Main11  {
	public static void main(String []args) {
		Synchronized4 s = new Synchronized4();
		
		MyThread11 mt1= new MyThread11(s); //thread instantiation
		mt1.start();//starts of a thread

		//Working with multiple Threads
		MyThread22 mt2= new MyThread22(s); //thread instantiation
		mt2.start();//starts of a thread
	}
}