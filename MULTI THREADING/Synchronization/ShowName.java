package Synchronization;

public class ShowName {
//when method is declared as a synchronized onlt one can enter and will have sequence in execution
	public synchronized  void display(String name) throws InterruptedException {
//when method is not declared as a synchronized both will execute parallel and will have mixted output.
	//public  void display(String name) throws InterruptedException {
		for(int i=0;i<5;i++) {
			System.out.println("Good Morning: ");
			System.out.println("I am: "+name);
			Thread.sleep(100);
		}
	}
}