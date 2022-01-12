package com.practice.typeCastring;

public class ObjectTypeCastring {
	
	//We can use parent reference to hold child Object.

	//Object type Casting
	Object obj = new String("Shiv");

	//Object type Casting
	Runnable thread = new Thread();


	/*
	 * A b=(C)d;
	 * 
	 * A 				b			=					(C)							 d;
	 * 
	 * (Class or interface Name) reference variable Name = (Class or interface Name) reference variable Name
	 * 
	 * 
	 * Rule1:: the type of "d" and "C" must have some relation either child or parent or vica versa. 
	 * else we will get compile time error.
	 * 
	 * Object o= New String("Shivendra");
	 * StringBuffer str= (StringBuffer)o;
	 * 
	 * 
	 * String o= new String("Shivendra");
	 * StringBuffer str= (StringBuffer)o; // error because there is not relation between string and StringBuffer
	 * 
	 */
	public static void main(String[] args) {

		Object obj = new String("Shiv");
		Runnable thread = new Thread();
		
		
		//Issues
		/*String o= new String("Sivendra");
		StringBuffer str= (StringBuffer)o;*/

	}

	/*
	 * A b=(C)d;
	 * 
	 * A 				b			=					(C)							 d;
	 * 
	 * (Class or interface Name) reference variable Name = (Class or interface Name) reference variable Name
	 * 
	 * 
	 * Rule2:: "C" must be either must be same or derived type of "A" 
	 * else we will get compile time error saying incampatible type.
	 * 
	 * Object o= New String("Sivendra");
	 * StringBuffer str= (StringBuffer)o;
	 * 
	 * 
	 * Object o= New String("Sivendra");
	 * StringBuffer str= (String)o; // error becasue there is not rlation between stirng and StringBuffer
	 * 
	 */
	
	
	/*
	 * A b=(C)d;
	 * 
	 * A 				b			=					(C)							 d;
	 * 
	 * (Class or interface Name) reference variable Name = (Class or interface Name) reference variable Name
	 * 
	 * 
	 * Rule3::Run time Object type of "d" must be either same or derived type of "C" 
	 * else we will get compile time error saying incompatible type.
	 * 
	 * Object o= New String("Sivendra");
	 * StringBuffer str= (StringBuffer)o;//Error.
	 * 
	 */
	
}