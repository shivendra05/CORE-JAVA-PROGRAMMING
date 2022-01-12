package com.practice.exceptionHandling;

public class ThrowsException {

	//throws keyword is required only for checked exception
	
	//in our program if there is possibility of raising checked exception then compulsory we should handle
	//unreported exception.
	
	//case1
	/*public static void main(String[] args) {
		Thread.sleep(1000);
	}
	*/

	// we can use throws keyword to delegate responsibility of exception handling to the caller(another method/JVM).
	//then caller method is responsible to handle that exception.
	
	public static void main(String[] args) throws InterruptedException{
		Thread.sleep(1000);
	}
	//throws keyword doesnt prevent abnormal termination. throws keyword is required only to convince compiler	
}