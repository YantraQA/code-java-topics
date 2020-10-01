package _1_Session._2_StringAndCharacterConcatination;

/**
 * 
 * @author Sarang
 * Date - 01-10-2020
 *
 */

/*
 * 	Here in this class String concatenation in java covered
 * 	concatenation - merging or adding the values
 */

public class _2_String_And_Character_Concatination {

	public static void main(String[] args) {
		
		// *************************************************
		// 				1. String Concatenation
		// *************************************************
		
		String x = "Test";
		String y = "Seleium";
		
		String c = "100";
		String d = "200";
		
		int a = 100;
		int b = 200;

		System.out.println("\n---------------------------------\n");
		
		// 1. 
		System.out.println(a+b); // 300
		
		// 2. 
		System.out.println(x+y); // TestSeleium
		
		// 3.
		System.out.println(a+b+x); // 300Test
		
		// 4.
		System.out.println(a+b+x+y); // 300TestSeleium
		
		// 5.
		System.out.println(x+y+a);  // TestSeleium100
		
		// 6.
		System.out.println(x+y+a+b); // TestSeleium100 + 200 = TestSelenium100200
		
		System.out.println(c+d); // 100200
		
		// Use case
		int bill = 520;
		int tax = 30;
		//int total = bill+tax;
		//System.out.println("Food Bill is : " + total);
		System.out.println("Food Bill is : " + (bill+tax));
		
		
		// *************************************************
		// 			2. Character Concatenation
		// *************************************************
		char c1 = '5'; int z1 = 5;
		char c2 = '4'; int z2 = 4;
		char c3 = 'A'; String q1 = "A";
		char c4 = 'B'; String q2 = "B";
		
		System.out.println(c1+c2);
		System.out.println(z1+z2);
		System.out.println("-----------");
		System.out.println(c3+c4);
		System.out.println(q1+q2);
		
		

	}

}
