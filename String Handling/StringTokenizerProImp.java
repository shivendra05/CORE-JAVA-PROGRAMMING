/*StringTokenizer is used to divide a string into tokens/words
Constructor of StringTokenizer-
1.StringTokenize(String,String)
2.StringTokenize(String)
Some of the Methods Belongs to StringBuffer/StringBuilder
1.countTokens()
2.hasMoreTokens()
3.nextToken()
for more Methods use javap java.util.StringTokenizer
*/
import java.util.*;
class StringTokenizerProImp{
	public static void main(String []k){
		StringTokenizer str1 = new StringTokenizer("  Shivendra Pandey  ");
		StringTokenizer str2 = new StringTokenizer("@Shivendra@Kumar@Pandey@Java@Programmer","@");
		while(str1.hasMoreTokens()){
			String nStr = str1.nextToken();
			System.out.println(nStr);
		}
		Sy
		while(str2.hasMoreTokens()){
			String nStr = str2.nextToken();
			System.out.println(nStr);
		}
	}
}