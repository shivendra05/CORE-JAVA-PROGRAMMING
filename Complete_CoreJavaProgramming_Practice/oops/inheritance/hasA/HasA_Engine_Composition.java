package com.practice.oops.inheritance.hasA;

//error
public class HasA_Engine_Composition{
	//has a relationship is also know as composition or agrigation.
	
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("Engine");
		
	}
}

class MainCarEngine_Composition{
	public static void main(String[] args) {
		//has a relationship:: car has engine reference.
		HasA_Engine_Composition hasar= new HasA_Engine_Composition();
		hasar.speed();

	}
}

//without existing container object if there is no chance of existing contained objects then
//container and contained objects are strongly associated and this strong association is nothing but composition.
//without university there is no chance of branches/departments its a composition.
