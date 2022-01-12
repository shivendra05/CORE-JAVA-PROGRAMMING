package com.practice.declarationAccessModifier;

public class ProtectedA {
	public void printMSG() {
		System.out.println("Protected memeber cant be access with parent referen. out side package in child class");
	}
}

class ProtectedB extends ProtectedA{
	public static void main(String[] args) {
		//parent reference with parent constructor
		ProtectedA aa= new ProtectedA();
		aa.printMSG();

		//child reference with child constructor
		ProtectedB bb= new ProtectedB();
		bb.printMSG();

		//parent reference with child constructor
		ProtectedA ab= new ProtectedB();
		ab.printMSG();
	}
}