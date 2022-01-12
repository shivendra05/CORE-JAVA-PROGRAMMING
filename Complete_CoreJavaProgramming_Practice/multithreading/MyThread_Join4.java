package com.practice.multithreading;

/*
 * deadlock program
 * */
public class MyThread_Join4 extends Thread {
	//defining a thread
	/*
	 * join() --> if thread wants to wait until other thread completes it work.
	 * if thread t1 wants to until completing thread t2 then thread t1 will have to call t2.join
	 * 
	 * if thread t1 executes t2.join() then immidiatly t1 will be entered on waiting state,
*/
	static Thread mt_j;

	@Override
	public void run() {
		//job of thread --executed by child thread

		try {
			//System.out.println(mt_j);
			mt_j.join();//waits for parent to complete
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}

class Join_Main3{
	public static void main(String []args) throws InterruptedException {
		MyThread_Join4.mt_j= Thread.currentThread(); //thread instantiation

		MyThread_Join4 t= new MyThread_Join4(); //thread instantiation
		t.start();//starts of a child thread
		t.join();//waits for child to complete
		//executed by main thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Parent Thread");
			Thread.sleep(1000);
		}
	}
}