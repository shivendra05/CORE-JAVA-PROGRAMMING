package methodInnerClass;

public class MethodOuterClass1 {
	
	public void add() {
		System.out.println("This is Method");
		class MethodinnerClass {
			public void mul() {
				System.out.println("Its Method_InnerClass");
			}
		}
		MethodinnerClass methodInnnerclass = new MethodinnerClass();
		methodInnnerclass.mul();
		System.out.println("--------------");
		new MethodinnerClass().mul();
	}
	
	public static void main(String args[]) {
		MethodOuterClass1 outclass = new MethodOuterClass1();
	outclass.add();
	System.out.println("############################");
	new MethodOuterClass1().add();
	}
}