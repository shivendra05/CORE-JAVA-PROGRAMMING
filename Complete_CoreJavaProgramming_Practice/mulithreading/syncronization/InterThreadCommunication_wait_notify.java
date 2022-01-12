package com.practice.mulithreading.syncronization;

/* 
 * With Synchronized keyword
 * 
 * */
public class InterThreadCommunication_wait_notify extends Thread {

	/* 2 thread can communicate each other
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
	int  sum=0;
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Child Thread Starts calculation..");
			for (int i = 1; i < 100; i++) {
				sum= sum+i;
			}
			System.out.println("Child Thread trying to give Notifcation..");
			this.notify(); //No error because this method inside synchronized block
		}
	}
}
class MyThread_Wait_Notify{
	public static void main(String[] args) throws InterruptedException {
		InterThreadCommunication_wait_notify itc = new InterThreadCommunication_wait_notify();
		itc.start();
		synchronized (itc) {
			System.out.println("Main method calls wait()");
			itc.wait(); //no Error because method inside synchronized block
			System.out.println("Main method got Notification");
			System.out.println(itc.sum);	
		}
	}
}