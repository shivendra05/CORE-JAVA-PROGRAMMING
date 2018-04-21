package stud;
import java.io.*;
import stud.SeriStudent;
import java.util.*;
class SeriiOutputWrite{
	Scanner sn = new Scanner(System.in);
	void readWrite(){
		System.out.println("Enter Student data");
		SeriStudent ss = new SeriStudent();
		System.out.println("Enter Student ID");
		int id = Integer.parseInt(sn.nextLine());
		System.out.println("Enter Student Name");
		String name = sn.nextLine();
		System.out.println("Enter Student Marks");
		double marks = Double.parseDouble(sn.nextLine());
		ss.setId(id);
		ss.setName(name);
		ss.setMarks(marks);
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try{
			fos = new FileOutputStream("D:\\Java Programming\\Input Files Data\\SerialzedData.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(ss);
		}catch(FileNotFoundException fnf){
			fnf.printStackTrace();
		}catch(IOException io){
			System.out.println(io.getMessage());
		}catch(Exception e){
			System.out.println("Exception:  "+e);
		}
		finally{
			try{
				fos.close();
				oos.close();
				System.out.println("Closed File SuccessFully");
			}catch(Exception e){
				System.out.println("Unable to close File:  "+e);
			}
		}
	}
}
