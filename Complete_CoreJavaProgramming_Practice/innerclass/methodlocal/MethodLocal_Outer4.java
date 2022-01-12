package com.practice.innerclass.methodlocal;

//outerClass
public class MethodLocal_Outer4 {
	/*2. Method-Local Inner Class
	 * 
	 * the main purpose is is to define method specific functionality, method local inner class are best suitable to meet nested method requirements
	 * 
	 *  we can access this only where we declare, out side method we can access, because of its less scope, 
	 *  method local inner class most rarely used inner class.
	 *  
	 *  we can declare method local inner class inside instance/static method
	 */
	//instance Method InnerClass
	public void m1() {
		/*
		 * we cant access local variables of a method in which we declared inner class, if the local variable declared as 
		 * final we can access
		 * */
		final int a=111;
		class MethodLocal_Innter{
			/*
			 * sometimes we can declared a class inside a method, such type of inner classes are called method local inner class
			 */
			/*
			 * inside inner class we cant declare static variables/methods
			 * inside static method we can access only static variables, instance variable give compile time error
			 * */
			public void sum() {
				System.out.print(a);
			}
		}
		new MethodLocal_Innter().sum();
	}

	public static void main(String[] args) {
		MethodLocal_Outer4 outer = new MethodLocal_Outer4();
		outer.m1();
	}
}