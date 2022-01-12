package com.practice.declarationAccessModifier;

public interface InterfaceNamingConflicsOverloading{
	void m1();
}
interface InterfaceNamingConflicsOverloading1{
	void m1(int a);
}
//if both interfaces have same methods with different params, then we will have to implement both
//considered as a over loaded methods.

class imple13 implements InterfaceNamingConflicsOverloading,InterfaceNamingConflicsOverloading1{
	//overloaded methods
	@Override
	public void m1(int a) {
		// TODO Auto-generated method stub
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
	}
}