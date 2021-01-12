package _3_Session._2_For_Loop;

public class _1_for_loop {
	
	public static void main(String[] args) {
		
		
		// To print 1 to 10 integer
		// For loop
		System.out.println("Values in from range 1 to 10 are ->");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------------");
		
		// Example - Print only even numbers in between 1 to 20
		System.out.println("Even numbers from 0 to 20 are ->");
		for (int even = 0; even <= 20; even = even+2) // This is not a wise way to print the even values
		{
			System.out.println(even); // 0, 2,... 18, 20 
		}

		System.out.println("-----------------------------");
		
		// Example - Print only even numbers in between 1 to 20
		// with an if condition
		System.out.println("Even numbers from 0 to 20 using if condition are ->");
		for (int j = 0; j <= 20; j++) { //0 1 2 3 4 .... 20
			if (j % 2 == 0) {
				System.out.println(j);
			}
			
		}
		
		// use case - While working with an application
		// To print all links on a page for loop is used
	}

}
