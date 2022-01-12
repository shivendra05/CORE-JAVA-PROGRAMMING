package com.practice.langPackage.string;

public class StringBuffer_class {

	/*
	 * if the content is fixed and wont change frequently then it recommended to for String.
	 * 
	 * if the content isnt fixed and keep on changing then its not recommended to go for String because for every change 
	 * a new object will be created which effects performance of the system.
	 * 
	 * to handle this request we should go for StringBuufer, the main advantage of StringBuffer over String is, all required changes will be performed o
	 * in the existing object only.
	 *  
	 */
	
	/*
	 * in String class .equals() is overridden for content comparison, hence eventhough object is different, if context is same it returns true
	 * 
	 * in StringBuffer class .equals() isnt overridden, hence object class .equals() executed, which is meant for address/reference comparison, due to this
	 * if object is different .equals() returns false. even though content is same.
	 * 
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
		System.out.println("*******StringBuffer********");
		StringBuffer strbuf= new StringBuffer("Java");
		System.out.println(strbuf.capacity());
		strbuf.append("Software"); //mutability(No new object will be created if we make any changes)
		System.out.println(strbuf);
		System.out.println(strbuf.capacity());
		
		strbuf.append("SoluationsOfAllProblems"); //mutability(No new object will be created if we make any changes)
		System.out.println(strbuf);
		System.out.println(strbuf.capacity());
		
		strbuf.append(false);
		strbuf.append('1');
		strbuf.append(21343);
		
		System.out.println(strbuf);
		System.out.println(strbuf.capacity());
	}
}
