package com.practice.oops.inheritance.hasA;

//late binding/runtime polymorephism/dynemic polymorphism 

public class OverRiding12_VarArg{
	
	//var-arg method can be overridden by only var-arg method
	//var-arg method
	public void marry(int ...x) {
		System.out.println("Parent selected person for marry:: and only 1 marry"+x.length);
	}
}

class Child12 extends OverRiding12_VarArg{
	//overriding Methods	
		
	//Normal method cant override Var-arg method
	public void marry(int x) {
		System.out.println("Child selected person for marry:: and only 2 marry");
	}
}
/*
 * Var-arg Method cant be overridden.. It bahaves like a Method overloading
 * 
 * */
class TestMain3{
	public static void main(String[] args) {
		OverRiding12_VarArg over = new OverRiding12_VarArg();
		over.marry(12); //direct match so Parent class method will be executed
		
		Child12 child = new Child12();
		child.marry(2);//direct match so child class method will be executed
		
		OverRiding12_VarArg overChild = new Child12();
		overChild.marry(21);//Since its method overloading, Var-arg behaves like loading not overriding
	}
}
 