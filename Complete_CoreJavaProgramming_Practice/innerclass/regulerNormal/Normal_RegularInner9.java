package com.practice.innerclass.regulerNormal;

import com.practice.innerclass.regulerNormal.Normal_RegularInner9.Norm_RegInner;
import com.practice.innerclass.regulerNormal.Normal_RegularInner9.Norm_RegInner.NorMost_RegInner;

//outerClass
/*
 * nesting of inner classes is possible.
 * */
public class Normal_RegularInner9 {
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
	class Norm_RegInner {
		/*from normal inner class we can access static and instance variable
		 * 
		 * the applicable modifier for inner classes are, public, default, final, abstract, strictfp private, protected,static
		 * Inside inner class , we cant declare any static members hence we cant declare main()
		 * and we cant inner class directly from command prompt.
		 * 
		 * within the inner class, this always refers current inner class object.
		 * if we want to refer current outer class object we should use. OuterClassName.this
		 */
		class NorMost_RegInner {
			public void m1() {
				System.out.println("inner Most class M1");
			}
		}
	}
}

class NormalInnerClass9{
	public static void main(String[] args) {

		Normal_RegularInner9 outer= new Normal_RegularInner9();
		Norm_RegInner inner = outer.new Norm_RegInner();
		NorMost_RegInner innerMost = inner.new NorMost_RegInner();
		innerMost.m1();
		
		System.out.println("-------------");
		new Normal_RegularInner9().new Norm_RegInner().new NorMost_RegInner().m1();
	}
}