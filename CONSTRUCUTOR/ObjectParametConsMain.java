class ObjectParametCons{
	int a,b;
	ObjectParametCons(int a, int b){
		this.a= a;
		this.b = b;
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}
	ObjectParametCons(ObjectParametCons x){
		this.a= x.a;
		this.b = x.b;
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}
}

class  ObjectParametConsMain{
	public static void main(String[] args){
		System.out.println("------Copy  Construtor");
		ObjectParametCons cpc = new ObjectParametCons(10,20);
		System.out.println("------Object  Paramerized Constructor");
		ObjectParametCons cpc1 = new ObjectParametCons(cpc);
	}
}