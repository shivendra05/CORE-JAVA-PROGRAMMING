class OverloadingConst{
	int a,b;
	OverloadingConst(int a){
		this.a =a;
		System.out.println("Value of a:"+a);
	}
	OverloadingConst(int a,int b){
		this.a =a;
		this.b =b;
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
	}
}
class  OverloadingConstMain{
	public static void main(String[] args){
		System.out.println("-------Constructor Overloading");
		System.out.println("-------Signle paramerized Overloaded construtor");
		OverloadingConst olc = new OverloadingConst(10);
		System.out.println("-------Double paramerized Overloaded construtor");
		OverloadingConst olc2 = new OverloadingConst(30,40);
	}
}