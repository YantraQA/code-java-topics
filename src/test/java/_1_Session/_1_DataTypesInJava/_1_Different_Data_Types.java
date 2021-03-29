package _1_Session._1_DataTypesInJava;

/**
 * 
 * @author Sarang
 * Date - 01-10-2020
 *
 */

/*
 * 	Here in this class data types in java covered
 * 	Data types - 
 * 				1. Primitive Data types
 * 				These Data Types stored in memory without any object creation 
 * 				and the size of storing them is already defined in java.
 * 				Ex - byte, short, int, long, double, char, boolean
 * 
 * 				2. Non - Primitive Data types
 * 				They are stored in the form of objects in memory.
 * 				Ex - String, Array, List, Set
 */

public class _1_Different_Data_Types {
	
	public static void main(String[] args) {
		
		// Declaring a variable
		int height;
		
		// initialization of a variable
		height = 10;
		
		// Declaring & initialization a variable 
		int ageOfUser = 16; 	// with camel casing
		int age_of_user = 20; 	// by using underscore symbol
		
		
		// 1. Primitive Data types

		// ***********************************************************
		// ********************** Integer Family *********************
		// ***********************************************************
		// byte 1 byte | range -127 to 128 | 
		byte width = 10;
		byte temperature = -12;
		byte score = 00;
		byte weekDayNumber = 1;

		// short  2 byte | range -32768 to 32767 | 
		short s1 = 100;
		short s2 = -5678;
		short s3 = 00;

		// int 4 bytes | range -1247483648 to 2147483647 | 
		int i1 = 10;
		int i2 = 23;
		int i3 = 0;

		// long 8 byte | range very long no need to memorize |
		long l1 = 10;
		long l2 = -5645;
		long l3 = 00;

		// ***********************************************************
		// ******* floating point numbers (Decimal Numbers) **********
		// ***********************************************************
		// float 4 byte | range very long no need to memorize |
		float interestRate = 12.33f;  
		float f2 = (float)12.33; 
		float f3 = 75f;
		float f4 = 56; // 56.00
		float f5 = 0.00f;

		// double 8 bytes | range very long no need to memorize |
		double d1 = 12.33333333; 
		double d2 = 56;
		double d3 = 89.00;
		double d4 = 0;

		// ***********************************************************
		// ********************* boolean family **********************
		// ***********************************************************
		// boolean 1 bit [not perfectly defined in java docs] | range true / false | 
		boolean isIndianNationality = true; // 1
		boolean e2 = false; // 0

		// ***********************************************************
		// ********************* character family ********************
		// ***********************************************************
		//char 2 byte | it will accept Single character |
		char c1 = 'a';
		char c2 = '8';
		char c3 = '0';
		char c4 = '$';
		char c5 = '@';
		char c6 = '|';

		// 2. Non - Primitive Data types
		// ***********************************************************
		// ********************* String (it's a Class) ***************
		// ***********************************************************
		// String is a collection of characters (char) so size/range vary depending on usages.
		String javaVersion = "Currently Running on Java 1.8";
		String employeeId = "56451";
		String password = "2@45#";
		
		// ***********************************************************
		// ******** Printing the Values of different data types ******
		// ***********************************************************
		System.out.println("Primitive Data Types");
		System.out.println("Printing byte values ---->");
		System.out.println(width);
		System.out.println(temperature);
		System.out.println(score);
		System.out.println("--------------------------");

		System.out.println("Printing short values --->");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("--------------------------");
		
		System.out.println("Printing integer values -->");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println("---------------------------");
		
		System.out.println("Printing long values ----->");
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println("---------------------------");
		
		System.out.println("Printing float values ----->");
		System.out.println(interestRate);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println("---------------------------");
		
		System.out.println("Printing double values --->");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println("---------------------------");
		
		System.out.println("Printing boolean values -->");
		System.out.println(isIndianNationality);
		System.out.println(e2);
		System.out.println("---------------------------");
		
		System.out.println("Printing char values ----->");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println("---------------------------");
		
		System.out.println("Non - Primitive Data types ");
		System.out.println("Printing String values --->");
		System.out.println(javaVersion);
		System.out.println(employeeId);
		System.out.println(password);
		System.out.println("---------------------------");
		
	}

}
