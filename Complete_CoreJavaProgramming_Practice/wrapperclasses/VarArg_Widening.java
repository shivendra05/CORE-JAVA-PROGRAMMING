package com.practice.wrapperclasses;

import java.lang.reflect.Method;

public class VarArg_Widening {

	/*
	 * Object class
	 * String class
	 * StringBuffer Class
	 * StringBuilder Class
	 * Wrapper Class -- wrapper class are immutable
	 * AutoBoxing and AutoUnboxing
	 */
	
	/* If No option then only Var-Argu will be preferred (Var-Arg gets least chance)
	 */
	public void m1(int... i) {
		System.out.println("Var-Arg:: "+i);
	}
	
	public void m1(long l) {
		System.out.println("Widening :: "+l);
	}
	public static void main(String[] args) throws ClassNotFoundException {
		VarArg_Widening i1 = new VarArg_Widening();
		i1.m1(21);
		
	}
}