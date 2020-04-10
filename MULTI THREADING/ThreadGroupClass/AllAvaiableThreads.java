package ThreadGroupClass;

public class AllAvaiableThreads {

	public static void main(String[] args) {
		ThreadGroup tg = Thread.currentThread().getThreadGroup().getParent();
		Thread []allthread = new Thread[tg.activeCount()];
		tg.enumerate(allthread);
		for(Thread t:allthread) {
			System.out.println(t.getName()+"----"+t.getPriority()+"----"+t.isDaemon());
		}
	}
}
