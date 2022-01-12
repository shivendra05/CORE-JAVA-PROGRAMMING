package com.practice.multithreading;

public class MyThread_Join2 extends Thread {
	//defining a thread
	/*join() --> if thread wants to wait until other thread completes it work.
	 * if thread t1 wants to until completing thread t2 then thread t1 will have to call t2.join
	 * 
	 * if thread t1 executes t2.join() then immidiatly t1 will be entered on waiting state,
	 * */
	static Thread mt_j;
	@Override
	public void run() {
		//job of thread --executed by child thread
		try {
			//System.out.println(mt_j);
			mt_j.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}

class Join_Main2{
	public static void main(String []args) throws InterruptedException {
		MyThread_Join2.mt_j= Thread.currentThread(); //thread instantiation

		MyThread_Join2 t= new MyThread_Join2(); //thread instantiation
		t.start();//starts of a child thread

		//executed by main thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Parent Thread");
			Thread.sleep(1000);
		}
	}
}