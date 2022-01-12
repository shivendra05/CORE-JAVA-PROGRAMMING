package com.practice.innerclass;

//Case2
public class Interface_InsideClass_VehicleType {

	/*
	 * inside a class if we required multiple implementation of an interface, and all these implementations are related to 
	 * particular class then we can define a interface inside a class
	 * 
	 * */

	interface Vehicle{
		public int getNoOfWheels();
	}

	class Bus implements Vehicle{
		@Override
		public int getNoOfWheels() {
			// TODO Auto-generated method stub
			return 6;
		}
	}

	class Car implements Vehicle{
		@Override
		public int getNoOfWheels() {
			// TODO Auto-generated method stub
			return 4;
		}
	}

	class Auto implements Vehicle{
		@Override
		public int getNoOfWheels() {
			// TODO Auto-generated method stub
			return 3;
		}
	}
}