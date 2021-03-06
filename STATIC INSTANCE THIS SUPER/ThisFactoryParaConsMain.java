/*
Example of Parametriized, overloaded, factory method
*/
class ThisFactoryParaCons{
	int a,b;
	ThisFactoryParaCons(){
		a=1;
		b=2;
	}
	ThisFactoryParaCons(int a,int b){
		this.a =this.a+a;
		this.b=this.b=b;
	}
	void sum(int a){
		this.a=this.a+a;
		this.b=this.a+a;
	}
	ThisFactoryParaCons sum(ThisFactoryParaCons y){
		ThisFactoryParaCons t1 = new ThisFactoryParaCons();
		t1.a=this.a+y.a;
		t1.b=this.b+y.b;
		return t1;
	}
	ThisFactoryParaCons(ThisFactoryParaCons x){
		this.a=x.a;
		this.b=x.b;
	}
	void display(){
		System.out.println("Value of this.a:"+this.a);
		System.out.println("Value of this.b:"+this.b);
	}
}

class ThisFactoryParaConsMain{
	public static void main(String[] args) {
		System.out.println("Factory Method  with this  keyword");
		System.out.println("====DEFAULT CONSTRUCTOR====");
		ThisFactoryParaCons tfp = new ThisFactoryParaCons();
		tfp.display();
		System.out.println("====SUM METHOD====");
		tfp.sum(10);
		tfp.display();
		System.out.println("====PARAMERIZED CONSTRUCTOR====");
		ThisFactoryParaCons tfp1 = new ThisFactoryParaCons(100,200);
		tfp1.display();
		System.out.println("====OBJECT PARAMERIZED CONSTRUCTOR====");
		ThisFactoryParaCons tfp2 = new ThisFactoryParaCons(tfp1);
		tfp2.display();
		System.out.println("====FACTORY METHOD====");
		ThisFactoryParaCons tfp3 = new ThisFactoryParaCons();
		tfp3= tfp1.sum(tfp2);
		tfp3.display();
	}
}Z