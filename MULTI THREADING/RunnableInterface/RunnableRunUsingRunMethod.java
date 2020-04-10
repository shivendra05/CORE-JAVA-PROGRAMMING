package RunnableInterface;

// We cant expect exact output, Since job scheduling done a thread scheduller
public class RunnableRunUsingRunMethod implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("CallingRunUsingRunnable.run():: Run Method");
		}
	}
	public static void main(String[] args) {
		RunnableRunUsingRunMethod callRun = new RunnableRunUsingRunMethod();
		//will be treated as a normal method
		callRun.run();
		//illegal way to call a create a thread...Since We implemented Runnable interface
		//callRun.start();
		//casting Normal thread to Runnable Thread
		Thread t1 = new Thread(callRun);
		//will be treated as a normal method
		t1.run();
		for(int i=0;i<5;i++) {
			System.out.println("CallingRunUsingRunnable.main():: Main Method");
		}
	}
}