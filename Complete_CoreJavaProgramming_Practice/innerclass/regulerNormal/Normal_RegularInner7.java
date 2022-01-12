package com.practice.innerclass.regulerNormal;

import com.practice.innerclass.regulerNormal.Normal_RegularInner7.Norm_RegInner;

//outerClass
public class Normal_RegularInner7 {
	/*1. Normal/Regular Inner Class
	 * 
	 * if we are declaring any named class, directly inside a class without a modifier. 
	 * such class is called as normal or regular inner class.
	 */

//InnerClass
	int a=10;
	static int b=20;
	class Norm_RegInner {
		/*from normal inner class we can access static and instance variable
		 */
		/*Inside inner class , we cant declare any static members hence we cant declare main()
		 * and we cant inner class directly from command prompt.
		 */
		public void innerMethod() {
			System.out.println("Inner Class 7- innerMethod()");
			System.out.println("Instance variable "+a);
			System.out.println("Static variable "+b);
		}
	}
	/*javac Normal_RegularInner
	 * 
	 *.class1 -> Normal_RegularInner.class
	 *.class2 -> Normal_RegularInner$Norm_RegInner.class
	 */
	public void outerMethod() {
		System.out.println("Outer Class 7- OuterMethod()");
	}
}

class NormalInnerClass7{
	public static void main(String[] args) {

		Normal_RegularInner7 outer= new Normal_RegularInner7();
		Norm_RegInner inner = outer.new Norm_RegInner();
		inner.innerMethod();
		System.out.println("-------------");
		new Normal_RegularInner7().new Norm_RegInner().innerMethod();
	}
}