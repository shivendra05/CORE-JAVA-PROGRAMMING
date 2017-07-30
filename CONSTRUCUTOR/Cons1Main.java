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
	int i;
	long l;
	String str;
}
class Cons1Main{
	public static void main(String []k){
		Cons1 c = new Cons1();

		System.out.println("Boolean vlaue b: "+(c.b)); //default value of boolean --false
		System.out.println("Character vlaue ch: "+(c.ch));//default value of charcter --nothing
		System.out.println("Float vlaue f: "+(c.f));  //default value of float -- 0.0
		System.out.println("Double vlaue d: "+(c.d)); //default value of double --0.0
		System.out.println("Integer vlaue i: "+(c.i)); //default value of integer --0
		System.out.println("Long vlaue l: "+(c.l)); //default value of long --0
		System.out.println("String vlaue str: "+(c.str));//default value of String --null
	}
}