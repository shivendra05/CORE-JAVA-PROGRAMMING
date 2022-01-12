package com.practice.Enum;

public class Enumeration {
	/* if want to represent group of Named constant, then we should go for Enum.
	 * the main objective of Enum is to define our own data type.
	 * 1. every enum is internally implemented by using class concept.
	 * 2. every enum constant is always public static final
	 * 3. every enum constant represents an object of the type enum. 
	 */
}

enum Month{
	JAN, FEB,MAR;
}

/*  Above enum internally converts into class Month
 * class Month{
	JAN, FEB,MAR;
	}
 */

enum Beer{
	JAN, FEB,MAR;
}

/*  Above enum internally converts into class Beer
 * class Beer{
	JAN, FEB,MAR;
	}
 */