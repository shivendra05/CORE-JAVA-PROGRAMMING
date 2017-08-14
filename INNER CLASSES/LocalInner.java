
class LocalInner {
	int a=10;
	static int b=20;
	void display(){
		System.out.println("Class local variable a: "+a);
		System.out.println("Class local variable b: "+b);
		System.out.println("Class local variable c: "+new InstanceInner().c);
		System.out.println("Class local variable d: "+new InstanceInner().d);
	}
	class InstanceInner{
		int c=30;
		static final int d=40;
	
		void display(){
			System.out.println("Instance Class local variable a: "+a);
			System.out.println("Instance Class local variable b: "+b);
			System.out.println("Instance Class local variable c: "+c);
			System.out.println("Instance Class local variable d: "+d);
		}
	}
}
class LocalInnerMain{
	
	public static void main(String []k){
		
		System.out.println("\tClass variable values\t");
		LocalInner li = new LocalInner();
		li.display();
		
		System.out.println("\tLocal inner class variable values\t");
		LocalInner.InstanceInner li1 = new LocalInner().new InstanceInner();
		li1.display();
	}
}