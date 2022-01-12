package com.practice.oops.inheritance.hasA;

//early binding/compile time polymorphism/static polymorphism
public class Overloading_Case5_Animal{
	//methods are said to be overloaded if all methods have same name and argument type.

	public void eat() {
		System.out.println("Animal are not vegans::");
	}
	public void drink() {
		System.out.println("Animal are not vegans::");
	}
}
class Monkey extends Overloading_Case5_Animal{
	//methods are said to be overloaded if all methods have same name and argument type.

	public void eat() {
		System.out.println("Monkeys are vegans::");
	}
	public void run() {
		System.out.println("Animal are not vegans::");
	}
}

class Overloading_Case5Main{
	public static void main(String[] args) {
		Overloading_Case5_Animal animal= new Overloading_Case5_Animal();
		animal.eat();
		
		Monkey monkey= new Monkey();
		monkey.eat();
		
		Overloading_Case5_Animal animalMonkey= new Monkey();
		
		animalMonkey.eat(); // always method will be checked at referenced class, but executed child class method.  
												
		animalMonkey.drink(); // always method will be checked at referenced class, but executed child class method. 
													//if not available in child, else executed from parent class.
		
		//animalMonkey.run();// always method will be checked at referenced class, if no reference it will give error.
	}
}