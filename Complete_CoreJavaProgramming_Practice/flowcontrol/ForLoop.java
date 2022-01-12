package com.practice.flowcontrol;

public class ForLoop {
	public static void main(String[] args) {

		//infinite loop
		/*for (int i=0;true;i++) {
			System.out.println("Hello");
		}*/

		//Valid
		for (int i = 0; i < 10; i++);

		//in-Valid, If one statement after loop is allowed but except declarative.
		/*	for (int i = 0; i < 10; i++)
				int i=10;
		 */

		//loop initialization, can initialize multiple values but all should be of same type

		for (int i = 0,j=12; i < args.length; i++);
		//for (int i = 0,j=12,String="shiv"; i < args.length; i++); compile time error
		for (int i = 0,j=12,g='v'; i < args.length; i++);

		int x=1;
		for (System.out.println("Hey How are you"); x < 3; x++) {
			System.out.println("Hey, I am good");
		}

		//condition could be any valid java boolean expression, and its optional
		//(Compiler will place true, if we dont write anything in condition part.)
		//since condition part blank so it's always true.....infinite loop
		
/*		for (System.out.println("Hey How are you");; x++) {
			System.out.println("Hey, I am good");
		}
 */
		
		//increment/decrement could be any valid java boolean expression, and its optional
		//since SOP it will print string values. 
		x=0;
		for (System.out.println("Hey How are you");x<=5; System.out.println("HI")) {
			x++;
		}
		
		//since condition part blank so it's always true.....So, infinite loop 
		/*for (;;) {
			System.out.println("Hi");
		}*/
		
		//since condition part blank so it's always true.....So, infinite loop 
		for (;;);
	}	
}