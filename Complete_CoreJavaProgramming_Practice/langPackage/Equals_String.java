package com.practice.langPackage;

public class Equals_String {

	/*
	 * String class overrides Object class equals() for content comparison, so even objects are different and content is same it return true. 
	 * 
	 * while String Buffer doesnt overrides Object class equals(), so it does reference comparison
	 */
	public static void main(String[] args) throws ClassNotFoundException {

		String stud1= new String("Ansh");
		String stud2= new String("Ansh");
		
		StringBuffer stud3= new StringBuffer("Ansh");
		StringBuffer stud4= new StringBuffer("Ansh");
		
		System.out.println(stud1==stud2); //reference
		System.out.println(stud1.equals(stud2)); //content(because overridden on String class)
		
		System.out.println(stud3==stud4); //reference
		System.out.println(stud3.equals(stud4)); //reference(because not overridden in StringBuffer class)
	}
}
