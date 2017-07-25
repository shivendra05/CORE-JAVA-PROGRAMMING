import java.util.Scanner;

class SumThread extends java.lang.Thread{
	int a,b;
	void setData(int a,int b){
		this.a = a;
		this.b = b;
	}

	public void run(){
		System.out.println("Sum of two number by extending THREAD class is: "+(a+b));
	}
}

class MultiThread implements java.lang.Runnable{
	int a,b;
	void setData(int a,int b){
		this.a = a;
		this.b = b;
	}

	public void run(){

		System.out.println("Sum of two number by implementing Runnable interface is: "+(a*b));
	}
}
class SumMultiThread 
{
	public static void main(String []k){
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter two numbers for operations");

		int a = Integer.parseInt(sn.nextLine());
		int b = Integer.parseInt(sn.nextLine());


		//We can start thread directlty from Thread. So We can use object.start()
		SumThread t1 = new SumThread();
		/*We can not start thread directlty from Runnable interface . 
		So We need to type case it Thread and then object.start() */
		t1.setData(a,b);
		MultiThread t2 = new MultiThread();
		t2.setData(a,b);
		Thread t22 = new Thread(t2);
		
		t1.start();
		t22.start();

		try{
			t1.join();
			t22.join();
		}catch(InterruptedException ie){

			System.out.println("Thread got interruped");
		}
	}
}
