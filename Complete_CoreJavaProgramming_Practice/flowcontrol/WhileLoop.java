package com.practice.flowcontrol;

public class WhileLoop {
	public static void main(String[] args) {
		//unreachable statements are not allowed in java, JVM gives compile time error
		//unreachbility because of true/false/final or constant not allowed


		//outside code of loop is unreachable so Error
    /* while(true) {
		System.out.println("Bye");
		}
		System.out.println("Hi");
	*/
		//inner code, of loop is unreachable so Error
		/*while(false) {
		System.out.println("Bye");
		}
		System.out.println("Hi");
		 */

		//since x is final, its value will not  change ever so,
		//outer code of loop is unreachable so Error

/*		final int x=10;
		int y=20;
		while(x<y) {
			System.out.println("Bye");
		}
		System.out.println("Hi");
*/

		//since xx is final, its values will not change ever so,
		//outside code of loop is unreachable so Error
/*		final int xx=10;
		int yy=20;
		while(xx>yy) {
			System.out.println("Bye");
		}
		System.out.println("Hi");
*/

		int x1=10;
		int y1=20;
		while(x1>y1) {
			System.out.println("Bye");
		}
		System.out.println("Hi");
	}	
}