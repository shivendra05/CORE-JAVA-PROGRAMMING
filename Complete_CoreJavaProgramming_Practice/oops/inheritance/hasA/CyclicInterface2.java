package com.practice.oops.inheritance.hasA;

//error
public class CyclicInterface2 extends CyclicInterface3{
	//cyclic interface(parent class extends direct child class) isnt allowed in java
	
	public void m1() {
		
	}
}
class CyclicInterface3 extends CyclicInterface2{
	//cyclic interface(child class extends direct parent class) isnt allowed in java
	
	public void m1() {
		
	}
}
