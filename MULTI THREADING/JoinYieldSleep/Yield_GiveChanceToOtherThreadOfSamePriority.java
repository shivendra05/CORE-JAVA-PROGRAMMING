package JoinYieldSleep;

public class Yield_GiveChanceToOtherThreadOfSamePriority extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			//yield() used to give execution control to other thread have same priority
			//So every time thread execution with/should move to main thread 
			Thread.yield();
			System.out.println("Yield_GiveChanceToOtherThreadOfSamePriority.run()::Child Thread: "+i);
		}
	}

	public static void main(String []args) {
		Yield_GiveChanceToOtherThreadOfSamePriority thread = new Yield_GiveChanceToOtherThreadOfSamePriority();
		thread.start();
		for(int i=1;i<5;i++) {
			System.out.println("Yield_GiveChanceToOtherThreadOfSamePriority.main()::Main Thread: "+i);
		}
	}
}