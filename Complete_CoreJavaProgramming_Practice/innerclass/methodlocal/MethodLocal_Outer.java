package com.practice.innerclass.methodlocal;

//outerClass
public class MethodLocal_Outer {
	/*2. Method-Local Inner Class
	 * 
	 * the main purpose is is to define method specific functionality, method local inner class are best suitable to meet nested method requirements
	 * 
	 *  we can access this only where we declare, out side method we cant access, because of its scopeless class, 
	 *  method local inner class most rarely used inner class.
	 *  
	 *  we can declare method local inner class inside instance/static method
	 */
	
	//Instance Method InnerClass
	public void m1() {
		class MethodLocal_Innter{
			/*sometimes we can declared a class inside a method, such type of inner classes are called method local inner class
			 */
			public int sum(int a, int b) {
				return a+b;
			}
		}
		System.out.println(new MethodLocal_Innter().sum(1, 2));
		System.out.println(new MethodLocal_Innter().sum(10, 20)); 
		System.out.println(new MethodLocal_Innter().sum(100, 200));
	}
	
	public static void main(String[] args) {
		MethodLocal_Outer outer = new MethodLocal_Outer();
		outer.m1();
	}
}