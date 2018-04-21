interface ClassInterface1{
	void f1();
}
interface ClassInterface2{
	void f2();
}

class ClassInterface implements ClassInterface1,ClassInterface2{
	public void f1(){// must conatain access modifier as Public
		System.out.println("F1 overriden in ClassInterface");
	}
	public void f2(){// must conatain access modifier as Public
		System.out.println("F2 overriden in ClassInterface");
	}
}

class ClassInterfaceDemo{
	public static void main(String[] args){
		System.out.println("Interface Demo");
			ClassInterface1 ci1 = new  ClassInterface();
			ci1.f1();
			//ci1.f2();//Interface ClassInterface1 doesnt contain any abstract method with name f1
			ClassInterface2 ci2 = new  ClassInterface();
			//ci2.f1();//Interface ClassInterface2 doesnt contain any abstract method with name f2
			ci2.f2();
	}
}