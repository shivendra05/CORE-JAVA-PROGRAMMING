package com.practice.oops.inheritance.hasA;

//late binding/runtime polymorphism/dynemic polymorphism 

public class OverRiding12_VarArg2{
	
	//var-arg method can be overridden by only var-arg method
	//var-arg method
	public void marry(int ...x) {
		System.out.println("Parent selected person for marry:: and only 1 marry"+x.length);
	}
}

class Child13 extends OverRiding12_VarArg2{
	//overriding Methods	
		
	// its method overridden, because both methods are Var-arg
		public void marry(int ...x) {
			System.out.println("Child selected person for marry:: and only 1 marry"+x.length);
		}
}

class TestMain1{
	public static void main(String[] args) {
		OverRiding12_VarArg2 over = new OverRiding12_VarArg2();
		over.marry(12); //direct match so Parent class method will be executed
		
		Child13 child = new Child13();
		child.marry(2);//direct match so child class method will be executed
		
		OverRiding12_VarArg2 overChild = new Child13();
		overChild.marry(21);//Since its method overriding, Since both methods are Var-arg
	}
}
 