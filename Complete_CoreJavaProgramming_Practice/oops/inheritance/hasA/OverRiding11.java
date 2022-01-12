package com.practice.oops.inheritance.hasA;

//late binding/runtime polymorephism/dynemic polymorphism 

public class OverRiding11{

	//Method Signature(Methods name and Argument type must be matched) must be same 
	//co-varient return type is allowed.(only fo rObject types, its should go from parentClass==parent to childClass==child)
	//co-varient return type is only applicable for object type not for premitive types

	//static method..can be overridden by another static method but its called as Method Hiding
	static public void marry() {
		System.out.println("Parent selected person for marry:: and only 1 marry");
	}
}

class Child11 extends OverRiding11{
	//overriding Methods	
		
	//static method is going to Hide parent class static method
	static public void marry() {
		System.out.println("Child selected person for marry:: and only 2 marry");
	}
}
/*
 * method hiding
 * 
 * method resolution taken care by compiler, so at run time, parent static method will be executed
 * 
 * */
class testMain{
	public static void main(String[] args) {
		OverRiding11 over = new OverRiding11();
		over.marry(); //direct match so Parent class method will be executed
		
		Child11 child = new Child11();
		child.marry();//direct match so child class method will be executed
		
		
		OverRiding11 overChild = new Child11();
		overChild.marry();//Since its static method overriding case, here parent method will be executed.
	}
}