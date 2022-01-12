package com.practice.exceptionHandling;

public class ThrowsException3 extends RuntimeException{
	// we can use throws keyword only or throwable type, if we are trying for normal java class
	// then we will get incompatible types.
	
	//throws keyword is required only for checked exception

	//in our program if there is possibility of raising checked exception then compulsory we should handle
	//unreported exception.

	// we can use throws keyword to delegate responsibility of exception handling to the caller(another method/JVM).
	//then caller method is responsible to handle that exception.

	//throws keyword doesnt prevent abnormal termination. throws keyword is required only to convince compiler	
	public static void main(String[] args) throws InterruptedException,ThrowsException3{
		doStuff();
	}

	private static void doStuff() throws InterruptedException,ThrowsException3{
		doMoreStuff();
	}

	private static void doMoreStuff() throws InterruptedException{
		Thread.sleep(10000);
	}
}