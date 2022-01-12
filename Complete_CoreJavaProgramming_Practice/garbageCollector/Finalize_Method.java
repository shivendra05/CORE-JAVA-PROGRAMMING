package com.practice.garbageCollector;

public class Finalize_Method {

	/* Finalization --> just before destroying an object GC calls finalize() for clean up purpose.
	 *			once finalize() completes automatically GC destroys the object.
	 *Finalize() present in Object class, with the following declaration
	 *
	 *protected void finalize() throws Throwable
	 *
	 * we can override finalize method to define our own clean up method.
	 */
	public static void main(String[] args) {
		System.out.println("*********Case1**********");
		//Class1::
		String str= new String("shivendra");		
		str=null;
		System.gc();// String class finalize() method will be called Because of String class object
		System.out.println("Main");
	
		//Case2::
		System.out.println("*********Case2**********");
		Finalize_Method fm = new Finalize_Method();
		fm=null;
		System.gc(); // will Finalize_Method finalize() method
		System.out.println("Main");

		//Case3::
		System.out.println("*********Case3**********");
		Finalize_Method fm1 = new Finalize_Method();
		fm1.finalize(); //manually called, So will be treated as normal method and Object will not be destroyed
		fm1.finalize(); //manually called, So will be treated as normal method and Object will not be destroyed
		fm1=null;
		System.gc(); // will Finalize_Method finalize() method
		System.out.println("Main");
	}
	protected void finalize() {
		System.out.println("Finalize");
	}
}