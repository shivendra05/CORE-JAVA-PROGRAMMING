abstract class AbsClass{
	abstract void f1();
	abstract void f2();
}  

abstract class AbsClass1 extends AbsClass{
	void f1(){
		System.out.println("Derived Sub-class, ----- f1 Over-ridden AbsClass1");
	}
}
class AbsClass2 extends AbsClass1{
	void f1(){
		System.out.println("Derived Sub-class, ------f1 Overriden in Absclass2");
	}
	void f2(){
		System.out.println("Derived Sub-class, ------ f2 is Overriden in AbsClass2");
	}
	void f3(){
		System.out.println("Special Method from AbsClass2");
	}
}

class AbsMain
{
	public static void main(String[] args) 
	{
		System.out.println("---Implemation of Abstract Super and Sub class----");

		//System.out.println("Accessing Data Memeber of AbsClass ");
		//AbsClass ab = new AbsClass(); //Invalid Cant  create Obejct of Abstact class Directly

		/*System.out.println("Accessing Data Memeber of AbsClass1 ");
		AbsClass ab1 = new AbsClass1();
		ab1.f1();
		ab1.f2();
		ab1.f3();*/

		System.out.println("Accessing Data member of AbsClass2 Indirectly ");
		AbsClass ab2 = new AbsClass2();
		ab2.f1();
		ab2.f2();
		//ab2.f3();//Method reference is not present in BaseClass(AbsClass)

		System.out.println("Accessing Data member of AbsClass2 Directly");
		AbsClass2 ab3 = new AbsClass2();
		ab3.f1();
		ab3.f2();
		ab3.f3();
	}
}
