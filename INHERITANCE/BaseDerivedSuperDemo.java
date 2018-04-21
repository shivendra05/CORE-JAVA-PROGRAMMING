import java.util.*;
class SuperBase{
	int a=100;
}
class SuperDerived extends SuperBase{
	int a,b;
	void setData(int a,int b){
		this.a=a;
		this.b=b;
		///super.a=a;
	}
	void getData(){
		System.out.println("BC a: "+super.a);
		System.out.println("DC a: "+this.a);
		System.out.println("DC b: "+this.b);
	}
}

class  BaseDerivedSuperDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Super at data Member level");
		SuperDerived sd =new SuperDerived();
		Scanner sn =new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x= Integer.parseInt(sn.nextLine());
		int y= Integer.parseInt(sn.nextLine());
		sd.setData(x,y);
		sd.getData();
	}
}