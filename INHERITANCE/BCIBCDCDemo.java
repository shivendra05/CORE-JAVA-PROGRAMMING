class BaseClas{
	int a=1;
}
class InterrmediateBaseClass extends BaseClas{
	int a=10,b=20;
	int  d= super.a;
	void display(){
		System.out.println("Intermediate Base Class");
	}
}
class DerivedClass extends InterrmediateBaseClass{
	int a=100,b=200,c=300;
	void display(){
		super.display();
		System.out.println("Derived Class");
		super.display();
	}
	void getData(){
		System.out.println("BC a: "+d);
		System.out.println("IBC a: "+super.a);
		System.out.println("IBC b: "+super.b);
		System.out.println("DC a: "+a);
		System.out.println("DC b: "+b);
		System.out.println("DC c: "+c);
	}
}

class  BCIBCDCDemo{
	public static void main(String[] args){
		System.out.println("Super at Data Member and Method Level");
		DerivedClass dc = new DerivedClass();
		dc.getData();
		dc.display();
	}
}
