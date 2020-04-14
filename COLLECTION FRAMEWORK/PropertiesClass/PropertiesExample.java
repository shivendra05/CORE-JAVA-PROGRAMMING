package PropertiesClass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
//Properties is a child of HashTable
//Stores all values as a String
		FileInputStream file = new FileInputStream(new File("src\\UserDetails.properties"));
		Properties prop = new Properties();
		prop.load(file);
		String name = prop.getProperty("name");
		String age = prop.getProperty("age");
		prop.setProperty("sirName", "pandey");
		String sirName = prop.getProperty("sirName");
		System.out.println("-----------details----");
		System.out.println(name+"---"+age+"---"+sirName);
	}
}