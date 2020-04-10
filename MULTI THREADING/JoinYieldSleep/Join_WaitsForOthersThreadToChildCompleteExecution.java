package JoinYieldSleep;

public class Join_WaitsForOthersThreadToChildCompleteExecution extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Join_WaitsForOthersThreadToCompleteExecution.run()::Child Thread: "+i);
		}
	}

	public static void main(String []args) throws InterruptedException {
		Join_WaitsForOthersThreadToChildCompleteExecution thread = new Join_WaitsForOthersThreadToChildCompleteExecution();
		thread.start();
		//if we comment join() then it will be normal execution, (main thread wont wait for child thread)can't expect order of execution
		//but if we write join()...main thread will wait for child thread to complete its execution 
		thread.join();
		for(int i=1;i<5;i++) {
			System.out.println("Join_WaitsForOthersThreadToCompleteExecution.main()::Main Thread: "+i);
		}
	}

}
