/*
Static block called only once, while instance block called many times, as many as objects we have.

	Sequecnce of execution is-,
		1. static block
		2. main()
		// 3 and 4 as many times, as many construcotors we have
		3. instance block
		4. default or parametrized constructor
*/
class StaticInstance 
{	
	float f;
	static int i;
	static String str;
	
	//static block
	static{

		i=10;
		str="Hi";
			System.out.println("\n --------------------------------------------\n");
			System.out.println("	THIS IS A STATIC BLOCK	");
			System.out.println("Value of integer i: "+i);
			System.out.println("Value of String str: "+str);
	}


	//Instance block
	{
		f=12.4f;
			System.out.println("\n --------------------------------------------\n");
			System.out.println("	THIS IS A INSTANCE BLOCK	");
			System.out.println("Value of float f: "+f);
	}

	 StaticInstance(){
		
		System.out.println("\n --------------------------------------------\n");
		System.out.println("	THIS IS A DEFAULT CONSTRUCTOR	");
			System.out.println("Value of float f: "+f);
			System.out.println("Value of integer i: "+i);
			System.out.println("Value of String str: "+str);
	 }

	 StaticInstance(float fa, int ia, String sa){
		f=fa;
		i=ia;
		str=sa;
		System.out.println("\n --------------------------------------------\n");
		System.out.println("	THIS IS A PARAMETRIZED CONSTRUCTOR	");
			System.out.println("Value of float f: "+f);
			System.out.println("Value of integer i: "+i);
			System.out.println("Value of String str: "+str);
	 }
}
class StaticInstanceMain{
	public static void main(String []k){

		System.out.println("	Hi!!  I am from main Block	");
		
		StaticInstance si = new StaticInstance();
		StaticInstance si1 = new StaticInstance();
		StaticInstance si2 = new StaticInstance(1.2f,1,"Shivendra");
		StaticInstance si3 = new StaticInstance(2.2f,2,"Shivendra Pandey");

	}
}