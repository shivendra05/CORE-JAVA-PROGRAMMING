package com.practice.oops.inheritance.hasA;

//early binding/compile time polymorephism/static polymorphism
public class Overloading_Case3{
	//methods are said to be overloaded if all methods have same name and different argument type.

	public void m1(int i,float f) {
		System.out.println("Hi-->int/float-Args Method::"+i+" "+f);
	}
	
	public void m1(float f, int i) {
		System.out.println("Hi-->float/int-Args Method::"+f+" "+i);
	}
}

//automatic type promotion in method overloading
//Byte -> short -> int  -> long -> float -> double
//char -> int  -> long -> float -> double

class Overloading_Case3Main{
	public static void main(String[] args) {
		Overloading_Case3 over= new Overloading_Case3();
		over.m1(10,12.32f);
		over.m1(12.32f,10);
		//over.m1(11,21);//ambiguous for the type Overloading_Case3
		//over.m1(11.3f,21.43f);////ambiguous for the type Overloading_Case3
	}
}