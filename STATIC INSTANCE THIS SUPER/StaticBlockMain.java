/*
Oder of execution when we have  Static, main 
1. Static block 
2. main block
*/class StaticBlockMain{
	int a;
	static{
		System.out.println("Static Block 1");
	}
	static{
		System.out.println("Static Block 2");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Block");
	}
}
