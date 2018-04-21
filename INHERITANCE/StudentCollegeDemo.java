import java.util.*;
class StudentInhe{
	Scanner sn =  new  Scanner(System.in);
	int rollNum;
	String name;
	String addr;
	void setStudentData(){
		System.out.println("Enter Studeent Name");
		name = sn.nextLine();
		System.out.println("Enter Studeent Address");
		addr = sn.nextLine();
		System.out.println("Enter Student rollNumber");
		rollNum = Integer.parseInt(sn.nextLine());
	}
	void getStudentData(){
		System.out.println("Student Name: "+name);
		System.out.println("Student rollNumber: "+rollNum);
		System.out.println("Student Address: "+addr);
	}
}

class CollegeInhe extends StudentInhe{
	String cName;
	String cAddr;
	void setCollegeData(){
		System.out.println("Enter Collage Name");
		cName = sn.nextLine();
		System.out.println("Enter Collage Address");
		cAddr = sn.nextLine();
	}
	void getCollegeData(){
		System.out.println("Collage Name: "+cName);
		System.out.println("Collage Address: "+cAddr);
	}
}

class  StudentCollegeDemo{
	public static void main(String[] args){
		System.out.println("-----Inheritance concept with Student Information--");
		CollegeInhe ci = new CollegeInhe();
		ci.setStudentData();
		ci.setCollegeData();
		System.out.println("=================Information");
		ci.getStudentData();
		ci.getCollegeData();
	}
}
