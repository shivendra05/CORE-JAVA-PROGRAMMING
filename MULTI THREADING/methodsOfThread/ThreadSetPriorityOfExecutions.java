package methodsOfThread;

public class ThreadSetPriorityOfExecutions extends Thread{

	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println("ThreadSetPriorityOfExecutions.run()::Child Thread: "+i);
		}
	}

	public static void main(String []args) {
		ThreadSetPriorityOfExecutions thread = new ThreadSetPriorityOfExecutions();
//Default priority is 5 so, Both main and child thread will execute
//parallal id we dont set priority, If we set priority as 10, main thread will execute first later child thread
//same, if we set priority as 1 or default then no order
		thread.setPriority(10);
		thread.start();
		
		for(int i=1;i<5;i++) {
			System.out.println("ThreadSetPriorityOfExecutions.main()::Main Thread: "+i);
		}
	}
}