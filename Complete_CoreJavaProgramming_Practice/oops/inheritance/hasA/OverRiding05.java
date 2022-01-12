package com.practice.oops.inheritance.hasA;

//late binding/runtime polymorphism/dynemic polymorphism 
public class OverRiding05{
//we can override parent class Non Abstract with child class Abstract mehtod
	
	//Method Signature(Methods name and Argument type must be matched) must be same 
	//co-varient return type is allowed.(only fo rObject types, its should go from parentClass==parent to childClass==child)
	//co-varient return type is only applicable for object type not for primitive types

	//if no modifier then its default.
	void property() {
		System.out.println("Parent Property as Cash/Gold/Land");
	}
	
	//Non Abstract method can be OverRidden by abstract method in child class 
	public Object marry() {
		System.out.println("Parent selected person for marry:: and only 1 marry");
		return 1;
	}
}

abstract class Child4 extends OverRiding05{
	//overriding methods as abstract to a Parent class non abstract method 
	public abstract Object marry();
}