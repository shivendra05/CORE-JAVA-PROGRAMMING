package com.practice.oops.inheritance.hasA;

//late binding/runtime polymorphism/dynemic polymorphism 
public class OverRiding03{
	
	//Method Signature(Methods name and Argument type must be matched) must be same 
	//co-varient return type is allowed.(only fo rObject types, its should go from parentClass==parent to childClass==child)
	//co-varient return type is only applicable for object type not for primitive types
	
	//if no modifier then its default.
	 void property() {
		System.out.println("Parent Property as Cash/Gold/Land");
	}
	//Private method cant be OverRidden
	private Object marry() {
		System.out.println("Parent selected person for marry:: and only 1 marry");
		return 1;
	}
}

class Child2 extends OverRiding03{
	//overriding Methods	
	//Private method could be written, same again in the child class but its not a OverRiding method
		private Object marry() {
			System.out.println("Child selected person for marry:: and only 1 marry");
			return 1;
		}
}
