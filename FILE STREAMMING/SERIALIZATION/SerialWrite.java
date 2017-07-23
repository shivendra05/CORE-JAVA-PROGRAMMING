import java.io.*;
import java.util.Scanner;
import sp.SerialStudent;

class SerialWrite{

	public static void main(String []k){

		SerialStudent ss = new SerialStudent();
	try{
		System.out.println("Please enter Student details");
		Scanner sn = new Scanner(System.in);

		System.out.println("Enter Student RollNumber: ");
		int srollNumber = Integer.parseInt(sn.nextLine());

		System.out.println("Enter Student Name: ");
		String sName = sn.nextLine();

		System.out.println("Enter Student Marks: ");
		float sMarks = Float.parseFloat(sn.nextLine());

		ss.setNum(srollNumber);
		ss.setName(sName);
		ss.setMarks(sMarks);
		
		System.out.println("--------------------------------------------------");
		System.out.printf("-----------Serialization is started--------");
		//Step1 Open file in Write mode.
		FileOutputStream fos = new FileOutputStream("Serial.txt");
		
		//Step2 Create an Serilazable Object to trnsfer all data at once.
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(ss);
		oos.close();
        fos.close();
        System.out.println("Serialized data is saved");
		 
	}catch(IOException ioe){
	
		System.out.println("File is currepted--Unable to write a file");
	}catch(Exception e){

		System.out.println(e);
	}
	}
}