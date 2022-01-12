package com.practice.exceptionHandling;

public class ThrowExceptionHandling {
	//Finally:: to clean up, activity related to try block such that all resources opened by try block
	
	//Finalize():: to clean up activities related to objects that is all resources associated with objected will be dis-associated
	
	//throw is best for user defined exception
	
	//case1
	/*
	static ArithmeticException ae = new ArithmeticException();
	public static void main(String[] args) {
		throw ae;
	}
	*/
	
	//case2	
	/*
	static ArithmeticException ae;
	public static void main(String[] args) {
		throw ae;
	}
	*/
	
	//case3
	/*
	public static void main(String[] args) {
		throw new ArithmeticException("/ by 0");
		System.out.println("Hello");//now allows to write any statement after throw, we will get error unreachable
	}*/
	
	//case4
		public static void main(String[] args) {
			//throw new ThrowExceptionHandling; //we can throw any throwable type objects only(not all object), 
								//but if the same class extends throwable type then the same class would be throwable
		}
}

class ThrowClass extends RuntimeException{
	public static void main(String[] args) {
		throw new ThrowClass();//if a class extends throwable type then the same class would be throwable
	}
}