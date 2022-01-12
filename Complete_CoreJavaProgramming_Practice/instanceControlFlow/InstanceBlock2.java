package com.practice.instanceControlFlow;

public class InstanceBlock2 {
	//Instance control flow

	//Instance Member will be identified only when object is created.
	//Since Object isn't created only static flow will be executed.

	//instance control flow..

	//identification of Instance member from top to bottom.
	//Execution of instance variable, Assignments, Instance block from top to bottom
	//Execution of constructor
	int i=20;
	{
		m1();
		System.out.println("First Instance block");
	}

	InstanceBlock2(){
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		InstanceBlock2 instance = new InstanceBlock2();
		System.out.println("Main");
	}
	public void m1() {
		System.out.println(j);
	}
	{
		System.out.println("Second Instance block");
	}
	int j=20;
}
