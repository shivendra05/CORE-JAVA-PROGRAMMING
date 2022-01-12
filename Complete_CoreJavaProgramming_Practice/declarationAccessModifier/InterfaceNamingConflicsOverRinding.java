package com.practice.declarationAccessModifier;

public interface InterfaceNamingConflicsOverRinding{
	void m1();
}
interface InterfaceNamingConflicsOverRinding1{
	int m1();
}
//if both interfaces have same methods with different params, then we will have to implement both
//considered as a over loaded methods.

class imple14 implements InterfaceNamingConflicsOverRinding,InterfaceNamingConflicsOverRinding1{
	//overloaded methods with different return type. 
	// in this case its not possible to implement.
	// it because of same signature but different return type
	@Override
	public int m1() {
		return 0;
	}
	@Override
	public void m1() {
	
	}
}