package DeamonThread;

public class DeamonThreadMethods extends Thread{

	public void run() {
		System.out.println("DeamonThreadMethods.run():: Child Thread");
	}
	
	public static void main(String[] args) {

		DeamonThreadMethods thread =new DeamonThreadMethods();
		System.out.println("Is a Deamon: "+thread.isDaemon());
		//Once we start thread cant change its state. So before start chnage non Deamon(default/ isDeamon()->false) to Deamon
		thread.setDaemon(true);
		thread.start();
		System.out.println("Is a Deamon: "+thread.isDaemon());
		System.out.println("Is a Deamon: "+thread.isDaemon());
	}

}
