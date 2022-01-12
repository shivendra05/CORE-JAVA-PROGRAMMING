package com.practice.innerclass;

//case1
public interface Class_InsideInterface {

	/*
	 * if functionality of a class closely associated with interface then its highly recommended to declare a class inside
	 * interface 
	 * */
	public void sendMain(EmailDetails email);

	class EmailDetails{
		String cC_List;
		String bCC_List;
		String to_List;
	}
}