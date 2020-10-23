package _7_Session._2_Overloading;

public class _3_Book_a_Car {

	public void getCar() {
		System.out.println("Booking a car");
	}

	public void getCar(String carType) {
		System.out.println("Booking a " +carType+ " car");
	}
	
	public void getCar(String carType, int seater) {
		System.out.println("Booking a " +carType+ " car" + " with seating capacity of " +seater+ " people");
	}
	
	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		_3_Book_a_Car bookCar = new _3_Book_a_Car();
		
		System.out.println("-------------------------- Booking a car with system defined type -------------------------");
		bookCar.getCar();
		
		System.out.println("--------------------- Booking a car with specific defined type by user --------------------");
		bookCar.getCar("Sedan");
		
		System.out.println("---- Booking a car with specific defined type by user with passenger seating capacity -----");
		bookCar.getCar("SUV", 7);
		
		System.out.println("-------------------------------------------------------------------------------------------");

	}

}
