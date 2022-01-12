package com.practice.oops.inheritance.isA;

public class IsARlationship {
	//it is also known as Inheritance.
	//we use extends keyword to implement is-a relationship.
	public void m1() {
		System.out.println("Parent Class");
	}
}

class ChildClass extends IsARlationship{
	//it is also known as Inheritance.
	//we use extends keyword to implement is-a relationship.
	public void m2() {
		System.out.println("Child Class");
	}
}

class MainClass {
	public static void main(String[] args) {
		IsARlationship isr = new IsARlationship();
		isr.m1();
		//isr.m2(); //Error parent cant access child methods
		
		ChildClass cc = new ChildClass();
		cc.m1();
		cc.m2(); 
		
		//polimorphism
		IsARlationship isrcc = new ChildClass();
		isrcc.m1();
		//isrcc.m2(); //with parent reference we cant access child class methods
		
		//with child reference we cant create object for parent class
		//ChildClass cciar = new IsARlationship();
	}
}