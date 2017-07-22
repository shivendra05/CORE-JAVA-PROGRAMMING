/* This Program will show File Streaming write opration for Character Stramming*/
import java.io.*;
class CharWrtieFile{
	public static void main(String[] args) 
	{
		try{
			System.out.println("File Streamming Program");
			System.out.println("=====================================");
	//Step 1:- Open file in Write mode
			FileWriter fw = new FileWriter("ram.txt");
			System.out.println("--Writing data on File Started--");
	//Step 2:- Write data on file
			for(int i=0;i<10;i++){
				fw.write(i);
			}
	//Step 3:- close the file
			fw.close();
			System.out.println("--Writing data on File Completed--");
			}catch(IOException ioe){

				System.out.println("Input file is currupted file");
			}catch(Exception e){

				System.out.println(e);
			}
 	}
}