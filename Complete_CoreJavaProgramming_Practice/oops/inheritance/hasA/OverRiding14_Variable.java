package com.practice.oops.inheritance.hasA;

//late binding/runtime polymorephism/dynemic polymorphism 

public class OverRiding14_Variable{
	//Variables overriding
	//Variable resolution always taken by referenced calls, irrespective of variable type(static to non static or vica versa or same type)
	int x=888;
}

class Child14 extends OverRiding14_Variable{
	//overriding Methods	

	//Variables overriding 
		//Variable resolution always taken by referenced calls, irrispectiv of veriable type(static to non static or vica versa or same type)
		int x=999;
}

class TestMainVariable{
	public static void main(String[] args) {
		OverRiding14_Variable over = new OverRiding14_Variable();
		System.out.println(over.x);; //Variable overriding always taken values from reference side
		
		Child14 child = new Child14();
		System.out.println(child.x);; //Variable overriding always taken values from reference side
		
		OverRiding14_Variable overChild = new Child14();
		System.out.println(overChild.x);; //Variable overriding always taken values from reference side
	}
}
 