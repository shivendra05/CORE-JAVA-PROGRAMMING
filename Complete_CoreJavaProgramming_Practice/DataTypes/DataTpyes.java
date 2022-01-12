package com.practice.DataTypes;

public class DataTpyes {

	public static void main(String[] args) {

		byte b[]= {1,2,3,4,5,127};

		for(byte num:b) {
			System.out.println(num);
		}

		/*if(1) {
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}

		while(1) {
			System.out.println("HI");
		}*/


		Integer a=10;
		int a1=10;
		System.out.println(a+a1);


		int Integer=20;
		System.out.println(Integer);

		int Int=20;
		System.out.println(Int);

		int Runnable=20;
		System.out.println(Runnable);

		int aa=20;
		String bb="ram";
		int c=20;
		System.out.println(aa+c);
		System.out.println("OP"+aa+c);
		System.out.println(aa+bb);
	}
}