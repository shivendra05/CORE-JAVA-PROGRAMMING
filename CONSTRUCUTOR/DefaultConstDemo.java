class DefaultConst{
	int a,b;
	DefaultConst(){
		a=10;
		b=20;
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}
}

class DefaultConstDemo
{
	public static void main(String[] args) 
	{
		System.out.println("---------Default Construtor Demo-----");
		DefaultConst dc = new DefaultConst();
	}
}