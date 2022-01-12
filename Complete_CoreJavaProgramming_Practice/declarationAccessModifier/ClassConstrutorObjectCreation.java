package com.practice.declarationAccessModifier;

// when we create child of bottom most class other parent classes object isnt create 
// but their constructors are always called
public class ClassConstrutorObjectCreation{
	ClassConstrutorObjectCreation(){
		System.out.println("I am Top Most Parent Class");
	}
}

class ClassTop extends ClassConstrutorObjectCreation{
	ClassTop(){
		System.out.println("I am Top Parent Class");
	}
}

class LowerMostClass extends ClassTop{
	LowerMostClass(){
		System.out.println("I am Lower Most Class");
	}
	public static void main(String[] args) {
		LowerMostClass lmc = new LowerMostClass();
	}
}