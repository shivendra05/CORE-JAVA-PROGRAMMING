package com.practice.oops.inheritance.hasA;

//early binding/compile time polymorephism/static polymorphism
public class Overloading_Case4{
	//methods are said to be overloaded if all methods have same name and different argument type.

	public void m1(int i) {
		System.out.println("Hi-->int-Args Method::"+i);
	}
	
	public void m1(int... i) {
		System.out.println("Hi-->Variable-Args Method::"+i.length);
		for(int x:i) {
			System.out.print(x+" ");
		}
	}
}

//automatic type promotion in method overloading
//Byte -> short -> int  -> long -> float -> double
//char -> int  -> long -> float -> double

class Overloading_Case4Main{
	public static void main(String[] args) {
		Overloading_Case4 over= new Overloading_Case4();
		over.m1();//Automatic promotion Var-arg method
		over.m1(10);
		over.m1(11,21);//Var-arg method
	}
}