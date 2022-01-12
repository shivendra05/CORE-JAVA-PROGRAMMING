package com.practice.DataTypes;

public class Literals {

	public static void main(String[] args) {
		//int octal and hexa
		int ten =10;
		int octal =010;
		int hexa =0x10;
		System.out.println(ten+" "+octal+" "+hexa);

		//Float and Double

		//float f=123.324;
		float f1=123.435f;
		double d =21324.324;
		System.out.println(f1+" "+d);
		System.out.println("-----------");
		double d1 =2_13_24.324;
		System.out.println(d1);

		double d2 =2___13__24.3_____24;
		System.out.println(d2);
		
		int d3 =2___13__243_____24;
		System.out.println(d3);

		/*double d3 =2___13__24_.3_____24;
		System.out.println(d3);
		 */
		//char
		char ch='a';
		/*char ch1 = nm;
		char ch2= "c";
		char ch3 = 'ab';*/

		System.out.println(ch);
		//System.out.println(ch1+" "+ch2+" "ch3);

		char in = 98;
		System.out.println(in);

		//scape chars
		String str="Shivendra";
		System.out.println(str+" "+'\t'+" "+str+'\b');

		new Literals().charToIntegeral();
	}
	public void charToIntegeral() {	
		int a='a';
		System.out.println(a);

		byte b='a';
		System.out.println(b);

		short c='a';
		System.out.println(c);

		int String=20;
		System.out.println(String);
	}
}