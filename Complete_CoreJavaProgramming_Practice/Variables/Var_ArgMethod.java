package com.practice.Variables;

public class Var_ArgMethod {
	static int sum;
	public static void main(String[] args) {
		main(new int[] {});
		//above .. ,main(String[] args) == main(String... args)
		//sum(int... a) == sum(int[] a) == sum(new int[]{})
		//valid .. sum(int[]... a), sum(int[][]... a)
		System.out.println(sum());;;
		System.out.println(sum(1,2));;;
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4));
		System.out.println(sum(new int[]{1,2,3,4,5}));
		
		System.out.println(sum(12.0f,1,2,3,4,5));
		
		System.out.println(sum("Find Sum:: ",1,2,3,4,5));
	}	
	
	//public static int sum(int ...a) {
	//public static int sum(int ... a) {
	public static int sum(int... a) {
		System.out.println("length of input params are:: "+a.length);
		for(int val:a) {
		}
		return sum;
	}
	
	public static int sum(float f,int... a) {
		System.out.println("length of input params are:: "+a.length);
		for(int val:a) {
			sum+=val;
		}
		return sum;
	}
	
	public static int sum(String str,int... a) {
		System.out.println("length of input params are:: "+a.length);
		for(int val:a) {
			sum+=val;
		}
		return sum;
	}
	
	public static void main(int[] args) {
		System.out.println("Main over loaded method:: but willl have to call explicitly");
	}
	
}