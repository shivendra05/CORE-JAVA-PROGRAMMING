package com.practice.oops.construtor;

public abstract class AbstractClass {
	/*
	 * Abstract class allows constructors but interface doesnt
	 * 
	 * */
	int a;
	int b;
	public AbstractClass() {
	}
	public abstract int add();
	public abstract int add(int a, int b);	
}