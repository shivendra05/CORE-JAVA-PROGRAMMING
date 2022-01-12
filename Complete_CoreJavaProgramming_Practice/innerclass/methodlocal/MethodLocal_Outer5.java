package com.practice.innerclass.methodlocal;

//outerClass
public class MethodLocal_Outer5 {
	int a=10;
	public void m1() {
		int b=20;
		int a=100;
		final int c=30;
		class MethodLocal_Innter{
			int d=40;
			int a=1000;
			/*
			 * inside inner class we cant declare static variables
			 * */
			public void sum() {
				int a=10000;
				System.out.println("Method sum() variable:: "+a);
				System.out.println("MethodLocal innerClass variable::"+this.a);
				System.out.println("MethodLocal OuterClass variable::"+MethodLocal_Outer5.this.a);
				
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
		}
		new MethodLocal_Innter().sum();
	}

	public static void main(String[] args) {
		MethodLocal_Outer5 outer = new MethodLocal_Outer5();
		outer.m1();
	}
}