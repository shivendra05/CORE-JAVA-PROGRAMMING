import java.util.*;
import java.io.*;
class PropertiesEx{
	public static void main(String[] args){
		System.out.println("==========Hashtable Example");
		try{
			FileInputStream fis = new FileInputStream("D:\\Java Programming\\Collection Framework\\Property.prop");
			Properties p = new Properties();
			p.load(fis);
			System.out.println("value : "+p.getProperty("name"));
			System.out.println("value : "+p.getProperty("sirName"));
			System.out.println("value : "+p.getProperty("middleName"));
		}catch(FileNotFoundException fno){
			System.out.println(" Input file not found"+fno);
		}catch(IOException io){
			System.out.println(io.getMessage());
		}
	
	}
}
