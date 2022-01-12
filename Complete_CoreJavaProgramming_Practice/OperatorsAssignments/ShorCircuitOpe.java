package com.practice.OperatorsAssignments;

public class ShorCircuitOpe {
	//&,| vs &&,|| -> 
	//$,| is called a bit wise operator and &&,|| is called a short circuit opera 
	//$,| applicable for integral and Boolean but &&,|| applicable for only boolean
	//$,| both args will be evaluated but &&,|| either one or both args will be evaluated
	
	public static void main(String[] args) {
		int i=10;
		int j=20;
		
		
		if('a'<'v') {
			System.out.println("Both part evaluated--for bit wise");
		}else {
			System.out.println("Both part evaluated--for bit wise");
		}
		
		if(i>12 && j<25) {
			System.out.println("Only one part evaluated");
		}else {
			System.out.println("if first fails then only both part evaluated");
		}
		
		if(i<12 && j<25) {
			System.out.println("both part evaluated");
		}
		
		if(++i<10 && i/0>0) {
			System.out.println("** Hello **");
		}else {
			System.out.println("## Hi ##");
		}
	}	
}