package com.practice.innerclass.regulerNormal;

//outerClass
public class Normal_RegularInner4 {
	/* 1. Normal/Regular Inner Class
	 * 
	 * if we are declaring any named class, directly inside a class without a modifier. 
	 * such class is called as normal or regular inner class.
	 */

//InnerClass
	class Norm_RegInner {
		/*
		 * Inside inner class , we cant declare any static members hence we cant declare main()
		 * and we cant inner class directly from command prompt.
		 * */
		public void innerMethod() {
			System.out.println("Inner Class 4- innerMethod()");
		}
	}
	/*javac Normal_RegularInner
	 * 
	 *.class1 -> Normal_RegularInner.class
	 *.class2 -> Normal_RegularInner$Norm_RegInner.class
	 */
	public static void main(String[] args) {
		//case1::
		Normal_RegularInner4 outer =new Normal_RegularInner4();
		Norm_RegInner inner = outer.new Norm_RegInner();
		inner.innerMethod();
		
		//case2::
		Norm_RegInner inner1 = new Normal_RegularInner4().new Norm_RegInner();
		inner1.innerMethod();
		
		//case3::
		new Normal_RegularInner4().new Norm_RegInner().innerMethod();
	}
}