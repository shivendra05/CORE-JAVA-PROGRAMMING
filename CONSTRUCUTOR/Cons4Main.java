/* Defualt and parametrized construtor,

	if we define only parametrized contrutor in class and dont define programmer defained default construtor
in this case:-	
	1. JVM will not provide System defined deault costrutor, 
			So create object with null parameter will through compile time error
	2. While we can work freely if we obly create an object for parametrized construcoter.
*/
class Cons4 
{	
	int i;
	String str;
	Cons4(int x, String s){
		i=x;
		str=s;
	}

	Cons4( String s, int x){
		i=x;
		str=s;
	}
}
class Cons4Main 
{
	public static void main(String []k){

		/*Invalid statement, becasue JVM will not provide default construtor once we define
			paramerized consrucotr.*/
		//Cons4 c = new Cons4();

		Cons4 c1 = new Cons4(10,"Hello");
		Cons4 c2 = new Cons4("Hi",20);

		System.out.println("Integer vlaue i: "+(c1.i)); 
		System.out.println("string vlaue ch: "+(c2.str));

		System.out.println("Integer vlaue i: "+(c2.i)); 
		System.out.println("string vlaue ch: "+(c2.str));
		
	}
}