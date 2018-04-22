class ThreadLoop extends Thread
{
	public void run(){
		int i=0;
		while(i<10){
			try{
				Thread.sleep(1000);
				System.out.println("Value of: "+i);
				i++;
			}catch(InterruptedException ie){
				System.out.println("Exception : "+ie);
			}
		}
	}
}

class ThreadLoopImp
{
	public static void main(String[] args) 
	{
		System.out.println("\n===Thead Example with Thread.Sleep==\n");
		ThreadLoop t1 = new  ThreadLoop();
		System.out.println("isAlive:  "+t1.isAlive());
		t1.run();
		System.out.println("isAlive:  "+t1.isAlive());
		t1.start();
		System.out.println("isAlive:  "+t1.isAlive());
	}
}
