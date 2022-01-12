package com.practice.oops.construtor;

public class Constructors {
	//main purpose of constructor is to perform initialization of an object
	//not to create a object
	int rollno;
	String name;
	Constructors(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	
	public static void main(String[] args) {
		Constructors cons = new Constructors(100,"Shivendra");
		Constructors cons1 = new Constructors(101,"Pandey");
	}
	/*difference between constructor and instance block
	 * 
	 *main purpose of constructor is to perform initialization of an object, if other than initialization, we want to
	 *perform any other activity we use instance block.
	 * 
	 *ex.	updating one entry in the data base for each object creation
	 *		increment count for each object creation 
	 * */
}