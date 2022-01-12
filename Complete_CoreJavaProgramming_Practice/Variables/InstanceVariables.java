package com.practice.Variables;

public class InstanceVariables {
	//instance variable, stored in a Heap Area.
	int x=10;
	char c;
	byte b;
	short s;
	int y;
	float f;
	String str;
	long l;
	
	public static void main(String[] args) {
		
		//System.out.println(x);//instance variable cant be accessed from static block
		System.out.println(new InstanceVariables().x);
		new InstanceVariables().m1();
	}	
	
	public void m1() {
		System.out.println(x);//instance variable cant be accessed from static block
		System.out.println(c);//instance variable will be inilised by jvm if we dont
		System.out.println(b);//instance variable will be inilised by jvm if we dont
		System.out.println(s);//instance variable will be initialized by jvm if we dont
		System.out.println(l);//instance variable will be inilised by jvm if we dont
		System.out.println(f);//instance variable will be inilised by jvm if we dont
		System.out.println(str);//instance variable will be inilised by jvm if we dont
		System.out.println(new InstanceVariables().x);
	}
}