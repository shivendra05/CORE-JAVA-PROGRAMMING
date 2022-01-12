package com.practice.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_Class {

	/*1. File
	 *2. FileWriter
	 *3. FileReader
	 *4. BufferedWriter
	 *5. BufferedReader
	 *6. PrintWriter
	 */
	public static void main(String[] args) throws IOException{
		/* PrintWriter is a most enhanced writer to write charData to the file.
		 * 
		 * the main advantage of PrintWriter over FileWriter and BufferedWriter is it can write any type of primitive data
		 * directly to file.
		 * 
		 * PrintWriter  pWriter = new PrintWriter(String fName);
		 * PrintWriter  pWriter = new PrintWriter(File fName);
		 * PrintWriter  pWriter = new PrintWriter(Writer fName);
		 */

		//PrintWriter pWriter = new PrintWriter("PWriter");
		FileWriter fWriter = new FileWriter("PWriter");
		PrintWriter pWriter = new PrintWriter(fWriter);

		pWriter.print(100);
		pWriter.print('c');
		pWriter.print(100.454);
		pWriter.print("How are you?");

		pWriter.println(new char[] {'a','e','i','o','u'});
		pWriter.print("How About your Family?");

		pWriter.close();
		pWriter.close();
	}
}