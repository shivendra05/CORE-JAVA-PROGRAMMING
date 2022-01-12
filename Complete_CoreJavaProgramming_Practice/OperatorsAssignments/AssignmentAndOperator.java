package com.practice.OperatorsAssignments;

public class AssignmentAndOperator {
	public static void main(String[] args) {
		int x=10;
		int y=++x;
		System.out.println(x+" <-> "+y);

		int a=10;
		//int b=++10; constant cant be used for increment or decrement

		int m=10;
		//int n=++(++x); constant cant be used for increment or decrement

		final int o=10;
		//o=11; //final varibale cant be reassigned with values
		//o++; //increment or decrement cant be applied for final variable cant 

		//increment or decrement cant be applied only for booleans

		char c=10;
		c++;
		System.out.println(c);

		double d=10.4;
		d++;
		System.out.println(d);

		float f=21.32f;
		f++;
		System.out.println(f);

		byte b1=10;
		byte b2=20;
		//if we apply any arithmatic operator b/w 2 variables max(int, type of 1, type of 2)
		//for above max(int, byte,byte) --> int -->loss of precision(becasue we are assiging value to byte)

		//byte b3=b1+b2; //max(int, byte,byte)
		int b3=b1+b2;//max(int, byte,byte)
		System.out.println(b3);

		byte b5=10;
		//byte b6=b5+1;//max(int, byte,int)
		int b6=b5+1;//max(int, byte,int)
		System.out.println(b6);

		byte b7=10;
		b7++; //internal type casting b7=(type of b7)(b7+1);
		System.out.println(b7);

		System.out.println("char to char addition::"+('a'+'b'));
		System.out.println("char to char addition::"+'a'+'b');
		System.out.println("char to double addition::"+('a'+.98));
		
		//System.out.println(10/0); // (int/int) --> int --> Since there is no way to represent infinity in integer JVM gives ArthmaticException
		//System.out.println(0/0); // (int/int) --> int --> Since there is no way to represent infinity in integer JVM gives ArthmaticException
		
		System.out.println(10/0.0); // (int/double) -->double --> there is way to represent infinity in double JVM gives infinity
		System.out.println(10.0/0);
		
		System.out.println(0/0.0); // (int/double) -->double --> there is way to represent infinity in double JVM gives NAN
		System.out.println(0.0/0);
	}
}