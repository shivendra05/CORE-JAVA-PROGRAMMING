class OddThread extends Thread{
	public void run(){
		try{
			for(int i=0;i<=10;i++){
				if(i%2==1){
					System.out.println("ODD "+i);
					Thread.sleep(110);
				}
			}
		}catch(NumberFormatException nfe){
			System.out.println("Please enter only Numbers:  "+nfe);
		}catch(InterruptedException ie){
			System.out.println("Problem with Thread.Sleep:  "+ie);
		}catch(Exception e){
			System.out.println("Exception:  "+e);
		}
	}
}
class EvenThread implements Runnable{
	public void run(){
		try{
			for(int i=0;i<=10;i++){
				if(i%2==0){
					System.out.println("EVEN "+i);
					Thread.sleep(100);
				}
			}
		}catch(NumberFormatException nfe){
			System.out.println("Please enter only Numbers:  "+nfe);
		}catch(InterruptedException ie){
			System.out.println("Problem with Thread.Sleep:  "+ie);
		}catch(Exception e){
			System.out.println("Exception:  "+e);
		}
	}
}

class EvenOddThreadImp{
	public static void main(String[] args){
		System.out.println("\n==========Thread Program to Check Number is Even Or Odd======\n");
		OddThread t1 = new OddThread();
		Runnable t2 = new EvenThread();
		Thread t21 = new Thread(t2);
		t21.start();
		t1.start();		
		try{
			t21.join();
			t1.join();
		}catch(InterruptedException ie){
			System.out.println("Unable to join the Threads"+ie);
		}
	}
}