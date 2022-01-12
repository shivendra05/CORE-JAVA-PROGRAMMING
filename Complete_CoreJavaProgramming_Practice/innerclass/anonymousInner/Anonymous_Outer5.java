package com.practice.innerclass.anonymousInner;

//outerClass
public class Anonymous_Outer5 {
	/*3. Anonymous Inner Class
	 * 
	 * main purpose of it is just for instance uses(one time uses)
	 * 
	 * 3.1 Anonymous Inner class that extends a class
	 * 3.2 Anonymous Inner class that implements an interface
	 * 3.3 Anonymous Inner class that defined inside arguments
	 */
	public static void main(String[] args) {
		Runnable runnable= new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <5; i++) {
					System.out.println("Child Thread:: Runnable");
				}	
			}
		};
		Thread t = new Thread(runnable);
		t.start();

		for (int i = 0; i <5; i++) {
			System.out.println("Main Thread::Runnable");
		}
	}
}