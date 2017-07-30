/*
Relationships Betwween classes,
	1- IS-A 
			This relation we can achive with extends keyword.(by default inheritance provides this relationship)
	2-HAS-A 
			Creating an object of a class into another class, is called HAS-A relationship.
Here we have achived through Scanner sn = new Scanner(System.in),
		We have declaed object in one class and and using sn object in other classes.
	3-USES-A,
			creating an object in side method.(will see separatly)
*/ 
import java.util.Scanner;
class University 
{
	Scanner sn = new Scanner(System.in);// HAS-A relationship will be for other classes
	String uName,uLocation;;
	void setUniDetails(){
		System.out.println("Enter University name");
		uName = sn.nextLine();
		System.out.println("Enter University Location");
		uLocation = sn.nextLine();
	}

	void getUniDetails(){
		System.out.println("\n	UNIVERSITY DETAILS	\n");
		System.out.println("------------------------------");
		System.out.println("Student University name:	"+uName);
		System.out.println("Student University Location:	"+uLocation);
		System.out.println("------------------------------");
	}
}
class College extends University // IS-A relationship
{	
	String cName,cLocation;;
	void setClgDetails(){
		//Scanner sn = new Scanner(System.in);
		System.out.println("Enter College name");
		cName = sn.nextLine(); // HAS-A relationship
		System.out.println("Enter College Location");
		cLocation = sn.nextLine(); // HAS-A relationship
	}

	void getClgDetails(){
		System.out.println("\n	COLLEGE DETAILS	\n");
		System.out.println("------------------------------");
		System.out.println("Student College name:	"+cName);
		System.out.println("Student College Location:	"+cLocation);
		System.out.println("------------------------------");
	}
}
class Student extends College // IS-A relationship
{	
	String sName,sCourse;
	int sRollNumber;
	void setStuDetails(){
		//Scanner sn = new Scanner(System.in);
		System.out.println("Enter Student name");
		sName = sn.nextLine(); // HAS-A relationship
		System.out.println("Enter Student Course Name");
		sCourse = sn.nextLine(); // HAS-A relationship
		System.out.println("Enter Student RollName");
		sRollNumber = Integer.parseInt(sn.nextLine());
	}
	void getStuDetails(){
		System.out.println("\n	STUDENT DETAILS	\n");
		System.out.println("------------------------------");
		System.out.println("Student  RollNumber:	"+sRollNumber);
		System.out.println("Student name:	"+sName);
		System.out.println("Student  Course:	"+sCourse);
		System.out.println("------------------------------");
	}
}
class UCSMain
{
	public static void main(String []k){
		Student s= new Student();
		s.setStuDetails();
		s.getStuDetails();
		s.setClgDetails();
		s.getClgDetails();
		s.setUniDetails();
		s.getUniDetails();
	}
}