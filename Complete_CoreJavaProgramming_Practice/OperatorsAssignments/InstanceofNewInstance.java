package com.practice.OperatorsAssignments;

public class InstanceofNewInstance {
	public static void main(String[] args) throws Exception{
		
		Object obj = Class.forName(args[0]).newInstance();
		System.out.println("Object created for::"+obj);
	}
}

class Student1{
	
}
class Employee{
	
}
class Customer1{
	
}