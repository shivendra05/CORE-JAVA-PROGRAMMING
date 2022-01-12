package com.practice.langPackage;

import java.lang.reflect.Method;

public class AJava_lang_Package {

	/*
	 * Object class
	 * String class
	 * StringBuffer Class
	 * StringBuilder Class
	 * Wrapper Class
	 * AutoBoxing and AutoUnboxing
	 * 
	 */

	/*
	 * if our class doesnt extend any other class then only our class is a direct child of Object class. 
	 * 
	 * Object class defines 11 methods,
	 * 
	 * 1. public String toString()
	 * 2. public native int hasCode()
	 * 3. public boolean equals(Object s)
	 * 4. public final getClass()
	 * 5. public final void wait()
	 * 6. public native final void wait(long ms)
	 * 7. public final void wait(long ms,int ns)
	 * 8. public native final void notify()
	 * 9. public native final void notifyAll()
	 * 10. public native Object clone()
	 * 11. public void finalize()
	 * 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Class l = Class.forName("java.lang.Object");
		Method[] methods = l.getDeclaredMethods();
		int count=0;
		for( Method method:methods) {
			count++;
			System.out.println(method);
		}
		System.out.println("No. of Methods in Object class::"+count);
	}
}