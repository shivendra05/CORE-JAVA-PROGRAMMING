package ThreadCalss;

public class ThreadWithOverridingRun extends Thread{
//A thread class without overriding run method, will be executed but no output.
	public static void main(String[] args) {
		ThreadWithOverridingRun  withoutRun = new ThreadWithOverridingRun();
		withoutRun.start();
	}
}