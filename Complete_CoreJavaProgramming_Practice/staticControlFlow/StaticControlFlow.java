package com.practice.staticControlFlow;

public class StaticControlFlow {
	//static control flow

	//Identification of static members(variable/block/method) from top to bottom
	// Execution of static variable assignments and static block from top to bottom.
	// Execution of main method
	static int i=20;
	static {
		m1();
		System.out.println("First Static block");
	}
	public static void main(String[] args) {
		m1();
		System.out.println("Main Method");
	}
	public static void m1() {
		System.out.println(j);
	}
	static {
		System.out.println("Second Static block");
	}
	static int j=20;
}
