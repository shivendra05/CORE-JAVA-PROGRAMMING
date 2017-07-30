/*
	super and this Between classes,
			super() or super(-,-):
							keyword is use to call super/base class constructor
			this() or this(-,-):
							keyword is use to call same class constructor
	*/ 
class SuperThis 
{
	SuperThis(){
		System.out.println("	TBC Default Constructor");
	}
	SuperThis(int a){
		this(a,a); // this(-,-) to call Double paramerized Constructor from same class
		System.out.println("	TBC Signle parametrized Constructor");
	}

	SuperThis(int a,int b){
		this(); // this() to call Default Constructor from same class
		System.out.println("	TBC Double paramerized Constructor");
	}
}
class SuperThis1 extends SuperThis // IS-A relationship
{	
	SuperThis1(){
		super(10); // super(-) to call Signle parametrized Constructor from super class,
				//same way we can use, super(-,-) and super() to call double and default construtor of super class
		System.out.println("	BDC Default Constructor");
	}
	SuperThis1(int a){
		this(); // this() to call Default Constructor from same class
		System.out.println("	BDC Signle parametrized Constructor");	
		
	}
	SuperThis1(int a,int b){
		this(a); // this(-) to call Default Constructor from same class
		System.out.println("	BDC Double paramerized Constructor");
	}
}

class SuperThisMain
{
	public static void main(String []k){
		SuperThis1 s= new SuperThis1(10,20);
	}
}