package excthows;
import excthows.ThrowsDiv;
class ThrowsDivMain{
	public static void main(String[] k) {
		ThrowsDiv tds = new ThrowsDiv();
		try{
			String x = k[0];
			String y = k[1];
			tds.div(x,y);
		}catch(ArithmeticException ae){
			System.out.println("Dont enter Zero as denominator: "+ae);
		}catch(NumberFormatException ae){
			System.out.println("Dont enter Non-Integer Digits "+ae);
		}finally{
			System.out.println("I am from finally block");
		}
	}
}