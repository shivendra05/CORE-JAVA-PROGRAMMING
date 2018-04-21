/*super should be  always first statement if we are 
going to access construtors*/

class SuperBClass{
	SuperBClass(){
		System.out.println("Top Most Base Class");
	}
}
class SuperIMBClass extends SuperBClass{
	SuperIMBClass(int a){
		super();
		System.out.println(a+ " ==== InterMediate Base Class");
	}
	
}
class SuperDClass extends SuperIMBClass{
	SuperDClass(){
		super(1);
		System.out.println("Bottom Most Derived Class");
	}
}

class  SuperClassDemo{
	public static void main(String[] args) 
	{
		System.out.println("Demo on Super Class at construotr Level");
		SuperDClass sdc = new SuperDClass();
	}
}