package com.practice.flowcontrol;

public class TransferStatment {
	public static void main(String[] args) {

//break works with switch/loop/labeled blocks and  continue
//continue(skip) works with loop/labeled blocks

		int x=10;
		l1:
		{	
			System.out.println("Begins");
		if(x==10)
			break l1;
		System.out.println("Ends");
		}	
		System.out.println("Hello");
	}	
}