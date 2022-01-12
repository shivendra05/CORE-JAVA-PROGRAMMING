package com.practice.declarationAccessModifier;

public interface AdaptorClass_UsesInterface{
	//adaptor class is a additional class who provides provides empty implementation for all 
	// methods in the interface
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
}

//adaptor class is a class who provides empty implementation for all methods in interface.
//it is recommended to declare adaptor class as abstract because all methods have empty body its recommended. 

abstract class AdaptorClass implements AdaptorClass_UsesInterface{

	@Override
	public void m1() {}

	@Override
	public void m2() {}

	@Override
	public void m3() {}

	@Override
	public void m4() {}

	@Override
	public void m5() {}
}

//now any class can extend adaptor class as per there need and free to override only useful methods
class ClassA extends AdaptorClass{
	@Override
	public void m1() {
		System.out.println("Hello this is Class A");
	}
}

class ClassB extends AdaptorClass{
	@Override
	public void m3() {
		System.out.println("Hello this is Class B");
	}
}