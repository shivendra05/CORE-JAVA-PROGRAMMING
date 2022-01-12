package com.practice.langPackage.string;

public class StringBufilder_class {

	/*
	 * every method present in StringBuffer is synchronized, and hence only one thread is allowed to operate
	 * on StringBuffer object at a time. which may created performance problem.
	 * 
	 * to handle this problem, Sun introdunced StringBuilder concept in JDK 1.5v. 
	 * 
	 * 
	 * StringBuilder is exactly same as StringBuffer except the following ...
	 * 
	 * StringBuffer 					StringBuilder
	 * 
	 * Synchronized						Non-Synchronized
	 * Thread -Safe						Not Thread-Safe
	 * Slow								Fast
	 * JDK 1.0v							JDK 1.5v
	 * 
	 */

	/*
	 * in String class .equals() is overriden for content comparison, hence eventhough object is different, if context is same it returns true
	 * 
	 * in StringBuffer class .equals() isnt overriden, hence object class .equals() executed, which is meant for address/reference comparison, due to this
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
		/*
		 * most of the method have return type same for String/StringBuilder/StringBuffer
		 * Hence applying methods in result we can call anotehr method, which form method chaining.
		 * 
		 * */
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
		
		strbuf.append(true).append("Hello").insert(2, "DON").reverse();
		System.out.println(strbuf);
	}



}
