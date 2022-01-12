package com.practice.innerclass.methodlocal;

//outerClass
public class MethodLocal_Outer3 {
	/*2. Method-Local Inner Class
	 * 
	 * the main purpose is to define method specific functionality, method local inner class are best suitable to meet nested method requirements
	 * 
	 *  we can access this only where we declare, out side method we can access, because of its less scope, 
	 *  method local inner class most rarely used inner class.
	 *  
	 *  we can declare method local inner class inside instance/static method
	 */
	int a=1000;
	static int b=2000;
	//instance Method InnerClass
	public static void m1() {
		class MethodLocal_Innter{
			/* sometimes we can declared a class inside a method, such type of inner classes are called method local inner class
			 */
			
			/*
			 * inside inner class we cant declare static variables and methods
			 * inside static method we can access only static variables, instance variable give compile time error
			 * */
			public int sum(int a, int b) {
				System.out.print(a+" + "+b+" --> ");
				return a+b;
			}
		}
		System.out.println(new MethodLocal_Innter().sum(1, 2));
		System.out.println(new MethodLocal_Innter().sum(10, 20)); 
		System.out.println(new MethodLocal_Innter().sum(100, 200));
		//System.out.println(new MethodLocal_Innter().sum(a, b));
	}
	
	public static void main(String[] args) {
		MethodLocal_Outer3 outer = new MethodLocal_Outer3();
		outer.m1();
	}
}