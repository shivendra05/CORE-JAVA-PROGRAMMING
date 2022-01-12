package com.practice.exceptionHandling;

import java.util.Scanner;

//user defined exception must extends throwable or its child class of throwable class
public class ThrowTooYoungException extends RuntimeException{
	ThrowTooYoungException(String msg){
		super(msg);
	}
}

class ThrowTooOldException extends RuntimeException{
	ThrowTooOldException(String msg){
		super(msg);
	}
}

class CustomException{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter customer age::");
		int age=sn.nextInt();
		if (age<21) {
			throw new ThrowTooYoungException("You are Too Young please wait!!!!");
		}else if(age>60) {
			throw new ThrowTooOldException("You have crossed Age of Getting married");
		}else {
			System.out.println("Soon you are going to get your match");
		}
	}
}