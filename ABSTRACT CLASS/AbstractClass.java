//programe to calculate area of circle and rectangle
/*Abstract Method cant be final, static and private.
It should be always a instance Method
*/
abstract class  AreaOperations{
	abstract void area();
}

class  Circle extends AreaOperations{
	double r= 2.3,a;
	public void area(){
		a = 2.14*r*r;
		System.out.println("Area of Circle is: "+a);
	}
}

class Rectangles extends AreaOperations{
	int length = 3,width = 4,a;
	void area(){
		a=length*width;
		System.out.println("Area of Rectangle is: "+a);
	}
}

class  AbstractClass
{
	public static void main(String[] args) 
	{
		System.out.println("------Hello this is a abstract class demo -----");
		System.out.println("Area of Circle is:---");
		AreaOperations op = new Circle();
		op.area();
		System.out.println("Area of Rectangle is:---");
		op = new Rectangles();
		op.area();
	}
}
