package com.practice.innerclass.regulerNormal;

import com.practice.innerclass.regulerNormal.Normal_RegularInner6.Norm_RegInner;

//outerClass
public class Normal_RegularInner6 {
	/* 1. Normal/Regular Inner Class
	 * 
	 * if we are declaring any named class, directly inside a class without a modifier. 
	 * such class is called as normal or regular inner class.
	 */

//InnerClass
	class Norm_RegInner {
		/*Inside inner class , we cant declare any static members hence we cant declare main()
		 * and we cant inner class directly from command prompt.
		 */
		public void innerMethod() {
			System.out.println("Inner Class 6- innerMethod()");
		}
	}
	/*javac Normal_RegularInner
	 * 
	 *.class1 -> Normal_RegularInner.class
	 *.class2 -> Normal_RegularInner$Norm_RegInner.class
	 */
	public void outerMethod() {
		System.out.println("Outer Class 6- OuterMethod()");
	}
}

class NormalInnerClass{
	public static void main(String[] args) {
		//access outer class code.
		Normal_RegularInner6 outer= new Normal_RegularInner6();
		outer.outerMethod();

		//access inner class code.
		Normal_RegularInner6 outer1= new Normal_RegularInner6();
		Norm_RegInner innter1= outer1.new Norm_RegInner();
		innter1.innerMethod();

		//access inner class code.
		Norm_RegInner outer2= new Normal_RegularInner6().new Norm_RegInner();
		outer2.innerMethod();

		//access inner class code.
		new Normal_RegularInner6().new Norm_RegInner().innerMethod();
	}
}