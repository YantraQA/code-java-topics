package _2_Session._2_SwitchCase_Concept;

public class _1_SwitchCase_Statement {

	public static void main(String[] args) {
		
		// Switch Case is used to check multiple conditions
		// In switch case String & integer are used to switch between
		// different cases
		// Performance wise switch case is good than if else
		
		// Example - 1
		int number = 2;
		
		switch (number) {
		case 0 :
			System.out.println("Number is zero");
			break;
		case 1:
			System.out.println("Number is one");
			break;
		case 2:
			System.out.println("Number is two");
			break;
		case 3:
			System.out.println("Number is three");
			break;
		case 4:
			System.out.println("Number is four");
			break;
		case 5:
			System.out.println("Number is five");
			break;
		case 6:
			System.out.println("Number is six");
			break;
		case 7:
			System.out.println("Number is seven");
			break;
		case 8:
			System.out.println("Number is eight");
			break;
		case 9:
			System.out.println("Number is nine");
			break;
		default:
			System.out.println("Enter a number between Zero to Nine ");
			break;
		}
		
		System.out.println("------------------------------------");
		
		// Example - 2
		// Switch case without break statement
		int p = 2;
		switch (p) {
		case 1:
		case 2:
			System.out.println("Hello");
			
		case 3:
		case 4:
			System.out.println("Hi");
			break;
		default:
			break;
		}
		 
		// use case - browser switching
		// Example - 3
		String browser = "chrome";
		
		switch (browser) {
		case "chrome":
			System.out.println("Chrome browser invoked");
			break;
		case "firefox":
			System.out.println("Firefox browser invoked");
			break;

		default:
			System.out.println("safari browser is not implemented");
			break;
		}
		

	}

}
