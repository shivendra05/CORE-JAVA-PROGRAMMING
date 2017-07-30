/*
super keyword,Inheritance classes,
	1-super at data member
				if data memebr name at base calss and derived class is same,then we can defferenciate
				them with this and super.
	
	2-super at data method 
				if data mehtod name at base calss and derived class is same,then we can call base call
				method with super.
	
	3-super at contructor
				we can call costructor of Base class in derived class with super provided it should be 
				first statement.
*/ 
import java.util.Scanner;
class SuperMember
{
	//TBC data member
	int a;
	//TBC construtor
	SuperMember(){
		System.out.println("\n	TOPMOST BASE CLASS	DEFAULT CONSTRUCOT	\n");
	}
	//TBC data method
	void getValues(){
		System.out.println("\n	TOPMOST BASE CLASS	\n");
		System.out.println("Value of a: "+a);
	}
}
class SuperMember1 extends SuperMember
{	
	int a,b;
	//BDC construtor
	SuperMember1(){
		super();//calling TBC construtor
		System.out.println("\n	BOTTOM MOST DERIVED CLASS DEFAULT CONSTRUCOT	\n");
	}
	void setValues(int x,int y){
		super.a=x; //TBC data member
		this.a=y;
		b=super.a+this.a;
	}
	//BDC data method
	void getValues(){
		super.getValues(); //TBC data method
		System.out.println("\n	INTERMEDIATE DERIVED CLASS	\n");
		System.out.println("Super keyword for a: "+super.a);
		System.out.println("this keyword for a: "+a);
		System.out.println("Addition is c: "+b);
	}
}

class SuperMain
{
	public static void main(String []k){
		SuperMember1 s= new SuperMember1();
		s.setValues(100,200);
		s.getValues();
	}
}