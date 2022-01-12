package com.practice.ObjectCreation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;

public class ObjectCreation {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException, CloneNotSupportedException {
		//1. Using new Operator

		ObjectCreation obj1 =  new ObjectCreation();

		//2. Using newInstance()

		ObjectCreation obj2 = (ObjectCreation) Class.forName("ObjectCreation").newInstance();

		//3. Using clone()
		ObjectCreation obj3 =  new ObjectCreation();
		ObjectCreation obj4 = (ObjectCreation) obj3.clone();

		//4. Using factory methods
		Runtime r = Runtime.getRuntime();
		DateFormat df = DateFormat.getInstance();

		//5. Using deserialization
		FileInputStream fis = new FileInputStream("");
		ObjectInputStream ois= new ObjectInputStream(fis);
		ObjectCreation obj5=	(ObjectCreation) ois.readObject();
	}
}