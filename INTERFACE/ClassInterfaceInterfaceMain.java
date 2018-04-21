interface InterfaceInterface1{
	void f1();
}
interface InterfaceInterface2 extends InterfaceInterface1{
	void f2();
}
interface InterfaceInterface3 extends InterfaceInterface2{
	void f3();
}

class  ClassInterfaceInterface implements InterfaceInterface3{
	public void f1(){
		System.out.println("F1 is overriden in ClassInterfaceInterface");
	}
	public void f2(){
		System.out.println("F2 is overriden in ClassInterfaceInterface");
	}
	public void f3(){
		System.out.println("F3 is overriden in ClassInterfaceInterface");
	}
}

class ClassInterfaceInterfaceMain{
	public static void main(String[] args) {
		System.out.println("Demo where an Interface will extends another Interface");

		System.out.println("-----------------Object of InterfaceInterface1");
		InterfaceInterface1 ii1 = new ClassInterfaceInterface();
		ii1.f1();
		//ii1.f2();//cant access because it is not available in InterfaceInterface1
		//ii1.f3();//cant access because it is not available in InterfaceInterface1

		System.out.println("-----------------Object of InterfaceInterface2");
		InterfaceInterface2 ii2 = new ClassInterfaceInterface();
		ii2.f1();
		ii2.f2();
		//ii2.f3();//cant access because it is not available in InterfaceInterface1

		System.out.println("-----------------Object of InterfaceInterface3");
		InterfaceInterface3 ii3 = new ClassInterfaceInterface();
		ii3.f1();
		ii3.f2();
		ii3.f3();
	}
}