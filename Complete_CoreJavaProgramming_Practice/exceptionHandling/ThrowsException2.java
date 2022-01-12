package com.practice.exceptionHandling;

public class ThrowsException2 {
	//throws keyword is required only for checked exception

	//in our program if there is possibility of raising checked exception then compulsory we should handle
	//unreported exception.

	// we can use throws keyword to delegate responsibility of exception handling to the caller(another method/JVM).
	//then caller method is responsible to handle that exception.

	//throws keyword doesnt prevent abnormal termination. throws keyword is required only to convince compiler	
	public static void main(String[] args) throws InterruptedException{
		doStuff();
	}

	private static void doStuff() throws InterruptedException{
		doMoreStuff();
	}

	private static void doMoreStuff() throws InterruptedException{
		Thread.sleep(10000);
	}
}