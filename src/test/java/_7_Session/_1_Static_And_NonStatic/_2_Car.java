package _7_Session._1_Static_And_NonStatic;

public class _2_Car {

	// Below Data members are subject to change for every car so declared as non static
	String name;
	int price;
	String colour;
	
	// As wheels is an constant entity for a car so declared as static
	static int wheels = 4;
	 
	public static void main(String[] args)
	{
		System.out.println("Sports Car Details ---- ");
		
		_2_Car sportsCar = new _2_Car();
		// assigning the values for the sportsCar
		sportsCar.name = "BMW";
		sportsCar.price = 40_000;
		sportsCar.colour = "Sterling Black";
		//sportsCar.wheels = 5; 
		
		// variables value
		System.out.println("---- sports Car Details ----");
		System.out.println(sportsCar.name);
		System.out.println(sportsCar.colour);
		System.out.println(sportsCar.price);
		// System.out.println(sportsCar.wheels); // avoid using this and use for static data members
		System.out.println(wheels); 
		System.out.println("----------------------------");
		
		// assigning the values for the sportsCar
		_2_Car passengerCar = new _2_Car();
		passengerCar.name = "WagonR";
		passengerCar.price = 6_000;
		passengerCar.colour = "White";
		
		System.out.println("-- Passenger Car Details ---");
		System.out.println(passengerCar.name);
		System.out.println(passengerCar.colour);
		System.out.println(passengerCar.price);
		// System.out.println(passengerCar.wheels); // avoid using this and use for static data members
		System.out.println(wheels); 
		System.out.println("----------------------------");
	} 
}
