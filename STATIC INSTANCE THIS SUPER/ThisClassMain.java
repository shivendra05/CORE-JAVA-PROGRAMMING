/*This keyword is used to inilize data member of class.
if formal parameter and local variables aree same  then this keyword  is  used to 
inilize  the local veriables/data memmbers.
*/
import java.util.*;
class ThisClass{
	int a, b;
	void sum(int a,int b){
		this.a = a;
		this.b = b;
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		a=a+1;
		b=b+1;
		System.out.println("Value of this.a:"+a);
		System.out.println("Value of this.b:"+b);
		this.a  =this.a+2;
		this.b  =this.b+2;
		System.out.println("Value of this.a:"+this.a);
		System.out.println("Value of this.b:"+this.b);
	}
}

class  ThisClassMain
{
	public static void main(String[] args) 
	{
		System.out.println("Demo on this Keyword");
		ThisClass tc = new ThisClass();
		tc.sum(10,20);
	}
}
