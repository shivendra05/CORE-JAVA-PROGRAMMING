interface Inter1{
	void m1();
}

interface Inter2{
	void m2();
}

class interPrac implements Inter1, Inter2{
	public void m1(){
		System.out.println("m1 is Overriden in interPrac");
	}
	public void m2(){
		System.out.println("m2 is Overriden in interPrac");
	}
	void m3(){
		System.out.println("m3 is Special Method in interPrac");
	}
}
/* Interface Object can not be careted becasue it has all abstract methods */
class interPrac1{
	public static void main(String []k){
		System.out.println("Interface Implimemtation");
		
		System.out.println("---------------------------------------");
		System.out.println("---Direct Object Creation---");
		interPrac ip1 = new interPrac();
		ip1.m1();
		ip1.m2();
		ip1.m3();

		System.out.println("---------------------------------------");
		System.out.println("--- InDirect Object Creation---");
		Inter2 ip2 = new interPrac();
		//ip2.m1();   //InValid Bacause m1 is not preasent in Inter2, it is declared in Inter1  
		ip2.m2();
		//ip2.m3();	  //InValid Bacause m3 is a Special ,method preasent in interPrac, i.e m3 is not decleard 
		
		System.out.println("---------------------------------------");
		System.out.println("--- InDirect Object Creation---");
		Inter1 ip3 = new interPrac();
		ip3.m1();     
		//ip3.m2();	  //InValid Bacause m2 is not preasent in Inter1, it is declared in Inter2
		//ip3.m3();	  //InValid Bacause m3 is a Special ,method preasent in interPrac, i.e m3 is not decleard 
		}
}