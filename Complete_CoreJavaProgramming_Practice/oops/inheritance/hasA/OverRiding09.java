package com.practice.oops.inheritance.hasA;

//late binding/runtime polymorephism/dynemic polymorphism 

public class OverRiding09{

	//Method Signature(Methods name and Argument type must be matched) must be same 
	//co-varient return type is allowed.(only fo rObject types, its should go from parentClass==parent to childClass==child)
	//co-varient return type is only applicable for object type not for premitive types

	//non- static method.... non-static method cant be overridden  
	public void marry() {
		System.out.println("Parent selected person for marry:: and only 1 marry");
	}
}

class Child9 extends OverRiding09{
	//overriding Methods	
		
	//cant override non-static methods, we will get compile tie error
	static public void marry() {
		System.out.println("Child selected person for marry:: and only 1 marry");
	}
}