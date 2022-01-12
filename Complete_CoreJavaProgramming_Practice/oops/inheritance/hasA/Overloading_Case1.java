package com.practice.oops.inheritance.hasA;

//early binding/compile time polymorephism/static polymorphism
public class Overloading_Case1{
	//methods are said to be overloaded if all methods have same name and argument type.

	public static void m1(int i) {
		System.out.println("Hi-->int-Args Method::"+i);
	}
	
	public static void m1(double f) {
		System.out.println("Hi-->Float-Args Method::"+f);
	}
	
	public static void m1(int i,double f) {
		System.out.println("Hi-->Int and Float-Args Method::"+(i+" "+f));
	}
	
	/*
	 * public static void m1(int i,long l) {
	 * System.out.println("Hi-->Int and long-Args Method::"+(i+" "+l)); }
	 */
}

//automatic type promotion in method overloading
//Byte -> short -> int  -> long -> float -> double
//char -> int  -> long -> float -> double

class Overloading_Case1Main{
	public static void main(String[] args) {
		Overloading_Case1 over= new Overloading_Case1();
		over.m1('a'); //Automatic promotion char to int
		over.m1(12.30f);//Automatic promotion from float to double
		over.m1('a',12);//Automatic promotion from char to int and int to double
		over.m1(11);
	}
}