package com.practice.instanceControlFlow;

public class StaticInstanceControlFlow {
	//static control flow

	//Identification of static member(variables/blocks/methods) from top to bottom
	//Execution of static variable assignments and static block from top to bottom.
	//Execution of main method
	//identification of Instance member(instance block/constructor) from top to bottom.
	//Execution of instance variable Assignments/Instance block from top to bottom
	//Execution of constructor

	{
		System.out.println("First Instance block");
	}
	
	static {
		System.out.println("First Static block");
	}
	
	StaticInstanceControlFlow(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		StaticInstanceControlFlow instance1 = new StaticInstanceControlFlow();
		System.out.println("Main Method");
		StaticInstanceControlFlow instance2 = new StaticInstanceControlFlow();
	}
	
	static {
		System.out.println("Second Static block");
	}
	
	{
		System.out.println("Second Instance block");
	}
}
