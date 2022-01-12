package com.practice.Enum;

public class Enumeration2 {
	/* every enum constant is public static final, hence we can access enum constant using enum Name.
	 */
	public static void main(String[] args) {
		Beer1 b = Beer1.FO;
		System.out.println(b); //toString() overridden to return name of the constant
	}
}
enum Beer1{
	KF,RC,FO;
}