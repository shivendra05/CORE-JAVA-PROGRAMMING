package com.practice.oops.inheritance.hasA;

//late binding/runtime polymorphism/dynemic polymorphism 
public class OverRiding08{

	//Method Signature(Methods name and Argument type must be matched) must be same 
	//co-varient return type is allowed.(only for Object types, its should go from parentClass==parent to childClass==child)
	//co-varient return type is only applicable for object type not for primitive types

	//if no modifier then its default. in child class it could be public or protected but not private 
	void property() {
		System.out.println("Parent Property as Cash/Gold/Land");
	}
	//Access modifier change(higher to lower is not allowed) is allowed in methods overriding
	public Object marry() {
		System.out.println("Parent selected person for marry:: and only 1 marry");
		return 1;
	}
}

class Child8 extends OverRiding08{
	//overriding Methods	
	//OverRiding concept work for Final Overridden methods

	//Since parent method have modifier higher then only protected or public is allowed 
	protected	void property() {
			System.out.println("Child Property as Cash/Gold/Land");
		}
		
	//Access modifier change(higher to lower is not allowed) is allowed in methods overriding
	private Object marry() {
		System.out.println("Child selected person for marry:: and only 1 marry");
		return 1;
	}
}