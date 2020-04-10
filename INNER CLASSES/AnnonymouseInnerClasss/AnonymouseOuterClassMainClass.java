package AnnonymouseInnerClasss;

public class AnonymouseOuterClassMainClass {

	public static void main(String[] args) {
		System.out.println("-------With Anonymounse Inner class");
		AnonymouseOuterClass outerClass = new AnonymouseOuterClass() {
			public void taste() {
				System.out.println("Its spicy");
			}
		};
		outerClass.taste();
		
		System.out.println("-------Without Anonymounse Inner class");
		AnonymouseOuterClass outerClass1 = new AnonymouseOuterClass();
		outerClass1.taste();
		
	}
}
