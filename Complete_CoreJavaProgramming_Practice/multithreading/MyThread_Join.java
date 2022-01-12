package com.practice.multithreading;

public class MyThread_Join extends Thread {
	@Override
	//defining a thread
	/*
	 * join() --> if thread wants to wait until other thread completes it work.
	 * if thread t1 wants to until completing thread t2 then thread t1 will have to call t2.join
	 * 
	 * if thread t1 executes t2.join() then immediately t1 will be entered on waiting state,
	 */
	public void run() {
		//job of thread --executed by child thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}

class Join_Main{
	public static void main(String []args) throws InterruptedException {
		
		MyThread_Join t= new MyThread_Join(); //thread instantiation
		t.start();//starts of a child thread
		
		//t.join();//wait for completion of child thread
		//t.join(3000);//wait for completion of child thread
		t.join(2000,20);//wait for completion of child thread
		
		//executed by main thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Parent Thread");
		}
	}
}