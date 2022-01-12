package com.practice.flowcontrol;

public class SwitchCases {
	public static void main(String[] args) {
		//switch case allows only byte short int and char
		//float and double are not allowed because of floating values.
		//from 1.5 wrapper classes are allowed Byte Short Integer and enum
		//from 1.7 String is allowed as well

		short s=10;	
//empty switch is valid
		switch(s) {

		}

		//switch without cases arent allowed
/*		switch(s) {
		System.out.println("Hi");
		}
 */
		int i,j,l;
		i=20;
		j=10;
		l=40;
		final int k=30;
		switch(s) {
		case 10:
			System.out.println("Hi");
		case 20:
			System.out.println("Hi");
			//case allows only constant values, even final constant values are allowed
			/*case l:
				System.out.println("Hi");
			 */case k:
				 System.out.println("Hi");
		}

		int bool= 21;
		//expression is allowed but it should a constant
		switch(bool+2) {
		case 10:
			System.out.println("Hi");
		case 20:
			System.out.println("Hi");

		}

		int boolq= 21;
		//expression is allowed but it should a constant
		switch(boolq+2) {
		case 10:
			System.out.println("Hi");
		case 20:
			System.out.println("Hi");
		case 'a':
			System.out.println("Hi");
		//one switch case cant allow multiple type in cases(int char String ..only same type cases are allowed) 
			
			/*case "hello":
				System.out.println("Hi");
			*/
		}

		
		int boolq1= 1;
		//expression is allowed but it should a constant
		switch(boolq1+2) {
		//default could be placed at any place but will be evaluated only once here its at the start so next time wont get chance
		default:
			System.out.println("I am default");
		case 1:
			System.out.println("Hi");
			break;
		case 2:
			System.out.println("Hi*****");
		case 3:
			System.out.println("Hi#######");
		}

		
		
		
	}	
}