package com.practice.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReader_Class {

	/*
	 *1. File
	 *2. FileWriter
	 *3. FileReader
	 *4. BufferedWriter
	 *5. BufferedReader
	 *6. PrintWriter
	 */
	public static void main(String[] args) throws IOException{
		/* we can use BufferedReader to read the file line by line in addition to char by char
		 * 
		 * constructor::
		 * BufferedReader write= new BufferedReader(Reader w);
		 * BufferedReader write= new BufferedReader(Reader w,int bufferSize);
		 * 
		 * int read()
		 * int read(char[] ch)
		 * void close()
		 * String readLine() -- read data line by line unless get null.
		 */
		FileReader fReader = new FileReader("BFWriter");
		BufferedReader bfReader = new BufferedReader(fReader);
		String line = bfReader.readLine();
		while(line!=null){
			System.out.println(line);
			line = bfReader.readLine();
		};
	}
}