/*interface and its Implimentation to show the methods Accessbility*/

interface InterImp{
	abstract void m1();
	void m2();
}

//If an Implimentation class doesnt implelemt all methods of interface then class must be abstract
abstract class InterImp1 implements InterImp{
	public void m1(){
		System.out.println("m1 Overriden in InterPro1");
	}
}
//all methods of interface has been implemented, So need not to make class as abstract
class InterImp2 extends InterImp1{
	public void m2(){
		System.out.println("m1 Overriden in InterImp2");
	}
}
class InterImp3{
	public static void main(String []k){
		System.out.println("Interface Implimemtation");
		System.out.println("=======================================");
		System.out.println("======== Direct Object Creation =======");
		InterImp2 a = new InterImp2();
		a.m1();		
		a.m2();
		System.out.println("=======================================");
		//InterImp1 a1 = new InterImp1();  //InterImp1 cant create object becasue it is a abstract class
		System.out.println("======== InDirect Object Creation =======");
		InterImp1 a2 = new InterImp2();
		a2.m1();
		a2.m2();
		System.out.println("=======================================");
		System.out.println("======== InDirect Object Creation =======");
		InterImp a3 = new InterImp2();
		a3.m1();
		a3.m2();
	}
}