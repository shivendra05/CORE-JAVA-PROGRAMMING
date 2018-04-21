/*StringBuffer and StringBuilder both are same except
1. StringBuffer is avaliable from java 1.0v while StringBuilder is avavilable from 1.5v
2. StringBuffer is Thread Safe while StringBuilder is not Thread Safe.
3. StringBuffer is Syncronized while StringBuilder is non-Synchronized
Constructor of StringBuffer-
1. StringBuffer()
2.StringBuffer(String)
3.StringBuffer(char[])
4.StringBuffer(StringBuilder)
5.StringBuffer(StringBuffer)
Some of the Methods Belongs to StringBuffer/StringBuilder
1.reverse()
2.append()
3.replace()
4.capacity()
5.length()
6. all Methods of String class After converting to String Class
for more Methods use javap java.lang.StringBuffer
*/
class StringBufferPro{
	StringBuffer str1 = new StringBuffer("  Kumar  ");
	StringBuffer str2 = new StringBuffer("  Shivendra Pandey  ");
	StringBuffer str3 = new StringBuffer("  Java Programmer  ");
	StringBuffer str4 = new StringBuffer("  Developer  ");
	public void show(){
		System.out.println("str1:  "+str1);
		System.out.println("str2:  "+str2);
		System.out.println("str3:  "+str3);
		System.out.println("str4:  "+str4);

		System.out.println("\n=====================hashCode()====================");
		if(str1.hashCode() == str2.hashCode()){
			System.out.println("str1:  "+str1);
			System.out.println("str2:  "+str2);
			System.out.println("References are same");
		}else{
			System.out.println("str1:  "+str1);
			System.out.println("str2:  "+str2);
			System.out.println("References are NOT same");
		}
		System.out.println("\n=====================equals()====================");
		if(str1.equals(str2)){
			System.out.println("str1:  "+str1);
			System.out.println("str2:  "+str2);
			System.out.println("String are same");
		}else{
			System.out.println("str1:  "+str1);
			System.out.println("str2:  "+str2);
			System.out.println("String are NOT same");
		}
		System.out.println("\n=====================toLowerCase()/toUpperCase()====================");
			System.out.println("str1:  "+str1.capacity());
			System.out.println("str2:  "+str1.length());
			System.out.println("str1:  "+str1.reverse());
			System.out.println("str2:  "+str3.append(str4));
			StringBuffer str5 = str2.insert(11,str1.reverse());
			System.out.println("str2:  "+str5.insert(str5.length()," is "));
			System.out.println("str2:  "+str5.replace(str1.length()+1, str1.length()+3," DON "));

		System.out.println("\n=====================trim/subString()====================");
		String str6 = "     Shivendra     ";
		String str7 = new String("Shivendra Pandey");
			System.out.println("str1:  "+str6.trim());
			System.out.println("str2:  "+str5.substring(3));
			System.out.println("str2:  "+str5.substring(3,7));
	}
}
class StringBufferProImp{
	public static void main(String []k){
		StringBufferPro sp = new StringBufferPro();
		sp.show();
	}
}