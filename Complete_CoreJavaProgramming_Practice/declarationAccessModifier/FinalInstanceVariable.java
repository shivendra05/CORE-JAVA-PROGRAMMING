package com.practice.declarationAccessModifier;

public class FinalInstanceVariable {
	//instance/object variable...as many object that many copies
	//3 places to initialize final instance variable
	final int a;

	/*
	//1st at declaration time
	final int a=10;
	*/
	
	//2nd at instance bloack
	/*	{
		a=10;
		}
	 */
	
	//3rd at constructor
	FinalInstanceVariable(){
		a=10;
	}
	public static void main(String[] args) {
		FinalInstanceVariable fisv= new FinalInstanceVariable();
		System.out.println(fisv.a);
	}	
}