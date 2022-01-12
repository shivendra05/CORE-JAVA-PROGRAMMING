package com.practice.serializatoin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Inheritance_Serialization {
	/*1. intro
	 *2. Object Graph in Serialization
	 *3. customized Serialization
	 *4. Serialization with respect to inheritance
	 *5. Externalization
	 *6. Serialization UID
	 */

	/*Inheritance Serialization
	 * 
	 * even though parent class doenst implement we can serialize child class object if child class implements serializable
	 * interface that is to serialize child class. parent class need not be serializable.
	 */
	public static void main(String[] args) throws Exception {
		Dog_Animal dog = new Dog_Animal();
		
		FileOutputStream fos = new FileOutputStream("Inheritance_Serializattion.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(dog);
		oos.close();
		
		FileInputStream fis = new FileInputStream("Inheritance_Serializattion.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog_Animal obj = (Dog_Animal)ois.readObject();
		System.out.println(obj.i+" "+obj.j);
		ois.close();
	}
}

class Animal implements Serializable {
	int i=10;
}

class Dog_Animal extends Animal {
	int j=20;
}