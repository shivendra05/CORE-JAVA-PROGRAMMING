package com.practice.oops.inheritance.hasA;

//late binding/runtime polymorphism/dynemic polymorphism 
public class OverRiding02{
	
	//Method Signature(Methods name and Argument type must be matched) must be same 
	//co-veriant return type is allowed.(only for Object types, it should go from parentClass==parent to childClass==child)
	//co-varient return type is only applicable for object type not for primitive types
	
	public void property() {
		System.out.println("Parent Property as Cash/Gold/Land");
	}
	
	//OverRidden Method
	public Object marry() {
		System.out.println("Parent selected person for marry:: and only 1 marry");
		return 1;
	}
}

class Child1 extends OverRiding02{
	//overriding Methods	
	public String marry() {
		System.out.println("Our Own selection for marry");
		return "";
	}

}

class OverRiding2Main{
	public static void main(String[] args) {
		OverRiding02 over= new OverRiding02();
		over.marry();

		Child child= new Child();
		child.marry();

		OverRiding02 overChild= new Child1();
		overChild.marry();//reference from parent(check method is present or not), if method is present in parent and child class then
		// method will be executed from child class, If method isnot present in child class(not overridden) then
		//parent method will be executed.
	}
}