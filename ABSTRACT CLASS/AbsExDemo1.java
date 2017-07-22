/*
Abstact AbsExDemo class is class, So will can extand it with "extends" keyword.
*/
abstract class AbsExDemo
{
	int a;
	int b=10;

	//void m1();

	abstract void m2();

	void m3(){
		System.out.println("Hi I am m3");
	}

	void m4(){
		
	}
}
abstract class AbsExDemo1 extends AbsExDemo{
	 /*
		Here, Two important things,
		1- Either define all superclass abstract method, or
		2- Subclass should start with abstract keyword.
		3- Its not mendatory to Override null body method.
	*/

	// We are defining m2(), So AbsDemo2 class is started with abstact
	void m2(){
		System.out.println("Hi I am m2 in AbsDemo1 and Overriden in AbsDemo2");
	}

	void m3(){
		System.out.println("Hi I am m3 in AbsDemo1 and Overriden in AbsDemo2");
	}

	/*void m4(){
		System.out.println("Hi I am null body method in AbsDemo1 and Overriden in AbsDemo2");
	}*/
}