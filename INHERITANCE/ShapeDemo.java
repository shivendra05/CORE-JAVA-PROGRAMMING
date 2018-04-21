class CirleShape{
	void draw(){
		System.out.println("Draw a Cirlce");
	}
}
class RectangleShape extends CirleShape{
	void draw(){
		super.draw();
		System.out.println("Draw a Rectnagle");
	}
}

class Squar extends RectangleShape{
	void draw(){
		super.draw();
		System.out.println("Draw a Squar");
	}
}

class  ShapeDemo{
	public static void main(String[] args){
		System.out.println("Mehtod Ovwerriding Using super Keyword");
		Squar dc = new Squar();
		dc.draw();
	}
}
