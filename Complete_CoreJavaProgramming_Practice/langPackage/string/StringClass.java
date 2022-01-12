package com.practice.langPackage.string;

public class StringClass {

	/*
	 * once we create a String object we cant perform any changes in it, if we trying to perform any changes, with those changes
	 * new object will be created, this non-changeable behavior is called as immutability of String.
	 * 
	 * once we create StringBuffer Object we can perform any changes in the existing object, this changeable behavior is nothing but
	 * mutability, of StringBuffer.
	 */
	
	/*
	 * final vs immutable
	 * 
	 * final is applicable for variables
	 * immutable is applicable for object
	 * 
	 * final StringBuffer sb= new StringBuffer("Durga");
	 * sb.append("Software"); //valid
	 * 
	 * sb = new StringBuffer("Software"); //In-valid - re-assignment on final variable not allowed.
	 * 
	 * */
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("*******String********");
		String str= new String("Java");
		String str1= new String("Java");
		str.concat("Software");//immutability(Every time new object will be created if we make any changes)
		System.out.println(str);
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
		
		System.out.println("*******StringBuffer********");
		StringBuffer strbuf= new StringBuffer("Java");
		StringBuffer strbuf1= new StringBuffer("Java");
		strbuf.append("Software"); //mutability(No new object will be created if we make any changes)
		System.out.println(strbuf);
		System.out.println(strbuf.equals(strbuf1));
		System.out.println(strbuf==strbuf1);
	}

	/*
	 * in String class .equals() is overridden for content comparison, hence eventhough object is different, if context is same it returns true
	 * 
	 * in StringBuffer class .equals() isnt overridden, hence object class .equals() executed, which is meant for address/reference comparison, due to this
	 * if object is different .equals() returns false. even though content is same.
	 * 
	 */
}
