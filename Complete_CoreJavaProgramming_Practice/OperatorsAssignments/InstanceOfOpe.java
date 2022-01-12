package com.practice.OperatorsAssignments;

import java.util.*;


public class InstanceOfOpe {
	public static void main(String[] args) {

		Student stud1 = new Student("shiv", 31, 100);
		Student stud2 = new Student("shivam", 21, 101);
		Student stud3 = new Student("shivendra", 22, 102);

		Customer cust1 = new Customer("Ram", 32, 101);
		Customer cust2 = new Customer("Raven", 33, 102);
		Customer cust3 = new Customer("Ravendra", 34, 103);

		List list = new ArrayList();
		list.add(stud1);
		list.add(stud2);
		list.add(stud3);

		list.add(cust1);
		list.add(cust2);
		list.add(cust3);


		Object obj = list.get(0);

		if(obj instanceof Student) {
			Student s=(Student)obj;
			System.out.println(s);
		}

		obj = list.get(3);

		if(obj instanceof Customer) {
			Customer cust= (Customer)obj;
			System.out.println(cust);
		}
		
		//intanceof operator used only when there is relation b/w reference and Class/Interface(same type, child to parent or parent to child)
		Thread t= new Thread();
		
		System.out.println(t instanceof Thread);
		System.out.println(t instanceof Object);
		System.out.println(t instanceof Runnable);
		//System.out.println(t instanceof String); //Thread referenace 't' and String have no relation 
		//System.out.println( instanceof Runnable);
		
	}
}

class Student {
	String sName;
	int sAge;
	int sRollNo;
	public Student(String sName, int sAge, int sRollNo) {
		super();
		this.sName = sName;
		this.sAge = sAge;
		this.sRollNo = sRollNo;
	}

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", sAge=" + sAge + ", sRollNo=" + sRollNo + "]";
	}
}

class Customer {
	String cName;
	int cAge;
	int cRollNo;

	public Customer(String cName, int cAge, int cRollNo) {
		super();
		this.cName = cName;
		this.cAge = cAge;
		this.cRollNo = cRollNo;
	}	

	@Override
	public String toString() {
		return "Customer [cName=" + cName + ", cAge=" + cAge + ", cRollNo=" + cRollNo + "]";
	}
}