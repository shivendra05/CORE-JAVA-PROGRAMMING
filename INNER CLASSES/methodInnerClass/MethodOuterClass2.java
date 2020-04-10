package methodInnerClass;

public class MethodOuterClass2 {
	
	int a=1;
	static int b=1; 
	public void add() {
		int c=2;
		///inside instance method we cant declare static variable or methods
		//static int d=2;  invalid
		System.out.println("This is Method");
		class MethodinnerClass {
			int c=3;
			public void mul() {
				int c=4;
				System.out.println("Its Method_InnerClass: "+(c+this.c));
			}
		}
		System.out.println("Outside methodInner: "+(c+new MethodinnerClass().c));
		MethodinnerClass methodInnnerclass = new MethodinnerClass();
		methodInnnerclass.mul();
		System.out.println("--------------");
		new MethodinnerClass().mul();
	}
	
	public static void main(String args[]) {
		
	MethodOuterClass2 outclass = new MethodOuterClass2();
	outclass.add();
	System.out.println("############################");
	new MethodOuterClass2().add();
	}
}