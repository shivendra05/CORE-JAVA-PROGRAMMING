package ThreadCalss;

public class ThreadWithOrderloadedRun extends Thread{
//Overloading of run()--> thread.start() can call only no args run method, other overloaded mehtods treaded as 
	//normal method. So we will have to call them explicitly.
	public void run() {
		System.out.println("Default run---ThreadWithOrderloadedRun.run()");
	}
	public void run(double d) {
		System.out.println("Overloaded--ThreadWithOrderloadedRun.run():: 1 Param");
		System.out.println("Heighest Acedmic Score: "+d);
	}
	public void run(int a) {
		System.out.println("Overloaded--ThreadWithOrderloadedRun.run():: 1 Param");
		System.out.println("Your Age is: "+a);
	}
	public void run(String a) {
		System.out.println("Overloaded--ThreadWithOrderloadedRun.run():: 1 Param");
		System.out.println("Your are: "+a);
	}
	public static void main(String[] args) {
		ThreadWithOrderloadedRun defaultRun = new ThreadWithOrderloadedRun();
		// can call only run()--> run without args
		defaultRun.start();
		System.out.println("----------------Orverlaoded Run Methods-------------");
		//other methods can be called with object and required parameters.
		defaultRun.run("Shivendra");
		defaultRun.run(30);
		defaultRun.run(8.4);
	}
}