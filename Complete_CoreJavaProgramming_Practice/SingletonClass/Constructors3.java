package com.practice.SingletonClass;

/*
 * program to count # Object created for a class
 * */
public class Constructors3 {
	//main purpose of constructor is to inform inilization of an object
	//not to create a object
	public static int count=0;
	int rollno;
	String name;
	
	{
		count++;
	}
	public Constructors3(){
	}

	private Constructors3(int rollno){
		this.rollno=rollno;
	}
	
	protected Constructors3(int rollno,String name){
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
class Constructors3Main {
	
	public static void main(String[] args) {
		Constructors3 cons1 = new Constructors3();
		Constructors3 cons2 = new Constructors3(100,"PandeyJI");
		Constructors3 cons3 = new Constructors3(100,"Shivendra");
		Constructors3 cons4 = new Constructors3(101,"shiv");
		System.out.println("# Varibles created::"+Constructors3.count);
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