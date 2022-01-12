package com.practice.multithreading;

public class ThreadPriority2 extends Thread {
	@Override
	//defining a thread
	public void run() {
		//job of thread --executed by child thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");	
		}
	}	
}

class ThreadPriorityMain2{
	public static void main(String []args) {
		/*thread scheduler will use thread priority to assign processor.
		 * thread with highest priority will be selected first.
		 * 
		 * if 2 threads have same priority, then we can expect the thread order
		 */
		System.out.println(Thread.currentThread().getPriority());;

		/*only main thread have 5 priority, other thread inherit priority from parents
		 */
		ThreadPriority2 t= new ThreadPriority2();
		//t.setPriority(10);//or
		t.setPriority(Thread.MAX_PRIORITY);
		/*if we comment above line (setPriority) to child thread, in the child thread will have same priority as parent and 
		 * we cant guess order of execution)
		 * 
		 * Since we have give new priority to child (more than 5), then first child and next parent will be executed.
		 */
		System.out.println(t.getPriority());;
		t.start();
		/*some OS doesnt provide proper thread support, for actual thread support need to write to OS manufacturer for support
		 */
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");	
		}
	}
}