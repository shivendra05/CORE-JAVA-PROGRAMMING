package com.practice.declarationAccessModifier;
import com.practice.DataTypes.Literals;
/*
//class declared as public, can be access from any where in the project.
1. with-in Class
2. OutSide Class
3. Same Packages
4. Child Packages
5. Other packages*/
public class PublicClass {
	public static void main(String[] args) {

		//package com.practice.DataTypes.Literals --> class is default so we cant access out side package
		//to access Literals, make it public it. else cant access.
		// not a public cant be access outside package(only with the current package)
		Literals let = new Literals();
		let.charToIntegeral();

	}	
}