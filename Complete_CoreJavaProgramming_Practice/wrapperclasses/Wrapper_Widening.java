package com.practice.wrapperclasses;

import java.lang.reflect.Method;

public class Wrapper_Widening {

	/*
	 * Object class
	 * String class
	 * StringBuffer Class
	 * StringBuilder Class
	 * Wrapper Class -- wrapper class are immutable
	 * AutoBoxing and AutoUnboxing
	 */
	
	/* widening dominate autoboxing
	 */
	public void m1(Integer i) {
		System.out.println("Integer:: "+i);
	}
	
	public void m1(long l) {
		System.out.println("Widening :: "+l);
	}
	public static void main(String[] args) throws ClassNotFoundException {
		Wrapper_Widening i1 = new Wrapper_Widening();
		i1.m1(21);
		
	}
}