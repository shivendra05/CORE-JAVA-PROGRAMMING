package com.practice.serializatoin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
	/*1. intro
	 *2. Object Graph in Serialization
	 *3. customized Serialization
	 *4. Serialization with respect to inheritance
	 *5. Externalization
	 *6. Serialization UID
	 */

	/*Serialization
	 * process of writing state of an object to a file is called serialization but strictly speaking it is a process of 
	 * converting an Object from Java support into Either file supported form or network support form.  
	 *
	 * By Using FileOutputStream and ObjectOutputStream classes we can implement serialization
	 * 
	 * De-serialization
	 * the process of reading state of an object from a file is call de-serialization, but strictly speaking it is a process of
	 * converting an object from File Supported or network supported from to Java Supported.
	 * 
	 * By using FileInputStream or ObjectInputStream class we can implement De-serialization
	 * 
	 * transient-- the time of initialization if we dont want to save value of a particular variable to meet security constraint
	 * then we should declare variables are transient.
	 * JVM ignores original of variable and saves default value to the file. 
	 *
	 *static variable isnt part of object state hence it wont participate in serialization, so there is no use of 
	 *declaring transient as static.
	 */
	public static void main(String[] args) throws Exception {
		Dog dog = new Dog("Germen Sheferd",2,4);
		Dog dog1 = new Dog("VodaPhone Dog",4,1);

		FileOutputStream fos= new FileOutputStream("SteamFile.sel");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(dog);
		oos.writeObject(dog1);
		oos.close();

		FileInputStream fis= new FileInputStream("SteamFile.sel");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog dogRead = (Dog)ois.readObject();	
		dogRead= (Dog)ois.readObject();	
		
		System.out.println(dogRead.name + " - " +dogRead.count+ " - " +dogRead.year);
		ois.close();
	}
}
class Dog implements Serializable {
	String name;
	int count;
	transient int year;
	Dog(String name,int count, int year){
		this.name=name;
		this.count=count;
		this.year=year;
	}
}