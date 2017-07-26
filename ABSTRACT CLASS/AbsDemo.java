/*
Abstact class provides 0 to 100% abstraction. So we can

 1. Declare a method with abstract.
 2. define a method.
 3. keep null body mehtod

A method declaration without abstract keyword, is not allowed in abstract class.
*/
abstract class AbsDemo
{
	//veriable declaration
	int a;
	//veriable initialization 
	int b=10;

	//method declration without abstract keyword, compile time error."InValid Declaration"  
	//void m1();

	//method declration with abstract keyword."Valid Declartion"   
	abstract void m2();

	//method defination, with Body. Dont need abstract keyword. "Valid Declartion"  
	void m3(){
		System.out.println("Hi I am m3");
	}

	//method defination, with null body method. Dont need abstract keyword. "Valid Declartion" 
	void m4(){

	}
}
