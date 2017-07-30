/*
	Object parametrized constructor.
*/
class FactoryMethod
{	
	static int a;
	static int b;

	FactoryMethod(){
		
		System.out.println("\n	DEFAULT CONSTRUCTOR	\n");
		a=b=0;
		System.out.println("local a: "+this.a);
		System.out.println("local b: "+this.b);
	 }
	
	 FactoryMethod(int a, int b){
		 
		System.out.println("\n	PARAMETRIZED CONSTRUCTOR	\n");
		System.out.println("local a: "+this.a);
		System.out.println("local b: "+this.b);
		this.a = a;
		this.b = b;
		
		System.out.println("instance a: "+this.a);
		System.out.println("instance b: "+this.b);
	 }

	 FactoryMethod sum(FactoryMethod x){
		 System.out.println("\n	SUM	\n");
		 System.out.println("instance a: "+x.a);
		 System.out.println("instance b: "+x.b);
		 FactoryMethod y = new FactoryMethod();
		 y.a = a+x.a;
		 y.b = b+x.b;	 
		 System.out.println("instance a: "+a);
		 System.out.println("instance b: "+b);
		 return y;
	 }
}
class FactoryMethodMain{
	public static void main(String []k){

		FactoryMethod st = new FactoryMethod(10,20);
		FactoryMethod st1 = new FactoryMethod(100,200);
		FactoryMethod st3 = new FactoryMethod();
		st3 = st.sum(st1);
	}
}