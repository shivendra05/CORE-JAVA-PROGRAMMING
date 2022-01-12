package com.practice.mulithreading.syncronization;

/* 
 * With Synchronized keyword
 */
public class Synchronized3 {
	/* Synchronized keyword is applicable only for methods and blocks
	 * but not for variable and Class
	 * 
	 * if a method is declared as synchronized then that method allows only one method to use method/block
	 * its advantage, is to avoid data inconsistency. 
	 * 
	 * but it give performance issue.
	 */

	/* internally Synchronized is implemented using lock, every object have a unique lock.
	 * when ever we use Synchronized keyword, then only lock is applicable.
	 * 
	 * if a thread wants to execute Synchronized method, first need to get the lock
	 * then it is allowed to any Synchronized method on that object.
	 * 
	 * once method execution completes thread releases the lock.
	 */

	/* while a thread is executing Synchronized method on a given object then remaining object is not allowed
	 * to execute any Synchronized method on the same object but the remaining threads are allowed to execute 
	 * non-Synchronized method simultaneously.   
	 */

	public void displayN() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void displayC() {
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

class MyThread1 extends Thread{
	Synchronized3 s;
	MyThread1(Synchronized3 s){
		this.s= s;
	}
	
	@Override
	public void run() {
		s.displayN();
	}
}


class MyThread2 extends Thread{
	Synchronized3 s;
	MyThread2(Synchronized3 s){
		this.s= s;
	}
	
	@Override
	public void run() {
		s.displayC();
	}
}

class Synchronized_Main1  {
	public static void main(String []args) {
		Synchronized3 s = new Synchronized3();
		MyThread1 mt1= new MyThread1(s); //thread instantiation
		mt1.start();//starts of a thread

		//Working with multiple Threads

		MyThread2 mt2= new MyThread2(s); //thread instantiation
		mt2.start();//starts of a thread
	}
}