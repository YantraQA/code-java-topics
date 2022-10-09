package _8_Session._2_Inheritance;

public class _2_BMW extends _1_Car {

	//A method in parent class as well as in child class with the same name & same no of parameters - 
	//method overriding
	@Override
	public void start() {
		// Something like advance feature - key less entry & Button Start
		System.out.println("BMW -- start");
	}
	
	
//	@Override
//	public void start(int a) {
//		System.out.println("BMW -- start");
//	}

	//@Override
	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}

	// Static method
	public static void carHonk() {
		System.out.println("Car -- Honk");
	}

}
