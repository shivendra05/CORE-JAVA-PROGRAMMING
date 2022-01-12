package com.practice.instanceControlFlow;
/*static block identification and child class main Class execution..
 * 
 * 1. identification of instance members from top to bottom(parent to child).
 * 2. Execution of instance variable, assignment and instance block only in parent class
 * 3. Execution of parent class constructor
 * 4. Execution of instance variable assignment and instance block only in child class
 * 5. Execution of Child class constructor
 */
public class InstanceParent {
	int i=20;
	{
		m1();
		System.out.println("Parent.. First Instance block");
	}

	InstanceParent(){
		System.out.println("Parent .. Constructor");
	}
	public static void main(String[] args) {
		InstanceBlock2 instance = new InstanceBlock2();
		System.out.println("Parent Main");
	}
	public void m1() {
		System.out.println(j);
	}
	{
		System.out.println("Parent... Second Instance block");
	}
	int j=20;
}

class InstanceChild extends InstanceParent {
	int i=100;
	{
		m2();
		System.out.println("Child..First Instance block");
	}

	InstanceChild(){
		System.out.println("Child:: Constructor");
	}
	public static void main(String[] args) {
		InstanceChild child = new InstanceChild();
		System.out.println("Child Main");
	}
	public void m2() {
		System.out.println(y);
	}
	{
		System.out.println("Child.. Second Instance block");
	}
	int y=20;
}