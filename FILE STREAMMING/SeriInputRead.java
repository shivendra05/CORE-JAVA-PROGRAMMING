package stud;
import java.io.*;
import stud.SeriStudent;
import java.util.*;
class SeriInputRead{
	void readWrite(){
		System.out.println("Enter Student data");
		SeriStudent ssi = new SeriStudent();
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try{
			fis = new FileInputStream("D:\\Java Programming\\Input Files Data\\SerialzedData.txt");
			ois = new ObjectInputStream(fis);
			Object oo =ois.readObject();
			ssi = (SeriStudent)oo;

			System.out.println("Studetn Id:  "+ssi.getId());
			System.out.println("Studetn Name:  "+ssi.getName());
			System.out.println("Studetn Marks:  "+ssi.getMarks());
		}catch(FileNotFoundException fnf){
			fnf.printStackTrace();
		}catch(IOException io){
			System.out.println(io.getMessage());
		}catch(Exception e){
			System.out.println("Exception:  "+e);
		}
		finally{
			try{
				fis.close();
				ois.close();
				System.out.println("Closed File SuccessFully");
			}catch(Exception e){
				System.out.println("Unable to close File:  "+e);
			}
		}
	}
}
