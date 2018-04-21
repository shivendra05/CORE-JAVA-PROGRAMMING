class SuperThisBClass{
	SuperThisBClass(){
		System.out.println("Top Most Base Class");
	}
	SuperThisBClass(int a){
		this();
		System.out.println(a+ " ==== Top Most Base Class");
	}
}
class SuperThisIMBClass extends SuperThisBClass{
	SuperThisIMBClass(){
		super(2);
		System.out.println("InterMediate Base Class");
	}
	SuperThisIMBClass(int a){
		this();
		System.out.println(a+ " ==== InterMediate Base Class");
	}
	
}
class SuperThisDClass extends SuperThisIMBClass{
	SuperThisDClass(){
		super(1);
		System.out.println("Bottom Most Derived Class");
	}
}

class  SuperThisClassDemo{
	public static void main(String[] args) 
	{
		System.out.println("Demo on Super Class at construotr Level");
		SuperThisDClass sdc = new SuperThisDClass();
	}
}