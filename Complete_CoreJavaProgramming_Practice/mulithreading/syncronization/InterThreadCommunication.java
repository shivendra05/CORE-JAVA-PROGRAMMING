package com.practice.mulithreading.syncronization;

/* 
 * With Synchronized keyword
 * 
 * */
public class InterThreadCommunication extends Thread {
	
	/*
	 * 2 thread can communicate each other
	 * 
	 * wait()
	 * notify()
	 * notifyAll()
	 * 
	 * all above methods are present in Object class
	 * 
	 * the thread which is expecting updation is responsible to call wait() and that thread will enter into waiting stage
	 * 
	 * the thread which is responsible to perform updation, after performing updating it is responsible to call notify() 
	 * then waiting thread will get notification and continue its execution with those updated items
	 *
	 * 
	 * to call wait()/notify()/notifyAll() , thread should be owner of the object.
	 * that is thread have lock of that object that is that should be synchronized area.
	 * 
	 * Hence we can call all 3 methods only from synchronized area otherwise we will get runtimeExeception, 
	 * 
	 * if a thread call wait() on any object then immediately releases the lock and enters into waiting state.
	 * 
	 * if a thread call notify() on any object then may not releases the lock  immediately 
	 *except wait()/notify()/notifyAll() there is no other method where thread releases lock 
	 *  
	 */
	
}
