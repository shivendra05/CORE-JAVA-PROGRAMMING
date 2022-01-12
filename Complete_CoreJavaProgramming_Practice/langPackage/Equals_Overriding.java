package com.practice.langPackage;

public class Equals_Overriding {

	/*
	 * we can use equals() to check equality of 2 methods.
	 * 
	 * if our class doesnt contains equals() then Object class equals() will be executed.
	 * 
	 * Object class .equals() is meant for reference/address comparison.
	 * 
	 * based on our requirement, we can override equals() for content comparison.
	 * below we have overridden equals method.
	 * 
	 * while overriding equals() for content comparison, we have to take following
	 * 
	 * what is the meaning of equality 
	 * 
	 * 1.	whether we have take only name or rollnumber or both
	 * 2.	for different type of object our equals() should not raise classCasteException that is we have to handle classCasteException to return false
	 * 3.	if we are passing null arguments, then our equals() should not raise NullPointerException to return false
	 *  
	 *  
	 *  following are way of overriding equals().
	 *  
	 */
	public static void main(String[] args) throws ClassNotFoundException {

		Student_Equals_Overriding stud1= new Student_Equals_Overriding("Ansh",100);
		Student_Equals_Overriding stud2= new Student_Equals_Overriding("Anshi",101);
		Student_Equals_Overriding stud3= new Student_Equals_Overriding("Ansh",100);
		Student_Equals_Overriding stud4=stud1;


		System.out.println(stud1.equals(stud2));
		System.out.println(stud1.equals(stud3));
		System.out.println(stud1.equals(stud4));
		System.out.println(stud1.equals("shiv"));
		System.out.println(stud1.equals(null));
	}
}

class Student_Equals_Overriding{
	String name;
	int rollNo;
	Student_Equals_Overriding(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}

	public boolean equals(Object obj) {
		try {
			String name1= this.name;
			int rollNo1=this.rollNo;

			Student_Equals_Overriding studEqual = (Student_Equals_Overriding)obj;

			String name2= studEqual.name;
			int rollNo2=studEqual.rollNo;


			if (name1.equals(name2) && rollNo1==rollNo2) {
				return true;
			}else {
				return false;
			}
		}catch (ClassCastException e) {
			return false;// for other class object comparison
		}catch (NullPointerException e) {
			return false; // null value comparison
		}
	}
}