package excep;
import excep.ThrowDiv;
class ThrowDivMain{
	public static void main(String[] k){
		try{
			ThrowDiv td = new ThrowDiv();
			String x = k[0];
			String y = k[1];
			td.div(x,y);
		}catch(ArithmeticException ae){
			System.out.println("Dont enter Zero as denominator: "+ae);
		}catch(NumberFormatException ae){
			System.out.println("Dont enter Non-Integer Digits "+ae);
		}finally{
			System.out.println("I am from finally block");
		}
	}
}