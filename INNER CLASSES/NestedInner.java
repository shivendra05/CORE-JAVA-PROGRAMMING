
class NestedInner {
	int a=10;
	static int b=20;
	
	void display(){
		System.out.println("Local varibale a: "+a);
		System.out.println("Local varibale b: "+b);
		
		class NestedInner1{

			int c=30;
			void display(){
				System.out.println("\tNested Inner class\t");
				System.out.println("Local varibale a: "+a);
				System.out.println("Local varibale b: "+b);
				System.out.println("Local varibale c: "+c);
			}
		}
		NestedInner1 ni1 = new NestedInner1();
				ni1.display();
	}
}

class NestedInnerMain{
	public static void main(String []k){

		System.out.println("\tExample of Inner classes\t");
		NestedInner ni = new NestedInner();
		ni.display();
	}
}
