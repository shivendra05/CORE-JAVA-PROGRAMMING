package com.practice.wrapperclasses;

import java.lang.reflect.Method;

public class Wrapper_Classes {

	/*
	 * Object class
	 * String class
	 * StringBuffer Class
	 * StringBuilder Class
	 * Wrapper Class -- wrapper class are immutable
	 * AutoBoxing and AutoUnboxing
	 */
	
	/*
	 * the main objectives of wrapper classes are, to wrap primitives into Object form so that we can handle just like object
	 * 
	 * to define several utility methods(toString()) which are required for primitives.
	 * 
	 * almost all wrapper class contains 2 constructors, one can take corresponding primitives as arg and other can String as arg.
	 */
	
	public static void main(String[] args) throws ClassNotFoundException {
		Integer i1 = new Integer("10");//String
		Integer i2 = new Integer(10);//int primitives
		System.out.println(i1+"  "+i2);
		
		Boolean b1= new Boolean(false);
		Boolean b2= new Boolean(true);
		System.out.println(b1+"  "+b2);
		
		Boolean b3= new Boolean("Hello");
		Boolean b4= new Boolean(true);
		System.out.println(b3+"  "+b4);
		
		
		Integer intValue1 = 10;
		intValue1++;
		Integer intValue2 = intValue1+1;
		intValue1++;
		
		System.out.println(intValue1+" -- "+intValue2);
		
	}
}