package com.practice.mulithreading.syncronization;

/* 
 * With Synchronized keyword
 */
public class NonSynchronized extends Thread {
	/*
	 * Synchronized keyword is applicable only for methods and blocks
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
	String name;
	NonSynchronized(String name){
		this.name=name;
	}
	
	public static void wish(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("Good Morning::");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}

	@Override
	public void run() {
		NonSynchronized.wish(name);
	}	
}

class NonSynchronized_Main{
	public static void main(String []args) {

		NonSynchronized t= new NonSynchronized("Dhoni"); //thread instantiation
		t.start();//starts of a thread
		
		//Working with multiple Threads
		NonSynchronized t1= new NonSynchronized("Virat"); //thread instantiation
		t1.start();//starts of a thread
		
		NonSynchronized t2= new NonSynchronized("Rohit"); //thread instantiation
		t2.start();//starts of a thread
	}
}