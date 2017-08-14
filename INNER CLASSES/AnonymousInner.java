import java.util.Scanner;

abstract class AnonymousInner {
	abstract void sum();
}

class AnonymousInnerMain {
	public static void main(String []k){
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter two vlaues");
			int a= Integer.parseInt(sn.nextLine());
			int b= Integer.parseInt(sn.nextLine());	
		AnonymousInner ac = new AnonymousInner(){
			void sum(){
				int c= a+b;
				System.out.println("Sum of two number is: "+c);
			}
		};
		ac.sum();
	}

}
