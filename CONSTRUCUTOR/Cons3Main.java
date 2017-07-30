/* parametrized construtor is used to initilzed the value of veriable at the compile time

	if we define parametrized contrutor then it will assign values to all variable.
	1. We can define as many as parametrized construcoter we want.
	2. Defineing amny paramerized construcotr is nothing but construcotr overloeading
*/
class Cons3 
{	
	int i;
	String str;
	Cons3(int x, String s){
		i=x;
		str=s;
	}
	/*
	Defining Same consrtuctor will throgh compile time error   -- already defined 
	
	Cons3( String s, int x){
		i=x;
		str=s;
	}
*/
	Cons3( String s, int x){
		i=x;
		str=s;
	}
}
class Cons3Main 
{
	public static void main(String []k){

		Cons3 c = new Cons3(10,"Hello");
		Cons3 c1 = new Cons3("Hi",20);

		System.out.println("Integer vlaue i: "+(c.i)); 
		System.out.println("string vlaue ch: "+(c.str));

		System.out.println("Integer vlaue i: "+(c1.i)); 
		System.out.println("string vlaue ch: "+(c1.str));
		
	}
}