class TryDivisionCMD{
	public static void main(String[] k){
		try{
				int a = Integer.parseInt(k[0]);
				int b = Integer.parseInt(k[1]);
				int x= a/b;
		System.out.println("Division of two numners is: "+x);
		}catch(ArithmeticException ae){
			System.out.println("Dont enter Zero as denominator: "+ae);
		}catch(NumberFormatException ae){
			System.out.println("Dont enter Non-Integer Digits "+ae);
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Dont enter More or less then 2 numbers "+ae);
		}finally{
			System.out.println("I am from finally block");
		}		
	}
}