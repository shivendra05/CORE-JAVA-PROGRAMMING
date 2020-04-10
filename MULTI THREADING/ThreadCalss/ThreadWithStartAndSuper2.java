package ThreadCalss;

public class ThreadWithStartAndSuper2{
	public static void main(String[] args) {
		//calling only start--> which is responsible for calling thread, 
		//Since we have user definded start method, So it will call only start(), no call for run()
		ThreadWithStartAndSuper1 startAndThread = new ThreadWithStartAndSuper1();
		startAndThread.start();
		//same thread cant be started again and again--> illegalThreadStateException
		//startAndThread.start();
		System.out.println("ThreadWithStartAndRunMethod.main():: Main method");
	}
}