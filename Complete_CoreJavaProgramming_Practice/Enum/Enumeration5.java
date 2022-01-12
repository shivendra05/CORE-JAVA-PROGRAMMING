package com.practice.Enum;

import java.util.Iterator;

public class Enumeration5 {
	/* every enum constant is public static final, hence we can access enum constant using enum Name.
	 * 
	 *  enum vs inheritance
	 *  
	 *  every enum is a direct child of java.lang.Enum class
	 *  
	 *  our enum cant extend any other enum(because java wont provide support for multiple inheritance)
	 *  every enum is always final implicitly and hence for our enum we cant create child enum.
	 *  
	 *  because of above we can conclude, inheritance feature isnt applicable for enum explicitly and we cant use extends
	 *  keyword for enum.
	 */
	enum Beer4{
		KF,RC,FO; //semicolon is optional
	}
	/* inside enum order of constant is important and we can represent this order using ordinal value,
	 * we can find ordinal value of enum constant using ordinal().
	 * 
	 * public final int ordinal(). //ordinal value of 0 base.
	 */
	public static void main(String[] args) {
		Beer4 b = Beer4.KF;
		System.out.println(b); //toString() overriden to return name of the constant

		Beer4 [] bears = Beer4.values();
		for (Beer4 bear:bears) {

			System.out.println(bear+" "+bear.ordinal());
		}
	}
}

