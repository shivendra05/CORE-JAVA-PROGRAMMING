package com.practice.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression2 {

	/*
	 * if we want to represent a group of string, according to a pattern then we should go for regular expression.
	 * 
	 * we can write regular expression for EmailID/MobileNo.
	 * 
	 * [abc] --> either a or b or c(only one letter Match)
	 * [^abc] --> except a or b or c(only one letter Match)
	 * [a-z] --> Any lower case letter between a-z(only one letter Match)
	 * [A-Z] --> Any Upper case letter between A-Z(only one letter Match)
	 * [a-zA-Z] --> Any Upper/lower case letter between A-Z(only one letter Match)
	 * [0-9] --> any Number between 0-9(only one letter Match)
	 * [0-9a-zA-Z] --> Any Alphanumeric String(only one letter Match)
	 * [^0-9a-zA-Z] --> except Any Alphanumeric String(only one letter Match)
	 * 
	 * predefined character class
	 * 
	 * \s -> space character
	 * \S -> except space character
	 * \d -> Digit character
	 * \D -> except digit character
	 * \w -> word character
	 * \W -> except word character
	 * . -> any character
	 * 
	 * Quantifier
	 * 
	 * a ->exactly one times
	 * a+ -> 1 or more than 1 times
	 * a* -> 0 or more than 1 times
	 * a? -? 0 or 1 times
	 * 
	 */

	public static void main(String[] args) {
		//String str = "[abc]";
		//String str = "[^abc]";
		//String str = "[a-z]";
		//String str = "[a-zA-Z]";
		//String str = "[^0-9a-zA-Z]";
		
		//predefined character class
		
		//String str="\\s";
		//String str="\\S";
		//String str="\\d";
		//String str="\\D";
		//String str="\\w";
		//String str="\\W";
		//String str=".";
		
		//Quantifiers
		
		//String str= "a";
		//String str= "a+";
		//String str= "a*";
		String str= "a?";
		Pattern pattern =Pattern.compile(str);
		Matcher match = pattern.matcher("a36#aaaaak@9 8AabcZaa");
		int count=0;
		while(match.find()) {
			count++;
			System.out.println(match.start()+" ... "+match.end()+" ... "+match.group());;
		}
		System.out.println("No.of Matched pattern "+count);
		
		
		Pattern patternSplit =Pattern.compile("\\s");
		String []strSplt = patternSplit.split("a36#aaaaak@9 8AabcZaa");
		for(String strNew: strSplt) {
			System.out.println(strNew);
		}
		
		for (String string : strSplt) {
			System.out.println(string);
		}
		
	}
}