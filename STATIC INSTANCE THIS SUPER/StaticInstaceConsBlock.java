/*
oder of executons
1. static block
2. main method
3. instacnce block
4. constructor
*/
class StaticInstaceConsBlock{
	static{
		System.out.println("Static block 1");
	}
	{
		System.out.println("Instance Block 1");
	}
	StaticInstaceConsBlock(){
		System.out.println("Default Constructor");
	}
	{
		System.out.println("Instacne Block 2");
	}
	static{
		System.out.println("Static block 2");
	}
public static void main(String[] args) 
	{
		System.out.println("Main block");
		StaticInstaceConsBlock sib = new StaticInstaceConsBlock();
		StaticInstaceConsBlock sib1 = new StaticInstaceConsBlock();
	}
}
