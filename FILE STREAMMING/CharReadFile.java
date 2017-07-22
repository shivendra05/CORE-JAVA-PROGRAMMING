/* This Program will show File Streaming Read opration for Character Stramming*/

import java.io.*;
class CharReadFile{
	public static void main(String[] args) 
	{
		try{
			System.out.println("File Streamming Program");
			System.out.println("=====================================");
	//Step 1:- Open file in read mode
			FileReader fr = new FileReader("ram.txt");
			System.out.println("--Reading data on File Started--");
	//Step 2:- read data on file
			int x;

			while((x=fr.read())!=-1){
				System.out.println(x);
			}
	//Step 3:- close the file
			fr.close();
			System.out.println("--Reading data on File Completed--");
		}catch(FileNotFoundException ioe){

			System.out.println("File doesnt exist");
		}catch(IOException ioe){

			System.out.println("Input file is currupted file");
		}catch(Exception e){

			System.out.println(e);
		}
 	}
}