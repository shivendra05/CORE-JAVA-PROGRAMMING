interface AnoInnerClass{
	void draw();
}

class  AnoInnerClassMain
{
	public static void main(String[] args) 
	{
		AnoInnerClass aic = new AnoInnerClass(){
			public void draw(){
				System.out.println("Draw a Circle");
			}
		};aic.draw();
	}
}
