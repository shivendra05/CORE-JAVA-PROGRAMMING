import java.util.*;
class ThreadEvenOdd implements Runnable
{
	public void run(){
		Scanner sn = new Scanner(System.in);
		System.out.println("Please enter a number Numbers:");
		try{
			int n = Integer.parseInt(sn.nextLine());
			for(int i=0;i<=n;i++){
				if(i%2==0){
					System.out.println("Even Numbers: "+i);
					Thread.sleep(200);
				}else{
					System.out.println("Odd Numbers: "+i);
					Thread.sleep(500);
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

class ThreadEvenOddImp
{
	public static void main(String[] args) 
	{
		System.out.println("\n==========Thread Program to Check Number is Even Or Odd======\n");
		Runnable t1 = new ThreadEvenOdd();
		Thread t11 = new Thread(t1);
		t11.start();
	}
}