/*We can write thread programs either by extending java.lang.Thread or implementing 
java.lang.Runnable */

class ThreadIntro extends java.lang.Thread 
{
	public static void main(String[] args) 
	{
		//Creating object of ThreadIntro means we are creating an object of thread class
		ThreadIntro t = new ThreadIntro();

		System.out.println("------- Thread Priority ------\n");
		boolean status = t.isAlive();
		System.out.println("Thread Status: "+status);
		System.out.println("Thread Priority: "+Thread.MAX_PRIORITY);
		System.out.println("Thread Priority: "+Thread.NORM_PRIORITY);
		System.out.println("Thread Priority: "+Thread.MIN_PRIORITY);

		System.out.println("------- Thread Nameing -------\n");

		String name = t.getName();
		System.out.println("Thread Default Name: "+name);
		t.setName("Sathya");
		name = t.getName();
		System.out.println("New Thread Name: "+name);

		System.out.println("------- Thread State ------\n");
		
		Thread.State state = t.getState();
		System.out.println("Thread Default State is: "+state);

		t.start();

		boolean status1 = t.isAlive();
		System.out.println("Thread Status: "+status1);
		Thread.State newState = t.getState();
		System.out.println("Thread new State is: "+newState);

		System.out.println("--------- Thread Gruop ----------");

		ThreadIntro t1 = new ThreadIntro();
		ThreadGroup tg = t1.getThreadGroup();
		System.out.println("Thread GroupName is: "+tg);
		
		ThreadGroup tgp = tg.getParent();
		System.out.println("Thread GroupName is: "+tgp);
	}
}