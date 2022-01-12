package com.practice.declarationAccessModifier;

public interface InterfaceNamingConflics{
	int a=10;
	void m1();
}
interface InterfaceNamingConflics1{
	int a=10;
	void m1();
}
//if both interfaces have same implementation and return type.

class imple12 implements InterfaceNamingConflics,InterfaceNamingConflics1{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
	}
}