package _6_Session._3_Different_Methods;

import java.util.ArrayList;

public class _1_System_Methods {

	static String welcomeMessage = "   Hello User Welcome    ";
	
	public static void main(String[] args) {
	
		System.out.println("--- Checking the Size of welcome message String ---");
		System.out.println("The Size is " + welcomeMessage.length());
		// Here length() is a system defined method where its logic is predefined 
		System.out.println("---------------------------------------------------");
		
		System.out.println("--- Triming white spaces of the welcome message ---");
		System.out.println("After removal of white spaces the welcome message is ");
		System.out.println(welcomeMessage.trim());
		System.out.println("---------------------------------------------------");
		
		ArrayList<Integer> multipleOfTen = new ArrayList<Integer>();
		multipleOfTen.add(10); // this add method is defined in class ArrayList with its logic
		multipleOfTen.add(20);
		multipleOfTen.add(20);
		multipleOfTen.add(30);
		multipleOfTen.add(40);
		
		multipleOfTen.remove(1); // Remove the duplicate value form index position 1 from ArrayList
		
		System.out.println("Values of multiple of Ten are - ");
		for (int i = 0; i < multipleOfTen.size(); i++) {
			
			System.out.println(multipleOfTen.get(i)); 
			// this get method is defined in class
			// ArrayList with its logic
		}
	
	}

}
