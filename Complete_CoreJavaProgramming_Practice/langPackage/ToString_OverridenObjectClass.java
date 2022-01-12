package com.practice.langPackage;

public class ToString_OverridenObjectClass {

	/*
	 * we use toString to convert object type to String type.
	 * 
	 * whenever we are trying to print object reference internally toString() called.
	 * 
	 * if our class doesnt contain toString then Object class toString Method will be executed
	 */
	public static void main(String[] args) throws ClassNotFoundException {

		Student1 stud= new Student1("Ansh",100);
		String str = stud.toString();
		System.out.println("Without To String"+stud);
		System.out.println("With To String"+str);
		
		System.out.println();
		
		Student1 stud1= new Student1("Anshi",101);
		String str1 = stud1.toString();
		System.out.println("Without To String"+stud1);
		System.out.println("With To String"+str1);
	}
}

class Student1{
	String name;
	int rollNo;
	Student1(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}
	@Override
	public String toString() {
		return " "+name+" "+rollNo;
	}
}