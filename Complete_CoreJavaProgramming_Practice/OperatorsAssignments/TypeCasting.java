package com.practice.OperatorsAssignments;

public class TypeCasting {
	public static void main(String[] args) {
		//lower to higher ..upcastring .. take automatically
		//higher to lower ..downcastring .. maually have to perform
		int i=10;
		byte b=20;
		double d=30;
		short s=120;
		
		//lmplicit .. lower to higher
		short bs=b;
		System.out.println("byte to short::"+bs);
		
		//Explicity ..higher to lower
		byte ib=(byte) i;
		System.out.println("int to byte::"+ib);
		
		double id=i;
		System.out.println("int to double::"+id);
		
		System.out.println("-----Operator and operands----");
		//precidance applied for operators not operands 
		
		int values = cal(1)+cal(2)*cal(3)/cal(4)+cal(5)*cal(6);
		System.out.println(values);
	}	
	
	public static int cal(int x) {
		System.out.println(x);
		return x;
	}
}