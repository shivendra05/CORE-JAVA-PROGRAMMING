 /*
 This Program will demonstrat craation of abjec of abstract class
 and using diect object or indiet object/Dynemic oject.
   */
abstract class AbsExProgram 
{
	int a=10;

	abstract void m1();

	abstract void m2();

	void m3(){
		System.out.println("Hi I am m3");
	}

	void m4(){	
	}
}

abstract class AbsExProgram1 extends AbsExProgram{

	// We are not defining m1(), So AbsDemo2 class is started with abstact
	void m2(){
		System.out.println("Hi m2 Overriden in AbsExProgram1");
	}

	void m4(){
		
	}
}

class AbsExProgram2 extends AbsExProgram1{
	//All methods all defined, So we should not use abstract keyword.

	void m1(){
		System.out.println("Hi m1 Overriden in AbsExProgram2");
	}

	void m4(){
		System.out.println("Hi m4 Overriden in AbsExProgram2");
	}
}

class AbsExProgramMain {
	public static void main(String[] args) 
	{
		System.out.println("Hello this is Abstration program demonstration");	
		// AbsExProgram1 is an abstract class, So cant be instantiated(can not create object of the abstact class)
		
		//AbsExProgram1 abs = new AbsExProgram1();  //Invalid
		System.out.println("================= Direct Obect Creation=============================");
		AbsExProgram2 abs1 = new AbsExProgram2();
		abs1.m1();			//Valid
		abs1.m2();			//Valid
		abs1.m3();			//Valid
		abs1.m4();			//Valid
		System.out.println("================================================");

		System.out.println("================= InDirect Obect Creation==============================");
		AbsExProgram1 abs2 = new AbsExProgram2();
		abs2.m1();			//Valid
		abs2.m2();			//Valid
		abs2.m3();			//Valid
		abs2.m4();			//Valid
		System.out.println("================================================");

		System.out.println("================= InDirect Obect Creation==============================");
		AbsExProgram abs3 = new AbsExProgram2();
		abs3.m1();
		abs3.m2();
		abs3.m3();
		abs3.m4();
		System.out.println("================================================");
	}
}
 /*
  Creating object of Abstact is nothing but accssing a method that hasnt have body.
  So its not recomentded by the Java environmant. Thats why its not allowed to create object of 
  Abstact class.
*/