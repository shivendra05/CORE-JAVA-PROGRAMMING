/* This Program will show File Streaming read opration for Byte Stramming*/

import java.io.*;
class ByteFileRead 
{
	public static void main(String[] args) 
	{
		System.out.println("File Streamming Program");
		System.out.println("=====================================");
		try{	
	//Step 1- open file in Read Mode
		FileInputStream fis = new FileInputStream("shiv.txt");
	//Step 2- Read data on file
	System.out.println("--Reading data from the File Started--");
		int x;
		while((x=fis.read())!=-1){
			System.out.println(x);
		}
	//Step 3- close the file
		fis.close();
		System.out.println("--Reading data from the File Completed--");

		}catch(FileNotFoundException fne){

			System.out.println("File doesnt exist");
		}catch(IOException ioe){

			System.out.println("Input file is currupted file");
		}catch(Exception e){

			System.out.println(e);
		}
	}
}