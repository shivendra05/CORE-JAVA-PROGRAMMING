package com.practice.innerclass.regulerNormal;

import com.practice.innerclass.regulerNormal.Normal_RegularInner8.Norm_RegInner;

//outerClass
public class Normal_RegularInner8 {
	/*
	 * 1. Normal/Regular Inner Class
	 * 
	 * if we are declaring any named class, directly inside a class without a modifier. 
	 * such class is called as normal or regular inner class.
	 * 
	 * the applicable modifier for outer class are.
	 * public default final abstract strictfp 
	 */

//InnerClass
	int a=10;
	class Norm_RegInner {
		int a=100;
		/*from normal inner class we can access static and instance variable
		 * the applicable modifier for inner classes are, public, default, final, abstract, strictfp private, protected,static
		 */

		/*Inside inner class , we cant declare any static members hence we cant declare main()
		 * and we cant call inner class directly from command prompt.
		 * 
		 * within the inner class, this always refers current inner class object.
		 * if we want to refer current outer class object we should use. OuterClassName.this
		 */
		public void innerMethod() {
			int a=1000;
			System.out.println("Local:: "+a);
			
			System.out.println("Current Class:: "+this.a);
			System.out.println("Current Class:: "+Norm_RegInner.this.a);
			
			System.out.println("Outer Class:: "+new Normal_RegularInner8().a);
			System.out.println("Outer Class:: "+Normal_RegularInner8.this.a);
		}
	}
}

class NormalInnerClass8{
	public static void main(String[] args) {

		Normal_RegularInner8 outer= new Normal_RegularInner8();
		Norm_RegInner inner = outer.new Norm_RegInner();
		inner.innerMethod();
		System.out.println("-------------");
		new Normal_RegularInner8().new Norm_RegInner().innerMethod();
	}
}