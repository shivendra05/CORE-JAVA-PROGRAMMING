package com.practice.wrapperclasses;

import java.lang.reflect.Method;

public class VarArg_AutoBoxning {

	/*
	 * Object class
	 * String class
	 * StringBuffer Class
	 * StringBuilder Class
	 * Wrapper Class -- wrapper class are immutable
	 * AutoBoxing and AutoUnboxing
	 */
	
	/*
	 * if no option then only Var-Arg (least priority to Var-arg)
	 * */
	public void m1(int... i) {
		System.out.println("Var-Arg:: "+i);
	}
	
	public void m1(Integer l) {
		System.out.println("AutoBoxing :: "+l);
	}
	public static void main(String[] args) throws ClassNotFoundException {
		VarArg_AutoBoxning i1 = new VarArg_AutoBoxning();
		i1.m1(21);
		
	}
}