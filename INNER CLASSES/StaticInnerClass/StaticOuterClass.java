package StaticInnerClass;

public class StaticOuterClass {

	static class StaticInnerClass{
		public void innerMethod() {
			System.out.println("StaticOuterClass.StaticInnerClass.innerMethod()");
		}
	}
	public static void main(String[] args) {
		StaticInnerClass obj = new StaticInnerClass();
		obj.innerMethod();
	}
}
