package com.practice.file;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_Class {

	/*1. File
	 *2. FileWriter
	 *3. FileReader -- we can read data character by character which is not convenient to programmer
	 *4. BufferedWriter
	 *5. BufferedReader
	 *6. PrintWriter
	 */
	public static void main(String[] args) throws IOException {
		/*uses of FileReader and FileWrite isnt recommended, which need to insert \n(line change) manually
		 * by using fileReader we can read data Only character, which is not convenient to the the programmer.
		 * So BufferWriter and BufferedReader is preferred.
		 * 
		 * we use FileReader to read the file data.
		 * 
		 * constructors::
		 * FileReader reader = new FileReader(String fName);
		 * FileReader reader = new FileReader(File file);
		 * 
		 * methods::
		 * int read() //returns unicode value. read file unless get -1
		 * int read(char[])
		 * close()
		 */
		
		FileReader reader = new FileReader("fileWirter.txt");
		int i= reader.read();
		while(i!=-1) {
			System.out.print((char)i);
			i = reader.read();
		}
	}
}