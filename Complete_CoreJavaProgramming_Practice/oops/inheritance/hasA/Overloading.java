package com.practice.oops.inheritance.hasA;

//early binding/compile time polymorphism/static polymorphism
public class Overloading{
	//methods are said to be overloaded if all methods have same name and different number/type argument type.

	public void m1() {
		System.out.println("Hi-->No Args Method");
	}
	
	public void m1(int i) {
		System.out.println("Hi-->1-Args Method");
	}
	
	public void m1(int i,double f) {
		System.out.println("Hi-->2-Args Method");
	}
}

class OverloadingMain{
	public static void main(String[] args) {
		Overloading over= new Overloading();
		over.m1();
		over.m1(0);
		over.m1(0,0.0);
	}
}