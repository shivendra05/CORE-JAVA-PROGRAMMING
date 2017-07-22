/*
Abstact class contains 0 to 100% abstraction. So

 Declare a method with abstract.
 define a method.
 keep null body mehtod

A method declaration without abstract keyword, is not allowed if class is abstract.
*/
abstract class AbsDemo
{
	//veriable declaration
	int a;
	//veriable initialization 
	int b=10;

	//method declration without abstract keyword otherwise will show, compile time error."InValid Declaration"  
	//void m1();

	//method declration with abstract keyword."Valid Declartion"   
	abstract void m2();

	//method defination, So dont need abstract keyword. "Valid Declartion"  
	void m3(){
		System.out.println("Hi I am m3");
	}

	//method defination, So dont need abstract keyword, with null body method,. "Valid Declartion" 
	void m4(){

	}
}