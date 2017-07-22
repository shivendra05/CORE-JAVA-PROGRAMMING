/*interface and its Implimentation to show the veriable and methods, Accessbility*/

interface InterPro{
	int a=10;
	final int c=20;
	int b=20;
	//Even method is implicitly abstract we can explicitly write abstract
	abstract void m1();
	void m2();
}

//If an Implimentation class doesnt implelemt all methods of interface then class must be abstract
abstract class InterPro1 implements InterPro{
	//As we know All interface veribals are final, So we cant re-Assign any values.
	public void m1(){
		//a=20; ---Invalid
		System.out.println("m1 Overriden in InterPro1");
	}
}