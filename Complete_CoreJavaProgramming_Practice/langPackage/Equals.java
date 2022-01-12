package com.practice.langPackage;

public class Equals {

	/*
	 * we can use equals() to check equality of 2 methods.
	 * 
	 * if our class doesnt contains equals() then Object class equals() will be executed.
	 * 
	 * Object class .equals() is meant for reference/address comparison.
	 * 
	 * based on our requirement, we can override equals() for content comparison.
	 */
	public static void main(String[] args) throws ClassNotFoundException {

		Student_Equals stud1= new Student_Equals("Ansh",100);
		Student_Equals stud2= new Student_Equals("Anshi",101);
		Student_Equals stud3= new Student_Equals("Ansh",100);
		Student_Equals stud4=stud1;
		
		
		System.out.println(stud1.equals(stud2));
		System.out.println(stud1.equals(stud3));
		System.out.println(stud1.equals(stud4));
	}
}

class Student_Equals{
	String name;
	int rollNo;
	Student_Equals(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}
}