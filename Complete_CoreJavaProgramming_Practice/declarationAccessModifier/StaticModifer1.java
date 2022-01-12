package com.practice.declarationAccessModifier;

public class StaticModifer1 {
	//static modifier allowed only for variables and methods(Inner class also could have static modifier)
	//static modifier also knows as class level variable and always only one copy will be created

	//static variable directly can be accessed from instance/static/class block
	//instance variable directly can be accessed from instance black but not from static block/method/class

	//static method, overriding concept isnt allowed instead it allows methods over hiding 
	public static void main(String[] args) {
		System.out.println("Parent class");
	}
}
class StaticModifer2 extends StaticModifer1{
	public static void main(String[] args) {
		System.out.println("Child class");
	}
}