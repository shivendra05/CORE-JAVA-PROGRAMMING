package com.practice.oops;

public abstract class DataHiding {
	//our internal data should not go out directly, is called Data Hiding.
	//after validation/authentication when user is able to access our data is call data data Hiding.
	
	//by declaring data member as private we can hide data and achieve data Hiding
	private double balance=100;
	
	public double getBal() {
		return balance;
	}
}