package com.practice.instanceControlFlow;

public class StaticInstanceControlFlow3 {
	//static control flow

	//Identification of static member(variables/blocks/methods) from top to bottom
	//Execution of static variable assignments and static block from top to bottom.
	//Execution of main method
	//identification of Instance member(instance block/constructor) from top to bottom.
	//Execution of instance variable Assignments/Instance block from top to bottom
	//Execution of constructor

	public static String m1(String msg) {
		System.out.println(msg);
		return msg;
	}

	static	String m= m1("1");

	{
		m =m1("2");
	}

	static{
		m =m1("3");
	}

	public static void main(String[] args) {
		StaticInstanceControlFlow3 instance1 = new StaticInstanceControlFlow3();
	}

}
