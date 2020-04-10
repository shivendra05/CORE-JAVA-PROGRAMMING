package ThreadCalss;

public class ThreadWithStartAndRunMethod extends Thread{
	public void start() {
		System.out.println("ThreadWithStartAndRunMethod.start():: Start method");
	}
	public void run() {
		System.out.println("ThreadWithStartAndRunMethod.run():: Default Run method");
	}
	public static void main(String[] args) {
		//calling only start--> which is responsible for calling thread, 
		//Since we have user definded start method, So it will call only start(), no call for run()
		ThreadWithStartAndRunMethod startAndThread = new ThreadWithStartAndRunMethod();
		startAndThread.start();
		System.out.println("ThreadWithStartAndRunMethod.main():: Main method");
	}
}