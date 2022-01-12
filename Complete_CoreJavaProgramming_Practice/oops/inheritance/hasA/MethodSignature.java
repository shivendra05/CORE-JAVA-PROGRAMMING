package com.practice.oops.inheritance.hasA;

public class MethodSignature{
	//method name followed by parameter are part of Method signature

	public static int m1(int i,float f) {
		return i;
	}
	
	//within a class with the same signature methods are not allowed
	//even if return type is different, methods is taken as overloaded method
	public static void m2(int i,float f) {
		System.out.println("Hi");
	}
	public static int m2(int i,float f) {
		return i;
	}
}