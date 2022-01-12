package com.practice.Variables;

public class StaticVariables {
	static int i=10;
	static String str="shivendra";
	static int j;
	static char c;
	static byte b;
	static short s;
	
	public static void main(String[] args) {
		/*
		Static varibales -->(only one copy and shared with all objects of a class) 
					if value of a variable does not changes for objects like courseName/branchName/CompnayName.
					stored in method area.
		local varibale -->
		*/
		System.out.println("static Area-----");
		System.out.println(i);
		System.out.println(str);
		System.out.println(j);
		System.out.println(c);
		System.out.println(b);
		System.out.println(s);
		
		new StaticVariables().m1();
	}	
	
	public void m1() {
		System.out.println("Instance Area-----");
		System.out.println(i);
		System.out.println(str);
		System.out.println(j);
		System.out.println(c);
		System.out.println(b);
		System.out.println(s);
	}
}