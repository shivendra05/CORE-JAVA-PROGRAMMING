package JoinYieldSleep;

public class InterruptThread extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				System.out.println("Join_WaitsForOthersThreadToCompleteExecution.run()::Child Thread: "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread Intrrupted");
			}
		}
	}

	public static void main(String []args) throws InterruptedException {
		InterruptThread thread = new InterruptThread();
		thread.start();
		thread.interrupt();
		for(int i=1;i<5;i++) {
			System.out.println("Join_WaitsForOthersThreadToCompleteExecution.main()::Main Thread: "+i);
		}
	}

}
