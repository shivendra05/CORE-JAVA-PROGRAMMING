/* Reading data from one file and Wrting data into another file */

import java.io.*;
class  ReadWriteByteFile
{
	public static void main(String[] args) 
	{

		System.out.println("File Streamming Program");
		System.out.println("=====================================");
		try{	
	//Step 1- open file in Read Mode
		FileInputStream fis = new FileInputStream("shiv.txt");
		FileOutputStream fos = new FileOutputStream("newShiv.txt");

	//Step 2- Read data on file
		System.out.println("--Reading and Writing data from  and to File Started--");
		int x;
		while((x=fis.read())!=-1){

			fos.write(x);
		}

		System.out.println("--Reading and Writing data from  and to File Completed--");

		System.out.println("--Reading newfile data on File Started--");
		FileInputStream fis1 = new FileInputStream("newShiv.txt");
		int y; 
		while((y=fis1.read())!=-1){

			System.out.println(y);
		}
	//Step 3- close the file
		fos.close();
		fis.close();

		System.out.println("--Reading data on File Completed--");

		}catch(FileNotFoundException fne){

			System.out.println("File doesnt exist");
		}catch(IOException ioe){

			System.out.println("Input file is currupted file");
		}catch(Exception e){

			System.out.println(e);
		}
	}
}