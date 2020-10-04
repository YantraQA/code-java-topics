package _3_Session._2_For_Loop;

public class _2_for_loop_pattern_printing {
	
	public static void main(String[] args) {
	
		// Print the following pattern
		//		*
		//		**
		//		***
		//		****
		
		for(int i=1;i<=4;i++) // for printing columns
		{
			for(int j=1;j<=i;j++) // for printing rows
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		System.out.println();
		
		// Print the following pattern
		//		****
		//		***
		//		**
		//		*
		
		for(int i=1;i<=4;i++) // for printing columns
		{
			for(int j=4;j>=i;j--) // for printing rows
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
