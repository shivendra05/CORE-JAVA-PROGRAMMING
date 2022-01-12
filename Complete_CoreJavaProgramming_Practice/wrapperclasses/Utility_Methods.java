package com.practice.wrapperclasses;

public class Utility_Methods {

	/*
	 * valueOf()
	 * xxxValue()
	 * parseXxx()
	 * toString()
	 */

	/*
	 * valueOf()
	 * 
	 * public static wrapper  valueOf(String s);
	 * public static wrapper  valueOf(String s, int redix);
	 * 
	 * we can use valueOf() to create wrapper object for the given primitive or String.
	 */

	/*
	 * xxxValue()
	 * 
	 * we can use xxxValue() to get primitive of a given wrapper object
	 */


	/*
	 * parseXxx()
	 * 
	 * we can use parseXxx() to convert String to primitive
	 * every wrapper class except Character class
	 */

	/*
	 * toString()
	 * 
	 * we can used to convert wrapper or primitive to String
	 */
	public static void main(String[] args) throws ClassNotFoundException {

		Integer i1 = Integer.valueOf("10");//String to Wrapper class
		Double i2 = Double.valueOf(10);//primitives to wrapper class
		System.out.println(i1+"  "+i2);

		System.out.println("----------------------");

		Integer i =new  Integer(10);
		System.out.println(i.intValue());
		System.out.println(i.byteValue());
		System.out.println(i.shortValue());
		System.out.println(i.longValue());

		System.out.println("----------------------");

		int in = Integer.parseInt("10");
		System.out.println(i.intValue());
		
		System.out.println("----------------------");

		Integer to = Integer.parseInt("10");
		System.out.println(to.toString());

	}
}