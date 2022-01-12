package com.practice.serializatoin;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UID_Dog implements Serializable{

	/*
	 *1. intro
	 *2. Object Graph in Serialization
	 *3. customized Serialization
	 *4. Serialization with respect to inheritance
	 *5. Externalization
	 *6. Serialization UID
	 */

	/*
	 * in serialization both sender and receiver need not be same, need not use same machine and need not be same location.
	 * person/location/machine may be different.
	 * 
	 *   at the time of serialization, every object sender side JVM will save Unique identifier. JVM is responsible to generate 
	 *   unique identifier based on .class file,
	 *   at the time of de-serialization, receiver side JVM will compare Unique identifier associated with Object with local class
	 *   unique identifier.
	 *   
	 *   if both match then only de-serialization will be performed, else we will get runtime exception saying "InvliadClassException" 
	 *   this unique identifier is nothing but serial version UID. 
	 *   
	 *   
	 *   problems with default UID
	 *   --------------------------
	 *   1. both sender and receiver should use, same JVM with respect to vender/plateform and version else receiver 
	 *   unable to de-serialize because of different version of UID.
	 *   2. both sender and receiver should use same .class version after serialization if there is any change in .class 
	 *   in receiver side then receiver will be unable to de-serialize.(change of code/property not allowed any any side)
	 */
	int i=10;
	int j=20;
	int k=30;
	int l=120;
	//public static final long serialVersionUID=11l;
	/*
	 * we can solve UIS problem by configuring our own serial version
	 * public static final long serialVersionUID=11l;
	 */
}