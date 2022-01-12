package com.practice.Enum;

public class Enumeration4 {
	/* every enum constant is public static final, hence we can access enum constant using enum Name.
	 * 
	 * we can declare either within the class or outside the class but not inside a method,
	 * if we try to declare inside method, then we will get compile time error.
	 * 
	 * until 1.4v allowed data for switch was
	 * byte short int char
	 * 
	 *  from 1.5v 
	 *  in addition to old enum added 
	 *  
	 *  and from 1.7 
	 *  in addition to old String added
	 */
	
	enum Beer3{
		KF,RC,FO; //semicolon is optional
	}

	public static void main(String[] args) {
		Beer3 b = Beer3.KF;
		System.out.println(b); //toString() overriden to return name of the constant
	}
}

