package com.practice.declarationAccessModifier;

public class FinalLocalVariable {
	//local/stack/automatic variable...
	public static void main(String[] args) {
		
		//if variable not used, no need to initialize
		//only applicable modifier for local variable is final.
		//other modifier will throw compile time error.
		
		final int a;
		System.out.println("Hello");

		final int b=20;
		System.out.println("Hello::- b::"+b);
	}	
}