package com.practice.innerclass.anonymousInner;

//outerClass
class PopCorn_Class{
	public void taste() {
		System.out.println("Salty");
	}
}

public class Anonymous_Outer2 {
	/*
	 * 3. Anonymous Inner Class
	 * 
	 * main purpose of it is just for instance uses(one time uses)
	 * 
	 * 3.1 Anonymous Inner class that extends a class
	 * 3.2 Anonymous Inner class that implements an interface
	 * 3.3 Anonymous Inner class that defined inside arguments
	 */
	public static void main(String[] args) {
		
		PopCorn_Class pop1 = new PopCorn_Class() {
			public void taste() {
				System.out.println("Sweet");
			}
		};
		pop1.taste();
		
		PopCorn_Class pop2 = new PopCorn_Class() {
			public void taste() {
				System.out.println("Spicy");
			}
		};
		pop2.taste();
		
		PopCorn_Class pop3= new PopCorn_Class();
		pop3.taste();
	}
}