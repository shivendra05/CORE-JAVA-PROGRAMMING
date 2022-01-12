package com.practice.file;

import java.io.File;
import java.io.IOException;

public class File_Class {

	/*1. File
	 *2. FileWriter
	 *3. FileReader
	 *4. BufferedWriter
	 *5. BufferedReader
	 *6. PrintWriter
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("abc.txt");
		/* above line wont create any physical file, first it checks whether any file named abc.txt is available or not.
		 * if available simply refers that file, if its not available then we are just creating java file object to represent
		 * the name abc.txt
		 */
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		/*we can use java file object, to represent directory also.
		 */
		file.mkdir();
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		/*File class constructors.
		 * 
		 * File file= new File(String fName);
		 * File file= new File(String subDir, String fName);
		 * File file= new File(File SubDir, String fName);
		 */
		File fileNew = new File("C:\\Users\\shivendra.pandey\\eclipse-workspace\\1_DataTpesAndLiterals\\src\\com\\practice");
		String [] files = fileNew.list();
		int count=0;
		System.out.println("**********List of Files*************");
		for (String fi : files) {
			count++;
			System.out.println(fi);
		}

		System.out.println("Files inside folder:: "+count);
	}
}