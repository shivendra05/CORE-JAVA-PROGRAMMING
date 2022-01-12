package com.practice.oops.inheritance.hasA;

//error
public class HasA_Engine_Aggrigation{
	//has a relationship is also know as composition or agrigation.
	
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("Engine");
		
	}
}

class CarEngine_Aggrigation{
	public static void main(String[] args) {
		//has a relationship:: car has engine reference.
		HasA_Engine_Aggrigation hasar= new HasA_Engine_Aggrigation();
		hasar.speed();

	}
}

//without existing container object if there is chance of existing contained objects then
//container and contained objects are weakly associated and this weak association is nothing but aggregation.
//without department there is no chance of teachers/faculty/professor its a aggregation.
