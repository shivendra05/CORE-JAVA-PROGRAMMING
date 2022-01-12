package com.practice.innerclass.anonymousInner;

//outerClass
class PopCorn_Class1{
	public void taste() {
		System.out.println("Salty");
	}
}

public class Anonymous_Outer3 {
	/*3. Anonymous Inner Class
	 * main purpose of it is just for instance uses(one time uses)
	 * 
	 * 3.1 Anonymous Inner class that extends a class
	 * 3.2 Anonymous Inner class that implements an interface
	 * 3.3 Anonymous Inner class that defined inside arguments
	 */
	public static void main(String[] args) {
		/*
		 *we are declaring a class that extends  PopCorn_Class with name(Anonymous inner class),
		 *for that child class we are creating an object with parent reference,
		 */
		PopCorn_Class pop1 = new PopCorn_Class() {
			
		};
		pop1.taste();
		
		/*we are declaring a class that extends PopCorn_Class with name(Anonymous inner class),
		 *In the child class we are overriding taste(), 
		 *
		 *for that child class we are creating an object with parent reference,
		 */
		PopCorn_Class pop2 = new PopCorn_Class() {
			public void taste() {
				System.out.println("Spicy");
			}
		};
		pop2.taste();
		/*
		 *We are just creating object for PopCorn_Class 
		 */
		PopCorn_Class pop3= new PopCorn_Class();
		pop3.taste();
	}
}