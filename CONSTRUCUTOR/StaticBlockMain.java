class StaticBlock{
	static{
		System.out.println("Static Block 1");
	}
	static{
		System.out.println("Static Block 2");
	}
}
class  StaticBlockMain
{
	public static void main(String[] args) 
	{
		StaticBlock sb = new StaticBlock();
		System.out.println("Main Block");
	}
}
