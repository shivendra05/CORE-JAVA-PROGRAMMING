package com.practice.innerclass.regulerNormal;

//outerClass
public class Normal_RegularInner2 {
	/* 1. Normal/Regular Inner Class
	 * 
	 * if we are declaring any named class, directly inside a class without a modifier. 
	 * such class is called as normal or regular inner class.
	 */

//InnerClass
	class Norm_RegInner {
		/*without University department cant exist
		 */
	}
	/* javac Normal_RegularInner
	 * 
	 *.class1 -> Normal_RegularInner.class
	 *.class2 -> Normal_RegularInner$Norm_RegInner.class
	 * */
	public static void main(String[] args) {
		System.out.println("Outer Class");
	}
}