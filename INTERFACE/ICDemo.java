interface I1{
	void f1();
}

interface I2 extends I1{
	void f2();
}

abstract class c1{
	void f3(){
	}
}
//If we have both interface and class then first go for Implements and then extends
abstract class c2 extends c1 implements I2 {
	public void f1(){
		System.out.println("f1 is Overriden in c2");
	}

	public void f2(){
		System.out.println("f2 is Overriden in c2");
	}
}
class c3 extends c2{
	public void f1(){
		System.out.println("f1 is Overriden in c3");
	}

	public void f2(){
		System.out.println("f2 is Overriden in c3");
	}

	public void f3(){
		System.out.println("f3 is Overriden in c3");
	}

	public void f4(){
		System.out.println("f4 is Special method in c3");
	}
}

class ICDemo{
	public static void main(String []k){
		System.out.println("Interface Implimemtation");
		System.out.println("---------------------------------------");
		System.out.println("---Direct Object Creation---");
		c3 o1 = new c3();
		o1.f1();
		o1.f2();
		o1.f3();
		o1.f4();

		System.out.println("---------------------------------------");
		//c2 o2 = new c2();  //Cant create becasue c2 is abstract class
		System.out.println("---Direct Object Creation---");
		c2 o3 = new c3();
		o3.f1();
		o3.f2();
		o3.f3();
		//o3.f4();		//f4 is a mehtod of c3 class. 

		System.out.println("---------------------------------------");
		//c1 o4 = new c1();  //Cant create becasue c1 is abstract class
		System.out.println("---Direct Object Creation---");
		c1 o5 = new c3();
		//o5.f1();		//f1 is a mehtod of I1 Interfce. 
		//o5.f2();		//f2 is a mehtod of I2 Interfce. 
		o5.f3();
		//o5.f4();		//f4 is a mehtod of c3 class. 

		System.out.println("---------------------------------------");
		//I1 o6 = new I1();  //Cant create becasue I1 is an Interface
		System.out.println("---------------------------------------");
		System.out.println("---Direct Object Creation---");
		I1 o7 = new c3();
		o7.f1();		 
		//o7.f2();		//f2 is a mehtod of I2 Interfce. 
		//o7.f3();		//f3 is a mehtod of c1 class.
		//o7.f4();		//f4 is a mehtod of c3 class. 

		//I1 o8 = new c2(); //Cant be done becsause c1 and I1 both are abstrac class and Interface respectivlly
	}
}