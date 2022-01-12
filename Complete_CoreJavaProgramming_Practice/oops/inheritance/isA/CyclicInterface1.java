package com.practice.oops.inheritance.isA;

//error
public class CyclicInterface1 extends CyclicInterface1{
	//cyclic interface(class extends same class) isnt allowed in java
	
	public void m1();
}
