package com.practice.flowcontrol;

public class ForEachLoop {
	public static void main(String[] args) {

		//specially designed for arrays and collections from jdk1.5
		//limitation, we cant print values in reverse direction
		
		
		System.out.println("for wiht 1-D array");
		int []a= {10,20,30,40,50};
		for(int x:a) {
			System.out.println(x);;
		}

		System.out.println("for wiht 2-D array");
		int [][]x= {{10,20,30,},{40,50}};
		for(int []x1:x) {
			for(int x2:x1) {
				System.out.println(x2);;
			}
		}

		System.out.println("for wiht 3-D array");
		int [][][]x3= {{{10,20,30,},{40,50},{60,70,80},{90,100}}};
		for(int [][]x2:x3) {
			for(int []x1:x2) {
				for(int m:x1) {
					System.out.println(m);;
				}
			}
		}
	}	
}