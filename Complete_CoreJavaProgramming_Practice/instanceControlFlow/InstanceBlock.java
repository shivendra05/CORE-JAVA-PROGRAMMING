package com.practice.instanceControlFlow;

public class InstanceBlock {
	//Instance control flow
	//Instance Member will be identified only when object is created.
	//Since Object isnt created only static flow will be executed.
	int i=20;
	{
		m1();
		System.out.println("First Instance block");
	}
	InstanceBlock(){
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
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