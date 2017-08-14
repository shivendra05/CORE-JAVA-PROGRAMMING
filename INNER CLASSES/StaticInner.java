class StaticInner {
	
	int a=10;
	static int b =20;
	
	void dispaly(){
		System.out.println("Outer Class value a= "+a);
		System.out.println("Outer Class value b= "+b);
		System.out.println("Outer Class value c= "+new StaticInner1().c);
		System.out.println("Outer Class value d= "+StaticInner1.d);
	}
	
	static class StaticInner1{
		int c=30;
		static int d =40;
		
		void display(){
			System.out.println("Inner class value a= "+new StaticInner().a);
			System.out.println("Inner class value b= "+b);
			System.out.println("Inner class value c= "+c);
			System.out.println("Inner class value d= "+d);
		}
	}
}


class StaticInnerMain{
	public static void main(String []k){
		System.out.println("\tClass variable to and Methods\t");
		StaticInner si = new StaticInner();
		si.dispaly();
		
		System.out.println("\t static Class veriable amd Methods\t");
		StaticInner.StaticInner1 si1 = new StaticInner.StaticInner1();
		si1.display();
	}
}