package com.practice.oops.inheritance.hasA;

//late binding/runtime polymorephism/dynemic polymorphism 
public class OverRiding07{

	//Method Signature(Methods name and Argument type must be matched) must be same 
	//co-varient return type is allowed.(only fo rObject types, its should go from parentClass==parent to childClass==child)
	//co-varient return type is only applicable for object type not for premitive types

	//if no modifier then its default.
	void property() {
		System.out.println("Parent Property as Cash/Gold/Land");
	}
	
	//synchronized to non-synchronized and vica versa is allowed for OverRidden
	synchronized public Object marry() {
		System.out.println("Parent selected person for marry:: and only 1 marry");
		return 1;
	}
}

class Child7 extends OverRiding07{
	//overriding Methods	
	//OverRiding concept work for Final Overridden methods

	//synchronized to non-synchronized and vica versa is allowed for OverRidden
	public final Object marry() {
		System.out.println("Child selected person for marry:: and only 1 marry");
		return 1;
	}
}