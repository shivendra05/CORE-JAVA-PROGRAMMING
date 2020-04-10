package Synchronization;

public class MainClass {
	public static void main(String[] args) {
		ShowName show = new ShowName();
		GetNames getName1 = new GetNames(show, "Shivendra");
		GetNames getName2 = new GetNames(show, "Pandey");
		
		getName1.start();
		getName2.start();
		
	}
}