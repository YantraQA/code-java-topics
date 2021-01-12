package _3_Session._1_While_Loop;

public class _1_While_loop {
	
	public static void main(String[] args) {
		
		// To iterate some value or execute some line of code
		// in a loop with some condition
		
		// To print 1 to 5 integer
		// Worst way of of printing by coding
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		System.out.println("-----------------------------");
		
		// To print 1 to 10 integer
		// While loop
		int i = 1; // Start Point
		while(i<=10) // condition
		{
			// Iteration
			System.out.println(i); // 1 2 3 ..... 10
			// Condition to increase the counter value
			// otherwise the loop 
			i++; // (++i) or (i=i+1) also fine here
		}

		System.out.println("-----------------------------");
		
		// Example - Print the statement when loop 
		// reaches to number 5
		int j = 1;
		while(j<=10) // condition
		{
			// Iteration
			System.out.println(j); // 1 2 3 4
			
			if(j == 5)
			{
				System.out.println("Hey this is Five here");
				// if after number 5 if no need to print next numbers use break
				break;
			}
			// Condition to increase the counter value
			j++; // (++j) or (j=j+1) also fine here
		}

		System.out.println("-----------------------------");
		
		// Example - After received cash from customer on billing counter
		// by using boolean condition in while loop
		boolean isCashReceived = true;
		int amount = 250;
		while(isCashReceived)
		{
			System.out.println("Your bill is paid successfully !!! with amount -> " + amount);
			System.out.println("Thank you!");
			
			// condition to break the loop
			// if below condition missed then system goes in infinite loop
			isCashReceived = false;
			
		}
		
	}
	

}
