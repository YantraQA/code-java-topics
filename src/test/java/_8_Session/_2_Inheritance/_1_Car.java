package _8_Session._2_Inheritance;

public class _1_Car extends _0_Vehicle{
	
	public void start() {
		System.out.println("Car -- start");
	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void fillFuel() {
		System.out.println("Car -- fuel");
	}
	
	// Static method
	public static void carHonk() {
		System.out.println("Car -- Honk");
	}

}
