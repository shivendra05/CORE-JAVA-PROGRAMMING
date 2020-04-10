package JoinYieldSleep;

public class Join_WaitsForOthersThreadToCompleteParentExecution extends Thread{
	static Thread mainThread;
	public void run() {
		try {
			mainThread.join();
		} catch (InterruptedException e) {

		}
		for(int i=1;i<5;i++) {
			System.out.println("Join_WaitsForOthersThreadToCompleteExecution.run()::Child Thread: "+i);
		}
	}

	public static void main(String []args) throws InterruptedException {
		Join_WaitsForOthersThreadToCompleteParentExecution mainThread = new Join_WaitsForOthersThreadToCompleteParentExecution();
		Join_WaitsForOthersThreadToCompleteParentExecution childThread = new Join_WaitsForOthersThreadToCompleteParentExecution();
		childThread.start();
		for(int i=1;i<5;i++) {
			Thread.sleep(2000);
			System.out.println("Join_WaitsForOthersThreadToCompleteExecution.main()::Main Thread: "+i);
		}
	}

}
