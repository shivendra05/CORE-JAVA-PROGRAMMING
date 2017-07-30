/*
ststic block, Static blocks are meant to innilize static variable values
	java 7 wont allow to initilize non static/ instance varibales in static block.

			if we declare and initilize the static variable and dont write programmer static block
	in that case Java compiler will provide, static block.

So, Below class will contain two methods,
	1. Defaulr construtor 
	2. static block.

*/
class StaticBlock 
{	
	float f;
	static int i;
	static String str;

	static{
		//f=12.4f; we cant initilized non static variable in static bloack
		i=10;
		str="Hi";
	}
}