package com.practice.declarationAccessModifier;

public final class FinalClassVariableMethod {
	static int a=10;
	public static void main(String[] args) {
		//every method present inside final class is final but not all variable inside final class are final
		a=900;
		System.out.println(a);
		System.out.println(FinalClassVariableMethod.a);
	}	
}