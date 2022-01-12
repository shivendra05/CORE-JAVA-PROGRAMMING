package com.practice.declarationAccessModifier;

public interface InterfaceVariableNamingConflics{
	int a=20;
}
interface InterfaceVariableNamingConflics1{
	int a=200;
}
//if both interfaces have same variable Name, then there could be a naming conflict.
//we can solve it by interface Name

class imple15 implements InterfaceVariableNamingConflics,InterfaceVariableNamingConflics1{
	public static void main(String[] args) {
		//System.out.println(a); issue because of interface variable naming conflict.
		//use interface name to access the interface variables
		
		System.out.println(InterfaceVariableNamingConflics.a);
		System.out.println(InterfaceVariableNamingConflics1.a);
	}
}