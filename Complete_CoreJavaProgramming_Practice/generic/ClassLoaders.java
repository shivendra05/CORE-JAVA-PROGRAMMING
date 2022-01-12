package com.practice.generic;

public class ClassLoaders {

	/* 1. bootstrap class loader
	 * 2. Extension class loader
	 * 3. Application/System class loader
	 */
	public static void main(String[] args) {
		System.out.println(System.class.getClassLoader());
		System.out.println(ClassLoaders.class.getClassLoader());
	}
}