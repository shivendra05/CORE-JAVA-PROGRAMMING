package RunnableInterface;

// We cant expect exact output, Since job scheduling done a thread scheduller
public class RunnableRunUsingstart implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("CallingRunUsingRunnable.run():: Run Method");
		}
	}
	public static void main(String[] args) {
		RunnableRunUsingstart callRun = new RunnableRunUsingstart();
		//casting Normal thread to Runnable Thread
		Thread t1 = new Thread(callRun);
		t1.start();
		for(int i=0;i<5;i++) {
			System.out.println("CallingRunUsingRunnable.main():: Main Method");
		}
	}
}