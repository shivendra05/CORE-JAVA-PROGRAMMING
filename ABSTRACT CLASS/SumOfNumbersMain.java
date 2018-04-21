/*Adding two Numbers of differennt Type using Abstaction*/

import java.util.Scanner;
abstract class SumOfNumbers{
	Scanner sn = new Scanner(System.in);
	abstract void sum();
}  

class IntSum extends SumOfNumbers{
	
	void sum(){
		System.out.println("Enter Two  Integer Numbners");
	int num1 = Integer.parseInt(sn.nextLine());
	int num2 = Integer.parseInt(sn.nextLine());
		int sumOfNumbers = num1+num2;
		System.out.println("Sum of two Integer numbers: "+sumOfNumbers);
	}
}

class FloatSum extends SumOfNumbers{
	
	void sum(){
		System.out.println("Enter two Double Numbers");
		double num1 = Double.parseDouble(sn.nextLine());
		double num2 = Double.parseDouble(sn.nextLine());
		double sumOfNumbers = num1+num2;
		System.out.println("Sum of two Double numbers: "+sumOfNumbers);
	}
}

class SumOfNumbersMain
{
	public static void main(String[] args) 
	{
		System.out.println("Sum of Different Numbers!");
		SumOfNumbers son = new IntSum();
		son.sum();
		son = new FloatSum();
		son.sum();
	}
}
