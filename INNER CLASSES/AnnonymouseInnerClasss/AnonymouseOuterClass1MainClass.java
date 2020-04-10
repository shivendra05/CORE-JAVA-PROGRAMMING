package AnnonymouseInnerClasss;

public class AnonymouseOuterClass1MainClass {

	public static void main(String[] args) {
		System.out.println("-------With Anonymounse Inner class");
		AnonymouseOuterClass outerClass = new AnonymouseOuterClass() {
			public void taste() {
				System.out.println("Its spicy");
				look();
			}
			
			public void look() {
				System.out.println("Its Good");
			}
		};
		outerClass.taste();
		
		System.out.println("-------Without Anonymounse Inner class");
		AnonymouseOuterClass outerClass1 = new AnonymouseOuterClass();
		outerClass1.taste();
		
	}
}
