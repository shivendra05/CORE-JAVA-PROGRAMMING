/* This Program will show File Streaming write opration for Byte Stramming*/

import java.io.*;
class  ByteFileWrite
{
	public static void main(String[] args) 
	{
		System.out.println("File Streamming Program");
		System.out.println("=====================================");
		try{

			/* FileOutputStream("shiv.txt",true) constructor will append data on the file.
		While FileOutputStream("shiv.txt",flase) will Override the data (by default).	
			*/

	//Step 1- open file in Write Mode
		FileOutputStream fos = new FileOutputStream("shiv.txt",false); //will override data 
	//Step 2- Write data on file
		System.out.println("--Writing data on File Started--");
		for(int i=0;i<=10;i++){
			fos.write(i);
		}
	//Step 3- close the file
		fos.close();
		System.out.println("--Writing data on File Completed--");

		}catch(IOException ioe){

			System.out.println("Input file is currupted file");
		}catch(Exception e){

			System.out.println(e);
		}
	}
}
