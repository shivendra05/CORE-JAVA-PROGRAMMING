package com.practice.declarationAccessModifier;

public abstract class AbstractModifer {
	//abstract is applicable for class methods but not for variables
	abstract public int noOfWheels();	
}

class Car extends AbstractModifer{
	@Override
	public int noOfWheels() {
		return 4;
	}
}

class Auto extends AbstractModifer{
	@Override
	public int noOfWheels() {
		return 3;
	}
}