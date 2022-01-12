package com.practice.OperatorsAssignments;

public class BitWiseOperator {
	public static void main(String[] args) {
//we can apply &,| and6(and/or/x-or/~ operators for integerals and boolean(~ not for boolean))
		System.out.println(3&4); //its a bitwise so convert it into binary and then perform and
		System.out.println(3|4); //its a bitwise so convert it into binary and then perform or
		System.out.println(3^4); //its a bitwise so convert it into binary and then perform x-or
		System.out.println(~4); //its a bitwise so convert it into binary and then perform negation
	}
}