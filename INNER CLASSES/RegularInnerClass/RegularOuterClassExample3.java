package RegularInnerClass;

public class RegularOuterClassExample3 {
	int a=1;
	int b=2;
	static int c=3;	
	class RegularInnerClass{
		int d=new RegularOuterClassExample3().a+1;
		int e=new RegularOuterClassExample3().b+1;
		int f=RegularOuterClassExample3.c+1;
		public void add() {
			System.out.println("Addition of numbers "+d+" "+e+" "+f+"::"+(d+e+f));
		}
	}

	public static void main(String []args) {
		RegularOuterClassExample3 outerObj = new RegularOuterClassExample3();
		System.out.println("------InnnerClass-----");
		outerObj.new RegularInnerClass().add();

		System.out.println("###################");
		new RegularOuterClassExample3().new RegularInnerClass().add();
	}
}