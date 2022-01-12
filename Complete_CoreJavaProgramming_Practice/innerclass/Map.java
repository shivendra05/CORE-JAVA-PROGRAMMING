package com.practice.innerclass;

//Case3
public interface Map {

	public void m1();
	/*
	 * we can declare interface inside interface, Map is group of key-value pair and each key-value pair is called as Entry
	 * without existing Map object there is no chance of existing Entry object.
	 * 
	 * Hence interface Entry is defined inside Map interface
	 * */
	interface Entry{
		public void m2();
	}
}
//No need to implement inner interface methods (depends what we implement)
class Test1 implements Map{
	@Override
	public void m1() {
		System.out.println("Test1:: Outer Interface");		
	}

}
//No need to implement outer interface methods(depends what we implement)
class Test2 implements Map.Entry{
	@Override
	public void m2() {
		System.out.println("Test2:: Inner Interface");		
	}

}
//need to implement inner/outer both interface methods(depends what we implement)
class Test3 implements Map,Map.Entry{
	@Override
	public void m2() {
		System.out.println("Test3 :: Outer Interface");		
	}

	@Override
	public void m1() {
		System.out.println("Test3 :: Inner Interface");		
		
	}
}

class Test{
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.m1();
		
		Test2 t2 = new Test2();
		t2.m2();
		
		
		Test3 t3 = new Test3();
		t3.m1();
		t3.m2();
	}
}