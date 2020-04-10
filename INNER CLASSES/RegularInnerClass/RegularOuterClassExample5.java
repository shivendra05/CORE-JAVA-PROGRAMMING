package RegularInnerClass;

public class RegularOuterClassExample5 {
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
		class RegularInnerInnerClass{
			int a=4;
			int b=4;
			public void addInnerInner() {
				int a=5;
				int b=5;
				System.out.println("Addition of numbers "+a+" "+this.b+" "+c+"::"+(a+b+c));
				System.out.println("Addition of numbers "+new RegularInnerClass().a+" "+new RegularInnerClass().b+" "+c+"::"+(a+b+c));
				System.out.println("Addition of numbers "+new RegularOuterClassExample5().a+" "+new RegularOuterClassExample5().b+" "+c+"::"+(a+b+c));
			}
		}
	}

	public static void main(String []args) {
		RegularOuterClassExample5 outerObj = new RegularOuterClassExample5();
		System.out.println("------InnnerClass-----");
		outerObj.new RegularInnerClass().addInner();
		outerObj.new RegularInnerClass().new RegularInnerInnerClass().addInnerInner();
		
		System.out.println("###################");
		new RegularOuterClassExample5().new RegularInnerClass().addInner();
		new RegularOuterClassExample5().new RegularInnerClass().new RegularInnerInnerClass().addInnerInner();
	}
}