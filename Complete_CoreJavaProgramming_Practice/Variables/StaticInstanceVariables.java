package com.practice.Variables;

public class StaticInstanceVariables {
	static int i=10;
	int j=20;

	public static void main(String[] args) {

		StaticInstanceVariables si = new StaticInstanceVariables();
		si.i=100;
		si.j=200;
		StaticInstanceVariables si1 = new StaticInstanceVariables();
		System.out.println("i->"+si.i+" j->"+si.j);
		System.out.println("i->"+si1.i+" j->"+si1.j);
	}
}