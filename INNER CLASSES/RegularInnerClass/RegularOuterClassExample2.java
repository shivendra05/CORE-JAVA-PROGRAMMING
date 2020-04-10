package RegularInnerClass;

public class RegularOuterClassExample2 {
	int a;
	int b;
	RegularOuterClassExample2(){
		this.a=0;
		this.b=0;
	}
	RegularOuterClassExample2(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void mul() {
		System.out.println("Multuplication of numbers: "+(a*b));
	}
	
	class RegularInnerClass{
		int a,b;
		RegularInnerClass(int a,int b){
			this.a=a;
			this.b=b;
		}
		public void add() {
			System.out.println("Addition of numbers: "+(a+b));
		}
	}

	public static void main(String []args) {
		System.out.println("-------OuterClass----");
		RegularOuterClassExample2 outerObj = new RegularOuterClassExample2(10,10);
		outerObj.mul();
		System.out.println("------InnnerClass-----");
		outerObj.new RegularInnerClass(1,1).add();

		System.out.println("###################");
		System.out.println("-------OuterClass----");
		new RegularOuterClassExample2(10,10).mul();
		System.out.println("------InnnerClass-----");
		new RegularOuterClassExample2().new RegularInnerClass(1,1).add();
	}
}