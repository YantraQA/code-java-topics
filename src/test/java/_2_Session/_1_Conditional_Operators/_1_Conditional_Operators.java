package _2_Session._1_Conditional_Operators;

public class _1_Conditional_Operators {
	
	public static void main(String[] args) {
		
		// Conditional operators are used to check & compare the
		// condition between the variables & values
		// Ex 	1. == :- Comparison operator 	
		//		2. > :- Greater than operator
		//		3. < :- Less than operator
		//		4. >= :- Greater than equal to operator
		//		5. <= :- Less than equal to operator
		//		6. != :- Not equal to operator
		//		7. && :- AND / Short Circuit operator
		//		8. || :- OR operator
		
		int a = 10;
		int b = 20;
		
//		// Example - 1
//		// Compare (Validate) which one is greater between two values
//		if(b > a)
//		{
//			System.out.println("b is greater than a");
//		}
//		else // optional part not necessary to write every time 
//		{
//			System.out.println("a is greater than b");
//		}
//		
//		System.out.println("----------------------------------------");
		
		// Example - 2
		// Compare (Validate) which one is greater between two values
		// Or are the two values are same
		if(b == a)
		{
			System.out.println("both values are equal");
		}
		else if(b > a)
		{
			System.out.println("b is greater than a");
		}
		else // optional part not necessary to write everytime 
		{
			System.out.println("a is greater than b");
		}
		
		System.out.println("----------------------------------------");
		
		// Example - 3
		// Compare (Validate) which one is greater between two values
		// Or are the two values are same
		if(b >= a)
		{
			System.out.println("b is greater than a or equal to a");
		}
		else
		{
			System.out.println("b is less than a or equal to a");
		}

		System.out.println("----------------------------------------");
		
		// Example - 4
		// Not equal to operator
		
		int total = 100;
		if(!(total == 0)) // total == 0 is false and !false equals to true
		{
			System.out.println("this is bill is eligible for 10% discount");
		}
		else {
			System.out.println("this is bill is not eligible for discount");
		}
		
		// Example - 5
		// Dead code - A part of code which will not executed any time
		// even though its syntactically correct
		
		// if statement needs always a true condition to execute the code
		// try for not equal to operator
		if(false)  
		{
			System.out.println("Hello there, How are you");
		}
		else
		{
			System.out.println("Good bye");
		}

		System.out.println("----------------------------------------");
		
		// Example - 6
		// Nested if
		int num = 15;
		if(num > 10)
		{
			if(num == 15)
			{
				System.out.println("Number is equal to 15");
			}
			if(num == 17)
			{
				System.out.println("Number is equal to 17");
			}
		}
		else {
			System.out.println("number is less than or equal to 10");
		}
	
		System.out.println("----------------------------------------");
		
		// Example - 7
		// Nested if - else if 
		int number = 10; //10 40 50
		if(number == 10)
		{
			System.out.println("The number is 10");
		}
		else if (number == 20) 
		{
			System.out.println("The number is 20");
		}
		else if (number == 30) 
		{
			System.out.println("The number is 30");
		}
		else {
			System.out.println("number is not found...");
		}

		System.out.println("----------------------------------------");
		
		// Example - 8
		// && operator	- true && true = true
		// 				- false && true = false
		// 				- true && false = false
		// 				- false && false = false		
		// WAP to find highest number form 3 numbers
		int x = 100;
		int y = 200;
		int z = 300;
		
		if(x>y && x>z) 
		{
			System.out.println("x is the higest number");
		}
		else if (y>z)
		{
			System.out.println("y is the higest number");
		}
		else 
		{
			System.out.println("z is the higest number");
		}

		System.out.println("----------------------------------------");
		// Example - 8
		// || operator	- true && true = true
		// 				- false || true = true
		// 				- true || false = true
		// 				- false || false = false	
		String UserName = "Manish";
		if (UserName == "Tom" || UserName == "Peter") {
			System.out.println("Hi developer " + UserName);
			System.out.println("How may I help you?");
		} 
		else if (UserName == "Steve" || UserName == "Joe")
		{
			System.out.println("Hi tester " + UserName);
			System.out.println("How may I help you?");
		}
		else {
			System.out.println("Hi there " + UserName);
			System.out.println("How may I help you?");
		}
		
		
	}

}
