package excep;
class ThrowDiv{
	public void div(String a, String b) {
		int x= Integer.parseInt(a);
		int y= Integer.parseInt(b);
		if(y==0){
			ArithmeticException ae = new ArithmeticException();
			throw(ae);
		}else{
			int  z= x/y;
			System.out.println("Division is : "+z);
		}	
	}
}
