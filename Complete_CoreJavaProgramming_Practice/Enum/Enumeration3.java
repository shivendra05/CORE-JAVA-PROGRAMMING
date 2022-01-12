package com.practice.Enum;

public class Enumeration3 {
	/* every enum constant is public static final, hence we can access enum constant using enum Name.
	 * 
	 * we can declare either within the class or outside the class but not inside a method,
	 * if we try to declare inside method, then we will get compile time error.
	 */
	enum Beer2{
		KF,RC,FO; //semicolon is optional
	}

	public static void main(String[] args) {
		Beer2 b = Beer2.KF;
		System.out.println(b); //toString() overridden to return name of the constant
	}
}