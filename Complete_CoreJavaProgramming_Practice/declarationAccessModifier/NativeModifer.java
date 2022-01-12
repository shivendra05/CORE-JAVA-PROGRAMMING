package com.practice.declarationAccessModifier;

public class NativeModifer {
//step1:: load Native library, since implementation is already available.
	static {
		System.loadLibrary("Native library");
	}
//step2:: declare Native method..always should ends with  sami-colon ;
	public native void m1();
	//public native void m2() {}//incorrect.. always should ends with  sami-colon ;
	public static void main(String[] args) {
		//step1:: Invoke Native Methods
		NativeModifer nm= new NativeModifer();
		nm.m1();
	}
	//native with strictfp/abstract
}