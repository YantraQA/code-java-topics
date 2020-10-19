package _6_Session._3_Different_Methods;

import java.util.Scanner;

public class _3_Input_From_User_1 {

	public static void main(String[] args) {
		
		System.out.println("Please enter the factory name");
		
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		sc.close();
		
		_2_UserDefined_Methods userMethods = new _2_UserDefined_Methods();
		String outputFromFarctory = userMethods.factoryName(userInput);
		System.out.println(outputFromFarctory);
	}

}
