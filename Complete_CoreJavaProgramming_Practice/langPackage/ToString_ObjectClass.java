package com.practice.langPackage;

public class ToString_ObjectClass {

	/*
	 * we use toString to convert object type to String type.
	 * 
	 * whenever we are trying to print object reference internally toString() called.
	 * 
	 * if our class doesnt contain toString then Object class toString Method will be executed
	 * 
	 * All wrapper/collection/String/StringBuffer/StringBuilding class have overridden toString(), for meaningful representation.
	 * Hence its highly recommend to override in our class also 
	 */
	public static void main(String[] args) throws ClassNotFoundException {

		Student stud= new Student("Ansh",100);
		String str = stud.toString();
		System.out.println("Without To String"+stud);
		System.out.println("With To String"+str);
		System.out.println();
		Student stud1= new Student("Anshi",101);
		String str1 = stud1.toString();
		System.out.println("Without To String"+stud1);
		System.out.println("With To String"+str1);
	}
}

class Student{
	String name;
	int rollNo;
	Student(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}
}