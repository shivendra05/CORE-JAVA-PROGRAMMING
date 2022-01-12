package com.practice.SingletonClass;

/*
 * program to count # Object created for a class
 * */
public class Constructors2 {
	//main purpose of constructor is to inform inilization of an object
	//not to create a object
	public static int count=0;
	int rollno;
	String name;
	{
		count++;
	}
	Constructors2(){
	}

	Constructors2(int rollno){
		this.rollno=rollno;
	}
	
	Constructors2(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	
	/*
	 * difference between constructor and instance block
	 * 
	 * 
	 *main purpose of constructor is to inform inilization of an object if other than inilization if we want to
	 *perform any other activity we use instance block.
	 * 
	 *ex.	updating one entry in the data base for each object creation
	 *		increment count for each object creation 
	 * 
	 * 
	 * 
	 * */
}
class Constructors2Main {
	
	public static void main(String[] args) {
		Constructors2 cons1 = new Constructors2();
		Constructors2 cons2 = new Constructors2(100);
		Constructors2 cons3 = new Constructors2(100,"Shivendra");
		Constructors2 cons4 = new Constructors2(101,"Pandey");
		System.out.println("# Varibles created::"+Constructors2.count);
	}
	/*
	 * difference between constructor and instance block
	 * 
	 * 
	 *main purpose of constructor is to inform inilization of an object if other than inilization if we want to
	 *perform any other activity we use instance block.
	 * 
	 *ex.	updating one entry in the data base for each object creation
	 *		increment count for each object creation 
	 * 
	 * 
	 * 
	 * */
}