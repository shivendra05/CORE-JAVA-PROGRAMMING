class StaticBlockEx 
{
	static{
			System.out.println("Static block 1");
		}
	public static void main(String[] args) 
	{
		System.out.println("Main Mehtod");
		
	}
	static{
			System.out.println("Static block main");
		}
}
