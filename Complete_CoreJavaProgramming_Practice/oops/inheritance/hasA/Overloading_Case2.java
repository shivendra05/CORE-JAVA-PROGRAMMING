package com.practice.oops.inheritance.hasA;

//early binding/compile time polymorephism/static polymorphism
public class Overloading_Case2{
	//methods are said to be overloaded if all methods have same name and different argument type.

	public void m1(String str) {
		System.out.println("Hi-->String-Args Method::"+str);
	}
	
	public void m1(StringBuffer str) {
		System.out.println("Hi-->StringBuffer-Args Method::"+str);
	}
	
	public void m1(Object obj) {
		System.out.println("Hi-->Object-Args Method::"+obj);
	}
}

//automatic type promotion in method overloading
//Byte -> short -> int  -> long -> float -> double
//char -> int  -> long -> float -> double

class Overloading_Case2Main{
	public static void main(String[] args) {
		Overloading_Case2 over= new Overloading_Case2();
		over.m1(new Object());
		over.m1("Shivendra");
		over.m1(new StringBuffer("Pandey"));
		//over.m1(null);// ambiguous because both child of Object(String/StringBuffer) are ready to accept null
		over.m1('a'); //Automatic promotion Object
		over.m1(12.30f);//Automatic promotion from float to Object
		over.m1(11);//Automatic promotion from int to Object
	}
}