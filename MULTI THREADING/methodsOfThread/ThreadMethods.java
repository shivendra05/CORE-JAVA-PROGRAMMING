package methodsOfThread;

public class ThreadMethods extends Thread{

	public static void main(String []args) {
		ThreadMethods thread = new ThreadMethods();
		thread.start();

		System.out.println("Thread Name: "+thread.getName());
		System.out.println("Thread Priority: "+thread.getPriority());
		System.out.println("Thread Status: "+thread.currentThread());
		
		thread.setName("Shivendra Thread");
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.currentThread().setPriority(8);
		System.out.println("----------------------------------");

		System.out.println("Thread Name: "+thread.getName());
		System.out.println("Thread Priority: "+thread.getPriority());
		System.out.println("Thread Status: "+thread.currentThread());
	}
}