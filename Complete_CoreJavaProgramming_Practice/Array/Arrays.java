package com.practice.Array;

public class Arrays {
	public static void main(String[] args) {
		int b[]= new int[20];
		int []b1= new int[20];
		int[] b2= new int[20];
		int  [] b3= new int[20];
		b[0]=10;
		
//by default all int array values are initilized with 0 
		System.out.println(b[0]+" "+b1[0]+" "+b2[0]+" "+b3[0]);

		int []arr;
		arr = new int[20];

		int [] [] arr1=new int [1] [2];
		int [] arr2[] =new int[1] [2];

		//2-d array declaration
		int []arry = new int[3],arry1=new int[3];
		int[] []ar1,ar2;
		int[] []ar3,ar4[];
		//int[]ar3,[]ar4,[]ar5;
		// [I , arr1-> [[I@7d4793a8,  arr1[0]-> [I@449b2d27,  arr1[0][0]-> 0
		System.out.println(arry.getClass().getName()+" arr1-> "+arr1 +" arr1[0]-> "+arr1[0]+" arr1[0][0]-> "+arr1[0][0]);


		//3-d array declaration
		int [][][]ar_3 =new int[1][2][3];
		int[] [][]ar_31;
		int[][] []ar_32;
		int[]  ar_33[][];
		int[] []ar_34[],ar_36[][],ar37[];
		System.out.println(ar_3.getClass().getName());


		//3-d array declaration
		char [][][]arch_3 =new char[1][2][3];
		System.out.println(arch_3); 

		/*
		// java.lang.NegativeArraySizeException
		char []nag =new char[-5];
		System.out.println(nag.getClass().getName()); 
		 */

		char []nag =new char['a'];
		System.out.println(nag.getClass().getName()+" -> "+nag.length+" -> "+nag[0]+" -> "+nag[1]+" -> "+nag[2]); 

		String []str21= {"A","AA","AAA"};
		System.out.println(str21.length);
		//System.out.println(str21.length());
		//System.out.println(str21[1].length);
		System.out.println(str21[1].length());
		
		String [][]str22= new String[3][4];
		System.out.println(str22.length);
		System.out.println(str22[0].length);
		System.out.println(str22[1].length);
		
		
		int []intarr1= {1,2,3,4,5};
		int []intarr2= {10,11};
		int []intarr3;
		System.out.println(intarr1+" "+intarr2);
		intarr3=intarr1;
		
		intarr1=intarr2;
		intarr2=intarr3;
		System.out.println(intarr1+" "+intarr2);
		
	}	
}