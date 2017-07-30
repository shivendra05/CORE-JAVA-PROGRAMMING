/*
	Object parametrized constructor.
*/
class ObjectParaCons
{	
	static int a;
	static int b;
	
	 ObjectParaCons(int a, int b){
		 
		System.out.println("\n	PARAMETRIZED CONSTRUCTOR	\n");
		System.out.println("local a: "+this.a);
		System.out.println("local b: "+this.b);
		this.a = a;
		this.b = b;
		
		System.out.println("instance a: "+this.a);
		System.out.println("instance b: "+this.b);
	 }

	 ObjectParaCons(ObjectParaCons x){
		 
		System.out.println("\n	OBJECT PARAMETRIZED CONSTRUCTOR	\n");
		System.out.println("local a: "+x.a);
		System.out.println("local b: "+x.b);
		a = a+x.a;
		b = b+x.b;
		System.out.println("instance a: "+a);
		System.out.println("instance b: "+b);
	 }
}
class ObjectParaConsMain{
	public static void main(String []k){

		ObjectParaCons st = new ObjectParaCons(10,20);
		ObjectParaCons st1 = new ObjectParaCons(st);
	}
}