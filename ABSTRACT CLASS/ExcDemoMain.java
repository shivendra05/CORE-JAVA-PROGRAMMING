 /*
 This Program will demonstrat creation of Objec of abstract class
 and using diect object or indiet object/Dynemic oject.
   */
abstract class ExcDemo 
{
	abstract void m1();
	abstract void m2();
}
abstract class ExcDemo1 extends ExcDemo{
	void m1(){
		System.out.println("Hi m1 Overriden in ExcDemo1");
	}
}
class ExcDemo2 extends ExcDemo1{
	void m1(){
		System.out.println("Hi m1 Overriden in ExcDemo2");
	}
	void m2(){
		System.out.println("Hi m2 Overriden in ExcDemo2");
	}
	void m3(){
		System.out.println("Hi m3 is special Method in ExcDemo2");
	}
}
class ExcDemoMain{
	public static void main(String[] args) 
	{
		System.out.println("Hello this is Abstration program demonstration");	
		System.out.println("====== Direct Obect Creation =======================");
		ExcDemo2 a1 = new ExcDemo2();
		a1.m1();			//Valid
		a1.m2();			//Valid
		a1.m3();			//Valid
		System.out.println("====================================================");
		//ExcDemo1 a2 = new ExcDemo1();  //InVaid Because we cant create Object of Abstract class
		System.out.println("======= InDirect Obect Creation ====================");
		ExcDemo1 a3 = new ExcDemo2();
		a3.m1();			//Valid
		a3.m2();			//Valid
		//a3.m3();			//InValid
		System.out.println("====================================================");
		//ExcDemo a4 = new ExcDemo();  //InVaid Because we cant create Object of Abstract class		
		System.out.println("======= InDirect Obect Creation ====================");
		ExcDemo a5 = new ExcDemo2();
		a5.m1();
		a5.m2();
		//a5.m3();			//InValid
		System.out.println("================================================");
	}
}