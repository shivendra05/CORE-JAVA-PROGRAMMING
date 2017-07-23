import java.io.*;
import java.util.Scanner;
import sp.SerialStudent;

class SerialRead{

	public static void main(String []k){

		SerialStudent ss = new SerialStudent();
	try{

		System.out.println("--------------------------------------------------");
		System.out.println("-----------Serialization File Rading started--------");
		//Step1 Open file in Write mode.
		FileInputStream fis = new FileInputStream("Serial.txt");

		//Step2 Create an Serilazable Object to trnsfer all data at once.
		ObjectInputStream ois  = new ObjectInputStream(fis);
		//Step3 Object conversion.
			Object obj = ois.readObject();
			ss = (SerialStudent)obj;

		//Step4 Access data.
		System.out.println("Studet Number: "+ss.getNum());
		System.out.println("Studet Name: "+ss.getName());
		System.out.println("Studet Marks: "+ss.getMarks());
		
		//Step5 Close files.
		ois.close();
		fis.close();
		System.out.println("-------- Serialization File Reading completed------");

	}catch(FileNotFoundException fne){
	
		System.out.println("File desnt exist");
	}catch(IOException ioe){
	
		System.out.println("File is currepted");
	}catch(Exception e){

		System.out.println(e);
	}
	}
}