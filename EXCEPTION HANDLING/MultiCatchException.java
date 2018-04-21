class MultiCatchException{
	public static void main(String[] k){
		try{
			int x = Integer.parseInt(k[0]);
			int y = Integer.parseInt(k[1]);
			int z = x/y;

		}catch(ArithmeticException|NumberFormatException|ArrayIndexOutOfBoundsException ae){
			System.out.println("Dont enter Zero as denominator: "+ae);
			System.out.println("Dont enter More than two numbers: "+ae);
			System.out.println("Dont enter Characters/String: "+ae);
		}
		finally{
			System.out.println("I am from finally block");
		}
	}
}