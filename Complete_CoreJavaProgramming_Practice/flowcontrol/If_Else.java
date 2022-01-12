package com.practice.flowcontrol;

public class If_Else {
	public static void main(String[] args) {
		
		boolean b=true;
		if(b=false) {
			System.out.println("Hello, How are you!!!");
		}else {
			System.out.println("Hey!! Bye");
		}
		
		
		if(b==false) {
			System.out.println("Hello, How are you!!!");
		}else {
			System.out.println("Hey!! Bye");
		}
		
		
		if(true) {
			int a=10;
		}
		
		if(true);
		
		/*
		 without curly brackets we can write only one statment but it should not be
		 a declarative.
		 
		if(true)
			int x1=20;
		
		*/
		
		//else always belongs to nearest if..below else fellows to inner if
		if(true)
			//if(false)
			if(true)
			System.out.println("Hii");
		else
			System.out.println("Bye");
	}	
}