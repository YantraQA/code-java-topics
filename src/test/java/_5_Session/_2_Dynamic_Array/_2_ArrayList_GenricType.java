package _5_Session._2_Dynamic_Array;

import java.util.ArrayList;

public class _2_ArrayList_GenricType {

	public static void main(String[] args) {
		
		// Arraylist of String Type
		ArrayList<String> userNames = new ArrayList<String>();
		userNames.add("Tom");
		userNames.add("Peter");
		userNames.add("Mark");
		// userNames.add(45); // this line will throw an error at compile time
		
		System.out.println("Printing the all values form arraylist");
		for (int i = 0; i < userNames.size(); i++) {
			System.out.println(userNames.get(i));
		}
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		// numberList.add("Fifty"); // this line will throw an error at compile time
		
		System.out.println("Printing the all values form arraylist");
		for (int i = 0; i < numberList.size(); i++) {
			System.out.println(numberList.get(i));
		}


	}

}
