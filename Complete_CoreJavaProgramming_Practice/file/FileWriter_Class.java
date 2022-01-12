package com.practice.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Class {

	/*1. File
	 *2. FileWriter
	 *3. FileReader
	 *4. BufferedWriter
	 *5. BufferedReader
	 *6. PrintWriter
	 */
	public static void main(String[] args) throws IOException{
		/*
		 * we can use file writer to write character data on file
		 * 
		 * constructor::
		 * FileWrite write= new FileWriter(String file); //overrides old data with new, by-default append=false
		 * FileWriter write = new FileWriter(File file); //overrides old data with new, by-default append=false
		 * 
		 * FileWriter write = new FileWriter(String file, boolean append); //overrides old data with new
		 * FileWriter write = new FileWriter(File file,boolean append); //overrides old data with new
		 * 
		 *  with FileWrite, if file isnt available then it will be created by the constructors
		 * 
		 *   write(int ch) -- to write a single character
		 *   write(char[] ch) -- to write a Array of character
		 *   write(String str) -- to write String
		 *   flush() -- to give the guarantee that total data including last char will be written to the file.
		 *   close()
		 *   
		 *    main problem FileWrite is to insert line separator(\n) manually which varries from system to system.
		 *    its difficulty to programmer.
		 *    
		 *    it is solved form BufferedWriter and PrintWriter
		 */
		//FileWriter write = new FileWriter("fileWirter.txt");//overrides old with new data.
		FileWriter write = new FileWriter("fileWirter.txt",true);//doesnt allow overriding data. when append is true
		write.write(100);
		write.write(new char[]{'a','b','c'});
		write.write("Hello, How are you.");
		write.flush();
		write.write("\n");
		write.close();
	}
}