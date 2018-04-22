class  ThreadEx extends Thread{
	public static void main(String[] args){
		System.out.println("Threading Using Thread class");
		System.out.println("\n================Second Thread========\n");
		ThreadEx t1 = new ThreadEx();
		System.out.println("Thread Name is: "+t1);
		System.out.println("THread isAlive: "+t1.isAlive());
		t1.setName("Shiv");
		System.out.println("Thread Name is: "+t1.getName());
		Thread.State th1 = t1.getState();
		System.out.println("Thread State Name is: "+th1);
		ThreadGroup tg = t1.getThreadGroup();
		System.out.println("ThreadGroup Name is: "+tg);
		ThreadGroup ptg = tg.getParent();
		System.out.println("ThreadGroup Parent Name is: "+ptg);
		System.out.println("Thread Priority Name is: "+t1.getPriority());
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Thread Priority  Parent Name is: "+t1.getPriority());

		System.out.println("\n================Second Thread========\n");

		Thread t2 = new Thread("Shivendra");
		System.out.println("Thread Name is: "+t2.getName());
		Thread.State ts = t2.getState();
		System.out.println("Thread State Name is: "+ts);
		ThreadGroup tg1 = t2.getThreadGroup();
		System.out.println("ThreadGroup Name is: "+tg1);
		ThreadGroup ptg1 = tg1.getParent();
		System.out.println("ThreadGroup Parent Name is: "+ptg1);
		System.out.println("Thread Priority Name is: "+t2.getPriority());
		t2.setPriority(5);
		System.out.println("Thread Priority  Parent Name is: "+t2.getPriority());
		t2.setPriority(10);
		System.out.println("Thread Priority  Parent Name is: "+t2.getPriority());

		System.out.println("Thread MIN_Priority  Parent Name is: "+Thread.MIN_PRIORITY);
		System.out.println("Thread Priority  Parent Name is: "+Thread.NORM_PRIORITY);
		System.out.println("Thread Priority  Parent Name is: "+Thread.MAX_PRIORITY);
	}
}
