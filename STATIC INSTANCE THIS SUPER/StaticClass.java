/*
A class withOut main Method, 
We can only compile it(with any data e.i. static block or default construtor) but we can execute a class with main menthod.
*/
class StaticClass {
	static{
		System.out.println("Static block");
	}
	StaticClass(){
	}
}