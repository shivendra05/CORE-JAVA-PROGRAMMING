/*String and StringBuffer both are same except
1. String is immutable while StringBuffer is mutable
2. String by-default create 0 memory while StringBuffer create 16 character memory space in advance.
3. String object can be created either with new or without new operator while StringBuffer only can be created with new operator
Constructor of String-
1.String()
2.String(String)
3.String(char[])
4.String(StringBuilder)
5.String(String)
6.String(StringBuffer)
Some of the Methods Belongs to StringBuffer/StringBuilder
1.trim()
2.substring(int)
3.substring(int,int)
4.split()
5.toUpperCase()/toLowerCase()
6. all Methods of StringBuffer class After converting to String Class
for more Methods use javap java.lang.String
*/
class StringPro{
	String str1 = "Shivendra";
	String str2 = "Shivendra";
	String str3 = new String("Shivendra Pandey");
	String str4 = new String("Shivendra Pandey");

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
		if(str3.hashCode() == str4.hashCode()){
		//if(str3 == str4){
			System.out.println("str1:  "+str3);
			System.out.println("str2:  "+str4);
			System.out.println("References are same");
		}else{
			System.out.println("str1:  "+str3);
			System.out.println("str2:  "+str4);
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
		if(str3.equals(str4)){
			System.out.println("str1:  "+str3);
			System.out.println("str2:  "+str4);
			System.out.println("String are same");
		}else{
			System.out.println("str1:  "+str3);
			System.out.println("str2:  "+str4);
			System.out.println("String are NOT same");
		}

		System.out.println("\n=====================toLowerCase()/toUpperCase()====================");
		if(str1.toUpperCase().equals(str2.toUpperCase())){
			System.out.println("str1:  "+str1.toUpperCase());
			System.out.println("str2:  "+str2.toUpperCase());
			System.out.println("String are same");
		}else{
			System.out.println("str1:  "+str1.toUpperCase());
			System.out.println("str2:  "+str2.toUpperCase());
			System.out.println("String are NOT same");
		}
		System.out.println("\n=====================trim/subString()====================");
		String str5 = "     Shivendra     ";
		String str6 = new String("Shivendra Pandey");
		System.out.println("str1:  "+str5);
			System.out.println("str1:  "+str5.trim());
			System.out.println("str2:  "+str6.substring(3));
			System.out.println("str2:  "+str6.substring(3,7));
	}
}
class StringProImp{
	public static void main(String []k){
		StringPro sp = new StringPro();
		sp.show();
	}
}