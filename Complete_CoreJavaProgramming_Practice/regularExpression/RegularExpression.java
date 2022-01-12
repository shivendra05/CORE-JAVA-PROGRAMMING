package com.practice.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	/*
	 * if we want to represent a group of string, according to a pattern then we should go for regular expression.
	 * 
	 * we can write regular expression for EmailID/MobileNo.
	 * 
	 */
	
	public static void main(String[] args) {
		Pattern pattern =Pattern.compile("bb");
		Matcher matc = pattern.matcher("abbbabbbcb");
		int count=0;
		while(matc.find()) {
			count++;
			System.out.println(matc.start()+" ... "+matc.end()+" ... "+matc.group());;
		}
		System.out.println("No.of Matched pattern "+count);
	}
}