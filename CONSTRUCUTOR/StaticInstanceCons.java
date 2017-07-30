/*
Static block called only once, while instance block called many times, as many as objects we have.

	Sequecnce of execution is-,
		1. static block
		2. main()
		// 3 and 4 as many times, as many construcotors we have
		3. instance block
		4. default or parametrized constructor
*/

class StaticInstanceCons{	

	//static block
	static{
			System.out.println("\n --------------------------------------------\n");
			System.out.println("	THIS IS A STATIC BLOCK	");	
	}

	//Instance block
	{
			System.out.println("\n --------------------------------------------\n");
			System.out.println("	THIS IS A INSTANCE BLOCK	");
	}
	//default constructor
	 StaticInstanceCons(){
		
		System.out.println("\n --------------------------------------------\n");
		System.out.println("	THIS IS A DEFAULT CONSTRUCTOR	");
	 }

	 StaticInstanceCons(int a){
		
		System.out.println("\n --------------------------------------------\n");
		System.out.println("	THIS IS A PARAMETRIZED CONSTRUCTOR	");
		System.out.println("	value of a: "+a);
	 }

	public static void main(String []k){

		System.out.println("\n --------------------------------------------\n");
		System.out.println("	Hi!!  I AM FROM MAIN BLOCK	");
		StaticInstanceCons si = new StaticInstanceCons();
		StaticInstanceCons si1 = new StaticInstanceCons(10);
	}
}