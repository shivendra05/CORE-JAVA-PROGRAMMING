
class ParameritzedCosnst{
	int a,b;
	ParameritzedCosnst(int a,int b){
		this.a= a;
		this.b= b;
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
	}
}
class  ParameritzedCosnstMain{
	public static void main(String[] args) 
	{
		System.out.println("------Parametrized Constructor");
		ParameritzedCosnst pc = new ParameritzedCosnst(10,20);
		ParameritzedCosnst pc1 = new ParameritzedCosnst(30,40);
	}
}