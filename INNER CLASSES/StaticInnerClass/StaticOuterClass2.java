package StaticInnerClass;

public class StaticOuterClass2 {

	static class StaticInnerClass{
		int a=20;
		static int b=30;
		public void innerMethod() {
			System.out.println("Sum: "+(a+b));
			System.out.println("StaticOuterClass.StaticInnerClass.innerMethod()");
		}
	}
	public static void main(String[] args) {
		StaticInnerClass obj = new StaticInnerClass();
		obj.innerMethod();
		int newSum = obj.a+obj.b;
		System.out.println("New Sum1: "+newSum);
		
		int newSum1 = obj.a+StaticInnerClass.b;
		System.out.println("New Sum2: "+newSum1);
		
	}
}
