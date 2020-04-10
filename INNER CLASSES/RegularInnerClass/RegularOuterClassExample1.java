package RegularInnerClass;

public class RegularOuterClassExample1 {
	public void mul() {
		System.out.println("Multuplication of numbers");
	}
	class RegularInnerClass{
		public void add() {
			System.out.println("Addition of numbers");
		}
	}
	
	public static void main(String []args) {
		System.out.println("-------OuterClass----");
		RegularOuterClassExample1 outerObj = new RegularOuterClassExample1();
		outerObj.mul();
		System.out.println("------InnnerClass-----");
		outerObj.new RegularInnerClass().add();
		
		System.out.println("###################");
		System.out.println("-------OuterClass----");
		new RegularOuterClassExample1().mul();
		System.out.println("------InnnerClass-----");
		new RegularOuterClassExample1().new RegularInnerClass().add();
		
		
	}
}