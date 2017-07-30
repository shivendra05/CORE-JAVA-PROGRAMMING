/*
Instance block, Instance blocks are meant to initilize Instance variable values
	though we can initilize static varibales also in static block.
*/
class InstanceBlock 
{	
	float f;
	static int i;
	static String str;

//Instance block
	{
		f=12.4f;
		i=10;
		str="Hi";
	}
}