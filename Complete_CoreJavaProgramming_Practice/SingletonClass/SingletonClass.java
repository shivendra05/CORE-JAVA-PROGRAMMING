package com.practice.SingletonClass;

/*
 * if a class is allowed to create only one obect is called singleton class
 * 
 * Runtime
 * ServiceLocator
 * 
 * 
 * advantage::
 * 
 * if several people have same requiremetn then its not adviced to have different object, rather we need have only one
 * object and used between all.
 * 
 * */
public class SingletonClass {
	private static SingletonClass sc = null;
	private SingletonClass(){
		
	}
	
	public static SingletonClass getObject() {
		if (sc==null)
			sc= new SingletonClass();
		return sc;
	}
}

class SingletonClassMain {
	public static void main(String[] args) {
		SingletonClass t1= SingletonClass.getObject();
		SingletonClass t2 = SingletonClass.getObject();
		System.out.println("t1==t2 :: "+t1.hashCode()+" "+t2.hashCode());	
	}
}