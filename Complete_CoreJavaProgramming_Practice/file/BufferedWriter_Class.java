package com.practice.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_Class {

	/*1. File
	 *2. FileWriter
	 *3. FileReader
	 *4. BufferedWriter
	 *5. BufferedReader
	 *6. PrintWriter
	 */
	public static void main(String[] args) throws IOException{
		/*we can use file writer to write character data on file
		 * 
		 * constructor::
		 * BufferedWriter write= new BufferedWriter(Writer w);
		 * BufferedWriter write= new BufferedWriter(Writer w,int bufferSize);
		 * 
		 * BufferedWriter cant communicate directly with File/String(file Name), it can communicate with some
		 * Writer object.
		 */
		FileWriter fWriter = new FileWriter("BFWriter");
		//BufferedWriter bfWriter = new BufferedWriter(fWriter);
		BufferedWriter bfWriter = new BufferedWriter(fWriter,20);
		bfWriter.write(97);
		bfWriter.write('h');
		bfWriter.write("Hello, How are you.?");
		bfWriter.newLine();
		bfWriter.write(new char[] {'a','b','c','d'});
		bfWriter.flush();
		bfWriter.close();
	}
}