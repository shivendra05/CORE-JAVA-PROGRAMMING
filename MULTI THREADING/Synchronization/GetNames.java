package Synchronization;

public class GetNames extends Thread{
	String name;
	ShowName show;
	GetNames(ShowName show,String name){
		this.show = show;
		this.name = name;
	}
	
	public void run() {
		try {
			show.display(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}