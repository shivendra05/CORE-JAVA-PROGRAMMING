/* default construtor is used to initilzed the value of the same class it is present	
	if we define default contrutor then it will assign same value to all variable.
	1. We can dfine one and only one default construcotr.
	2. define 
*/
class Cons2 
{	
	int i;
	String str;

	Cons2(){
		i=10;
		str="Hello";
	}

	/*
	 will through compile time error ------ already defined

	Cons2(){
		i=20;
		str="Hello integer";
	}
	*/
}
class Cons2Main 
{
	public static void main(String []k){
		Cons2 c = new Cons2();

		System.out.println("Integer vlaue i: "+(c.i)); //default value of Integer --0
		System.out.println("string vlaue ch: "+(c.str));//default value of String --null
		
	}
}