package com.practice.SingletonClass;

/*
 * 1. inheritance and overriding concepts are not application
 * 2. every class in java including abstract class contains constructor but interface doesnt contain constructor
 * */
public class Constructors4Overloaded {
	//main purpose of constructor is to inform inilization of an object
	//not to create a object

	public Constructors4Overloaded(){
		this(12);
		System.out.println("No Args constructor");
	}

	public Constructors4Overloaded(int rollno){
		this(122,"shiv");
		System.out.println("1-Args constructor::"+rollno);
	}

	protected Constructors4Overloaded(int rollno,String name){
		System.out.println("2-Args constructor::"+rollno+" :: "+name);
	}
}

class Constructors4OverloadedMain {

	public static void main(String[] args) {
		Constructors4Overloaded cons1 = new Constructors4Overloaded();
		Constructors4Overloaded cons2 = new Constructors4Overloaded(100);
		Constructors4Overloaded cons3 = new Constructors4Overloaded(1000,"Pandey");
	}
}