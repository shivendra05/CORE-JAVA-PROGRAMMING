abstract class TestAbstract{
	//abstract void f1(){};

	abstract void f2();
	void f3(){
		System.out.println("Method f1 from Base Class");
	}
	void f4(){
	}
}

abstract class TestAbstract1 extends TestAbstract{
	
	void f3(){
		System.out.println("F3 is Overriden in TestAbstract1");
	}
}

class TestAbstracte2 extends TestAbstract{
	void f2(){
		System.out.println("F2 is Overriden in TestAbstract2");
	}
	void f3(){
		System.out.println("F3 is Overriden in TestAbstract2");
	}
}

class TestAbstracte3 extends TestAbstract{
	
	void f2(){
		System.out.println("F2 is Overriden in TestAbstract3");
	}
	void f3(){
		System.out.println("F3 is Overriden in TestAbstract3");
	}
	void f4(){
		System.out.println("F4 is Overriden in TestAbstract3");
	}
}

abstract class TestAbstractMain{
	public static void main(String []k){
		System.out.println("Example on Abatact class with Abstact/null Body/Conrerate method and Absract Deriverd Class");	
		
		TestAbstracte3 abs3 = new TestAbstracte3();
		abs3.f2();
		abs3.f3();
		abs3.f4();	
	}
}