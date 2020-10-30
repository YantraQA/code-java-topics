package _9_Session._1_Abstraction._1_By_Interface;

public interface _1_USMedical extends _0_WHO {
	
	int min_fee = 10; // By default the variables are static as well as final

	public void physioServices(); // Abstract(Prototype) method

	public void oncologyServices(); // Abstract(Prototype) method

	public void orthopedicServices(); // Abstract(Prototype) method
	
	public void RadioLogyServices(); // Abstract(Prototype) method [Common service also available in other interfaces]
	
	//can not create the object of Interface
	//only method declaration -- method prototype -- no method body -- Abstract Methods
	//can not create static  Abstract(prototype) method in Interface - because we cannot override static methods
	//Example
	//public static void testServices();
	//Interface variables are static and final by default
	

	//From JDK1.8, you can have static methods in interface but with method body
	//static method with method body:
	public static void Services_911(){
		System.out.println("US - 911 services....");
	}
	
	// default method cannot be overridden 
	default void intership(){
		System.out.println("US - intership....");

	}

}
