/*Multiple Inheritance.
	private data member:
					cant used in sub class,it is invisible to subclass.
	final data member:
					cant re-assigned values.
	final method:
					cant be overriden.
	final class:
					cant be inheriteded.
*/ 
class TBC1 
{
	private int a;
	//final data member cant be re-assgined
	final int b=0;
	static int c;
	//construcor are supposed to initilize data memer of class. also we can inilized static data memeber also
	TBC1(){
		a=10;
		//b=20;  //invalid, So commented it. 
	}
	//Static blocks are supposed to initilize only static data memer of class
	static {
		c=30;		
	}
/*
	final void display(){
		System.out.println("\n	I am from TBC	\n");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		System.out.println("Value of c: "+c);
	}
	*/
}

final class IDC1 extends TBC1
{	
	int d;
	IDC1(){
		d=20;
		c=40;
	}
	
	//final method cant be overrriden So invalid (Same method already defined as final in super calss TBC1)
	void display(){
		System.out.println("\n	I am from IDC	\n");
		//System.out.println("Value of a: "+a); //cant access TBC private data member
		System.out.println("Value of b: "+b);
		System.out.println("Value of c: "+c);
		System.out.println("Value of d: "+d);
	}
}

//final class cant be inheriteded, So invalid to extand.So commented
/*
class BDC1 extends IDC1
{
	int c=30;
	void display2(){
		System.out.println("\n	I am from BDC	\n");
		//System.out.println("Value of a: "+a);// private data cant be accessed
		System.out.println("Value of b: "+b);
		System.out.println("Value of c: "+c);
	}
}
*/
class TI1Main
{
	public static void main(String []k){
		System.out.println("\n	INTERMEDIATE DERIVED CLASS ACCESSIBILITY	\n");
		IDC1 b = new IDC1();
		b.display();
	}
}