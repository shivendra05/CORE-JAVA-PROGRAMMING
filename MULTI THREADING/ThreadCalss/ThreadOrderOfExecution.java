package ThreadCalss;

public class ThreadOrderOfExecution extends Thread {
	// Running Method Using Thread, where Thread Scheduler used to Schedule jobs, Will not have Sequence of Execution.
		//So we can predict order of Execution(Because unable to predict Algorithm used for job/method Scheduling)
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread: "+i);
		}
	}
	public static void main(String[] args) {
		// Here, two Thread are running One main thread and another child thread.
		ThreadOrderOfExecution threadOrder = new ThreadOrderOfExecution();
		threadOrder.start();
		for(int i=0;i<5;i++) {
			System.out.println("Parent Thread: "+i);
		}
	}
}