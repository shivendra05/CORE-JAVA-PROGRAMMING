/*
 Inheritance, Multiple Inheritance.

	if we use inheritance(Useing extends keyword). All Data members and Data methods will be present in the BDC.
So it is recomeneded to create an object of a class having all the data memeber and data memebr. Now we can easily access all Top class and Intermideate 
classes data member and data methods easially

*/ 
class TBC 
{

	int a=10;
	void display(){
		System.out.println("\n	I am from TBC	\n");
		System.out.println("Value of a: "+a);
	}
}
class IDC extends TBC
{	/* logically a=10 and display() method is present here.
We can verify by crateing an object of IDC and we can access value of a and diaplay()
	*/
	int b=20;
	void display1(){
		System.out.println("\n	I am from IDC	\n");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}
}
class BDC extends IDC
{
	/* logically a=10 and display() from TBC and b=20 and display1() method is present here.
We can verify by crateing an object of BDC and we can access all values.

Same way, Main Mamory is also allocated. First memory is allocated for TBC data member and data methods
		then for IDC data member and data methods at the last memory is allocated to BDC data menomers and data methods.

	*/
	int c=30;
	void display2(){
		System.out.println("\n	I am from BDC	\n");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		System.out.println("Value of c: "+c);
	}
}

class TIBMain
{
	public static void main(String []k){
		/*Becasue all data member and data methods are present so We can access any thing from */
		System.out.println("\n	BOTTOM MOST DERIVED CLASS ACCESSIBILITY	\n");
		BDC b = new BDC();
		b.display2();
		b.display1();
		b.display();

		System.out.println("\n	INTERMEDIATE DERIVED CLASS ACCESSIBILITY	\n");
		IDC i = new IDC();
		//b.display2(); // cant access because it is not present in IDC, So w cant access display2() with i
		i.display1();
		i.display();

		System.out.println("\n	TOP MOST DERIVED CLASS ACCESSIBILITY	\n");
		TBC t = new TBC();
		//t.display2(); // cant access because it is not present in IDC, So we cant access display2() with t
		//t.display1(); // cant access because it is not present in TDC, So we cant access display1() with t
		t.display();
	}
}