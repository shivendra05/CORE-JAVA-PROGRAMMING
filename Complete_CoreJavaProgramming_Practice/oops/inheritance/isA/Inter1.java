package com.practice.oops.inheritance.isA;

public interface Inter1 {
	//interface can extends any number of interfaces simultaneously
	
	public void m1();
}

interface Inter2 {
	//interface can extends any number of interfaces simultaneously
	
	public void m1();
}

interface Inter3 {
	//interface can extends any number of interfaces simultaneously
	
	public void m1();
}

interface Inter4 extends Inter1,Inter2,Inter3 {
	//interface can extends any number of interfaces simultaneously
	
	public void m1();
}