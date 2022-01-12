package com.practice.oops.polymorthism;

public class CouplingA {
	//the degree of dependency between components is called Coupling
	//if dependecy is more than it is called as tightly coupling and if dependency is less it is called loosly coupling. 
	static int a=CouplingB.b; 
}

class CouplingB {
	//the degree of dependency between components is called Coupling
	//if dependecy is more than it is called as tightly coupling and if dependency is less it is called loosly coupling. 
	static int b=CouplingC.c; 
}

class CouplingC {
	//the degree of dependency between components is called Coupling
	//if dependecy is more than it is called as tightly coupling and if dependency is less it is called loosly coupling. 
	static int c=CouplingD.d; 
}

class CouplingD {
	//the degree of dependency between components is called Coupling
	//if dependecy is more than it is called as tightly coupling and if dependency is less it is called loosly coupling. 
	static int d=10; 
}

//its tightly coupled ..one is dependent of other class
/*problems..
 * 1. Enhancement is difficult
 * 2. Supresses Reusebility of code.
*/