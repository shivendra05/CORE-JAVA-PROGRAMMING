package com.practice.DataTypes;

import com.practice.declarationAccessModifier.ProtectedA;

public class ProtectedD extends ProtectedA{
	public static void main(String[] args) {
		//parent reference with parent constructor from other package not allowed
		/*ProtectedA aa= new ProtectedA();
		aa.printMSG();
		*/
		
		//child reference with child constructor
		ProtectedD bb= new ProtectedD();
		bb.printMSG();

		//parent reference with child constructor  from other package not allowed
		/*ProtectedA ab= new ProtectedD();
		ab.printMSG();
		*/}
}