package ThreadGroupClass;

public class ThreadGroupMethods{
	public static void main(String[] args) {
		System.out.println("----------------Default Thread Group");
		System.out.println("Default Thread Group Name: "+Thread.currentThread().getThreadGroup().getName());
		System.out.println("Default Thread Group Parent Name: "+Thread.currentThread().getThreadGroup().getParent().getName());
		System.out.println("----------------New Thread Group");
		
		ThreadGroup pg = new  ThreadGroup("Shiv");
		System.out.println("Current Thread Group Name: "+pg.getName());
		System.out.println("Current Thread Group parent Name: "+pg.getParent().getName());
		
		System.out.println("----------------New Thread Group with Parent");
		ThreadGroup cht = new  ThreadGroup(pg,"Shiv_Pandey");
		System.out.println("Thread Group Name: "+cht.getName());
		System.out.println("Thread Group priority: "+cht.getMaxPriority());
		System.out.println("Thread Group parent Name: "+cht.getParent().getName());
		System.out.println("Thread Group parent priority: "+cht.getParent().getMaxPriority());
		
	}
}