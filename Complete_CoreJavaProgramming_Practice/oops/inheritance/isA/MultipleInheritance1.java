package com.practice.oops.inheritance.isA;

public class MultipleInheritance1 {
	public void m1() {
		System.out.println("Parent Class");
	}
}

class MultipleInheritance2{
	public void m2() {
		System.out.println("Child Class");
	}
}
//do Multiple Inheritance for classes

class MultipleInheritance extends MultipleInheritance1,MultipleInheritance2{
	//a java class cant extends more than one class at a time,
	//Hence Java dont provide support for Multiple inheritance.
	
	public void m2() {
		System.out.println("Child Class");
	}
}
//Note::if our class doesnt extends any other class then our class is a direct child of Object class
//if our class extends anyother class, then our class is a indirect child of Object class.
