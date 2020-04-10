package ThreadCalss;

public class ThreadWithStartAndSuper1 extends Thread{
	//with use of Super, we can default run()/overriden run()
	public void start() {
		super.start();
		System.out.println("ThreadWithStartAndRunMethod.start():: Start method");
	}
	public void run() {
		System.out.println("ThreadWithStartAndRunMethod.run():: Run method");
	}
}