package com.practice.multithreading;

public class ThreadPriority extends Thread {
	@Override
	//defining a thread
	public void run() {
		//job of thread --executed by child thread
		System.out.println("Child Thread");
	}	
}

class ThreadPriorityMain{
	public static void main(String []args) {
		/*thread scheduler will use thread priority to assign processor.
		 * thread with highest priority will be selected first.
		 * 
		 * if 2 threads have same priority, then we can expect the thread order
		 */
		System.out.println(Thread.currentThread().getPriority());;
		Thread.currentThread().setPriority(8);;
		/*only main thread have 5 priority, other thread inherit priority from parents
		 */
		ThreadPriority t= new ThreadPriority();
		System.out.println(t.getPriority());;
		System.out.println(t.getPriority());;

		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t.getPriority());;

		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t.getPriority());;
	}
}