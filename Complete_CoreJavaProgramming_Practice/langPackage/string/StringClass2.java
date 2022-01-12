package com.practice.langPackage.string;

public class StringClass2 {

	/*
	 * once we create a String object we cant perform any changes in it, if we trying to perform any changes, with those changes
	 * new object will be created, this non-changeable behaviour is called as immutability of String.
	 * 
	 * once we create StringBuffer Object we can perform any changes in the existing object, this changeable behaviour is nothing but
	 * mutability, of StringBuffer.
	 * 
	 * creating objects in SCP is optional, but always one copy will be available on SCP for future reference purpose
	 */
	
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("*******String********");
		String str1= new String("Java"); //2 objects will be created (1-1 at each heap/SCP)
		String str2= new String("Java"); //1 object will be created at (1 heap)
		String str3= "Java"; //no object will be created (1 reference to SCP)
		String str4= "Java"; //no object will be created (1 reference to SCP)
	}

	/*
	 * in String class .equals() is overriden for content comparison, hence eventhough object is different, if context is same it returns true
	 * 
	 * in StringBuffer class .equals() isnt overriden, hence object class .equals() executed, which is meant for address/reference comparison, due to this
	 * if object is different .equals() returns false. even though content is same.
	 * 
	 */
}
