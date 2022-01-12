package com.practice.innerclass.staticnestedclass;

//outerClass
public class StaticNested_Outer {
	/* 3. Static Nested Inner Class
	 * 
	 * sometimes we can declare inner class with static modifier, such type of inner class are class static nested classes.
	 *  
	 *  in the case of normal or regular inner class there is no chance of existing inner class object. 
	 *  that is inner class object is strongly associated with outer class object.
	 *  
	 *  but in the case of static nested class with existing outer classes there may be chance of existing nested class object hence
	 *  static nested class object isnt strongly associated with outer class object
	 */
	static class StaticNested_Inner{
		public void m1() {
			System.out.println("Static Nested Inner class");
		}
	}
	
	public static void main(String[] args) {
		StaticNested_Inner staticInner = new StaticNested_Inner();
		staticInner.m1();
	}
}
