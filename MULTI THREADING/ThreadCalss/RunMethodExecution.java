package ThreadCalss;

public class RunMethodExecution extends Thread{
	// Running Method Using Thread, where Thread Scheduler used to Schedule jobs. But calling Thread with Run() instead with start().
	//For this Call method will behave as a ordinary method call(Not a thread call), So there will be order in execution.
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("Child Thread: "+i);
		}
	}
	public static void main(String[] args) {
		// Here, only  one Thread are running that is  main thread.
		RunMethodExecution runMethod = new RunMethodExecution();
		runMethod.run();
		for(int j=0;j<5;j++) {
			System.out.println("Parent Thread: "+j);
		}
	}
}