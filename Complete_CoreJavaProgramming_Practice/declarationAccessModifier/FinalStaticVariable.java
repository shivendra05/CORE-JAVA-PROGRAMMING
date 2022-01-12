package com.practice.declarationAccessModifier;

public class FinalStaticVariable {
	//static/class variable...only one copy

	//2 places to initialize final instance variable

	//1st at declaration time
	/*final static int a=100;
	 */

	//2nd at instance block
	final static int a;
	static{
		a=1000;
	}

	public static void main(String[] args) {
		FinalStaticVariable fisv= new FinalStaticVariable();
		System.out.println(fisv.a);
	}	
}