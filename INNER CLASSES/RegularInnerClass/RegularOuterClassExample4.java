package RegularInnerClass;

public class RegularOuterClassExample4 {
	int a=1;
	int b=1;
	static int c=2;	
	class RegularInnerClass{
		int a=2;
		int b=2;
		public void addInner() {
			int a=3;
			int b=3;
			System.out.println("Addition of numbers "+a+" "+this.b+" "+c+"::"+(a+b+c));
		}
		public void addOuters() {
			System.out.println("Addition of numbers "+this.a+" "+this.b+" "+c+"::"+(a+b+c));
		}
	}

	public static void main(String []args) {
		RegularOuterClassExample4 outerObj = new RegularOuterClassExample4();
		System.out.println("------InnnerClass-----");
		outerObj.new RegularInnerClass().addInner();
		outerObj.new RegularInnerClass().addOuters();
		
		System.out.println("###################");
		new RegularOuterClassExample4().new RegularInnerClass().addInner();
		new RegularOuterClassExample4().new RegularInnerClass().addOuters();
	}
}