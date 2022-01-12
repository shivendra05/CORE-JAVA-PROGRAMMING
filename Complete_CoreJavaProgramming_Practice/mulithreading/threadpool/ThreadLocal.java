package com.practice.mulithreading.threadpool;

public class ThreadLocal extends Thread{
	/*ThreadLocal Class provides thread variable it maintains values for thread besis.
	 * each threadLocal maintains separate values userID/trnsactionID etc for each thread that access that object.
	 *
	 * Thread can access its value, can remove it value, in every part of the code which is executed by the thread,
	 * we can access its local variable.
	 * 
	 * consider a servlets which invokes some business methods, we have a requirements to generate a unique transactionID
	 * for each and every request and pass to business request. use can use ThreadLocal for this request.
	 * 
	 * ThreadLocal can be used to ThreadScope, total code which is executed by thread has access to the corresponding threadLocal variable.
	 * 
	 * A thread can access its own local Variable and cant access other threads local variable.
	 * 
	 * Once thread enters to Dead state, all its variable will be eligible for garbage collection.
	 */
	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal();
		System.out.println("Thread-Name "+tl.getName()+ "    --->  Thread-ID "+tl.getId());
	}
}