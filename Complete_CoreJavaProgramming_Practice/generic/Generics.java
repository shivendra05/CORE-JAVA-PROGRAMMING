package com.practice.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Generics {
	/*1. intro
	 *2. Generic classes
	 *3. Bounded Types
	 *4. Generic Methods and Wildcard character
	 *5. Communication with Generic Code
	 *
	 * Main objectives of Generic are:
	 * to provide type safety and to resolve type casting problem.
	 * polymorphism(usage of parent reference to hold child object) concept is applicable only for the base type but not for parameter types.
	 * primitive types arent allowed on generic types.
	 *
	 * Bounded types
	 * -------------------
	 * we can bound, type of parameter for a range using extends keyword, Such types are called bounded types.
	 * as type parameter we can pass any type and there is on restrictions and hence it is unbounded types.
	 * Test<T extends Number>  --> T child class of Number class
	 * Test<T extends Runnable> --> T implements Runnable interface
	 * Test<T extends Number & Runnable> --> T child class of Number and implements Runnable interface
	 * Test<T extends Runnable & Comparable> --> 
	 * Test<T extends Number & Runnable & Comparable> --> 
	 * 
	 * Test<T extends Runnable & Number> --Not allowed, because first class then Interface is allowed
	 * Test<T extends Thread & Number> --Not allowed, because only one class can be extended at a time
	 * Test<T implements Runnable> ---Implements keyword is not allowed(only extends is allowed)
	 * Test<T super String> ---super keyword is not allowed(only extends is allowed)
	 * 
	 * We can define bounded types only by using extends keyword and we cant use implements and Super keywords
	 * but we can replace implements keyword purpose extends keywords.
	 */
}

class Test<T extends Number>{
	public void cal(T a,T b) {
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
}