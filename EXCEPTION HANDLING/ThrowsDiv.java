package excthows;
class ThrowsDiv{
	public void div(String a, String b)  throws ArithmeticException, NumberFormatException{
		int x= Integer.parseInt(a);
		int y= Integer.parseInt(b);

		int  z= x/y;
		System.out.println("Division is : "+z);
	}
}
