package com.practice.serializatoin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization2 {

	/*1. intro
	 *2. Object Graph in Serialization
	 *3. customized Serialization
	 *4. Serialization with respect to inheritance
	 *5. Externalization
	 *6. Serialization UID
	 */

	/*Serialization
	 * the process of writing state of an object to a file is called serialization but strictly speaking it is a process of 
	 * converting an Object from Java support into Either file supported form or network support form.  
	 *
	 *we can serialize any number of object to the file but in which order we serialize the same we should use to de-serialize.
	 *order of object is important in serialization.
	 */
	public static void main(String[] args) throws Exception {
		Dog1 dog = new Dog1("Germen Sheferd",2,4);
		Cat cat = new Cat("Germen Cat",4);
		Rat rat = new Rat("Germen Rat",2);

		FileOutputStream fos= new FileOutputStream("AnimalSteamFile.sel");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(dog);
		oos.writeObject(cat);
		oos.writeObject(rat);
		oos.close();

		FileInputStream fis= new FileInputStream("AnimalSteamFile.sel");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		/*
		Dog1 dogRead = (Dog1)ois.readObject();	
		System.out.println(dogRead.name + " - " +dogRead.count+ " - " +dogRead.year);
		Cat catRead = (Cat)ois.readObject();	
		System.out.println(catRead.name + " - " +catRead.year);
		Rat ratRead = (Rat)ois.readObject();	
		System.out.println(ratRead.name + " - " +ratRead.count);
		*/
		if(object instanceof Dog1) {
			Dog1 dogRead = (Dog1)object;	
			System.out.println(dogRead.name + " - " +dogRead.count+ " - " +dogRead.year);
		}else if(object instanceof Cat) {
			Cat dogRead = (Cat)object;	
			System.out.println(dogRead.name+ " - " +dogRead.year);
		}else if(object instanceof Rat) {
			Rat dogRead = (Rat)object;	
			System.out.println(dogRead.name + " - " +dogRead.count);
		}
		ois.close();
	}
}
class Dog1 implements Serializable {
	String name;
	int count;
	transient int year;
	Dog1(String name,int count, int year){
		this.name=name;
		this.count=count;
		this.year=year;
	}

}
class Cat implements Serializable {
	String name;
	int year;
	Cat(String name,int year){
		this.name=name;
		this.year=year;
	}

}

class Rat implements Serializable {
	String name;
	int count;
	Rat(String name,int count){
		this.name=name;
		this.count=count;
	}

}