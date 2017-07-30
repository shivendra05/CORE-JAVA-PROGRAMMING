/*
construtor to show the defualt values and javap <.class> to see the default construtor.
if we dont define default condtrutor then JVM provides defualt construtor at compile time.
*/
class Cons1 
{	
	boolean b;
	char ch;
	float f;
	double d;
	int a;
	long l;
	String str;
}
class Cons1Main{
	public static void main(String []k){
		Cons1 c = new Cons1();
	}
}
