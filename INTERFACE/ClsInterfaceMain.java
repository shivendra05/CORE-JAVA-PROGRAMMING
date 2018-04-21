interface ClsInterface1{
	void f1();
}

interface ClsInterface2 extends ClsInterface1{
	void f2();
}

abstract class ClsInterface3 {
	abstract void f3();
}

abstract class ClsInterface4 extends ClsInterface3 implements ClsInterface2{
	public void f1(){
		System.out.println("F1 Overriden in ClsInterface4");
	}
	public void f3(){
		System.out.println("F3 Overriden in ClsInterface4");
	}
	public void f4(){
		System.out.println("F4 is a Special Methos in ClsInterface4");
	}
}

class ClsInterface5 extends ClsInterface4{
	public void f1(){
		System.out.println("F1 Overriden in ClsInterface5");
	}
	public void f2(){
		System.out.println("F2 Overriden in ClsInterface5");
	}
	public void f3(){
		System.out.println("F3 Overriden in ClsInterface5");
	}
	public void f4(){
		System.out.println("F4 Overriden in ClsInterface5");
	}
}

class ClsInterfaceMain{
	public static void main(String[] args) 
	{
		System.out.println("Demo on Combination of Interface and Classes with Inheritance\n");
		System.out.println(" -------------Direct Object  creation with ClsInterface5");
		ClsInterface5 cif1 = new ClsInterface5();
		cif1.f1();
		cif1.f2();
		cif1.f3();
		cif1.f4();

		System.out.println(" -------------In-Direct Object  creation with ClsInterface4");
		ClsInterface4 cif2 = new ClsInterface5();
		cif2.f1();
		cif2.f2();
		cif2.f3();
		cif2.f4();

		System.out.println(" -------------In-Direct Object  creation with ClsInterface2");
		ClsInterface2 cif3 = new ClsInterface5();
		cif3.f1();
		cif3.f2();
		//cif3.f3();	
	}
}