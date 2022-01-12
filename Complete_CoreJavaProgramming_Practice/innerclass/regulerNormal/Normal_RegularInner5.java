package com.practice.innerclass.regulerNormal;

//outerClass
public class Normal_RegularInner5 {
	/*1. Normal/Regular Inner Class
	 * 
	 * if we are declaring any named class, directly inside a class without a modifier. 
	 * such class is called as normal or regular inner class.
	 */

	//InnerClass
	class Norm_RegInner {
		/*
		 * Inside inner class , we cant declare any static members hence we cant declare main()
		 * and we cant run inner class directly from command prompt.
		 * */
		public void innerMethod() {
			System.out.println("Inner Class 5- innerMethod()");
		}
	}
	/*javac Normal_RegularInner
	 * 
	 * .class1 -> Normal_RegularInner.class
	 * .class2 -> Normal_RegularInner$Norm_RegInner.class
	 */
	public void outerMethod() {
		System.out.println("Outer Class 5- OuterMethod()");

		Norm_RegInner inner= new Norm_RegInner();
		inner.innerMethod();
	}
	public static void main(String[] args) {
		//case1::
		Normal_RegularInner5 outer =new Normal_RegularInner5();
		outer.outerMethod();

		//case2::
		new Normal_RegularInner5().outerMethod();

		//cas3::
		Normal_RegularInner5 outerToInner = new Normal_RegularInner5();
		Norm_RegInner inner = outerToInner.new Norm_RegInner();
		inner.innerMethod();

		//cas4::
		Norm_RegInner Inner1 = new Normal_RegularInner5().new Norm_RegInner();
		Inner1.innerMethod();
	}
}