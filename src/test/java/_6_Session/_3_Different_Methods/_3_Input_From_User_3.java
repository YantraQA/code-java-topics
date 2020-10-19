package _6_Session._3_Different_Methods;

import java.util.Scanner;

public class _3_Input_From_User_3 {

	public static void main(String[] args) {

		System.out.println("Please enter the two numbers for total");

		Scanner sc = new Scanner(System.in);
		int intOne = sc.nextInt();
		int intTwo = sc.nextInt();
		sc.close();

		_2_UserDefined_Methods userMethods = new _2_UserDefined_Methods();
		int totalOfNumbers = userMethods.add(intOne, intTwo);
		System.out.println("The total for two numbers " + intOne + " & " + intTwo + " is -> ");
		System.out.println(totalOfNumbers);
	}

}
