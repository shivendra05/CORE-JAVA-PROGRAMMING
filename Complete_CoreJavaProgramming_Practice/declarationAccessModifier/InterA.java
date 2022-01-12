package com.practice.declarationAccessModifier;

public interface InterA{
	//every interface variable is public static final
	int a=10;
	//any service requirement specification(SRS) is considered as interface.
	//by default all declared methods in interface are abstract and public
	void m1();
	void m2();
}

//implementation class are not allowed to change access modifier of a method
//implementation class either should override all methods or make implementation class as abstract.
//a class can implement any number of interface anytime
//a class can extends only one class
//class can extends only one class and can implement any number of interfaces together.

interface InterB{
	//any service requirement specification(SRS) is considered as interface.
	//by default all declared methods in interface are abstract and public
	void m3();
	void m2();
}

class ImplClassA implements InterA{
	@Override
	public void m1() {
		// TODO Auto-generated method stub
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
	}
}

class ImpleClassVB extends ImplClassA implements InterA, InterB{
	@Override
	public void m3() {
		// TODO Auto-generated method stub
	}
	public static void main(String[] args) {
		int a=999;
		System.out.println(a);
	}
}

//an interface extends another interface
interface ImplClassC extends InterA{
}