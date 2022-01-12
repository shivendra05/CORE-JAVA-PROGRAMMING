package com.practice.oops.inheritance.hasA;

//late binding/runtime polymorphism/dynemic polymorphism 
public class OverRiding01{
	//methods are said to be overridden if Child classes are not happy with parents method definition.

	public void property() {
		System.out.println("Parent Property as Cash/Gold/Land");
	}
	//OverRidden Method
	public void marry() {
		System.out.println("Parent selected person for marry");
	}
}
class Child extends OverRiding01{
	//overriding Methods	
	public void marry() {
		System.out.println("Our Own selection for marry");
	}	
}

class OverRidingMain{
	public static void main(String[] args) {
		OverRiding01 over= new OverRiding01();
		over.marry();
		
		Child child= new Child();
		child.marry();
		
		OverRiding01 overChild= new Child();
		overChild.marry();//reference from parent(check method is present or not), if method is present in parent and child class then
		// method will be executed from child class, If method is not present in child class(not overridden) then
		//parent method will be executed.
	}
}