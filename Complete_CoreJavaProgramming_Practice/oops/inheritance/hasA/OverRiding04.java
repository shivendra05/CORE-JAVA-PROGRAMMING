package com.practice.oops.inheritance.hasA;

//late binding/runtime polymorphism/dynemic polymorphism 
public class OverRiding04{

	//Method Signature(Methods name and Argument type must be matched) must be same 
	//co-varient return type is allowed.(only for Object types, its should go from parentClass==parent to childClass==child)
	//co-varient return type is only applicable for object type not for primitive types

	//if no modifier then its default.
	void property() {
		System.out.println("Parent Property as Cash/Gold/Land");
	}
	
	//final method cant be OverRidden
	public final Object marry() {
		System.out.println("Parent selected person for marry:: and only 1 marry");
		return 1;
	}
}

class Child3 extends OverRiding04{
	//overriding Methods	
	//OverRiding concept work for Final Overridden methods
	//marry is overridden in parent as its final.

	public Object marry() {
		System.out.println("Child selected person for marry:: and only 1 marry");
		return 1;
	}
}