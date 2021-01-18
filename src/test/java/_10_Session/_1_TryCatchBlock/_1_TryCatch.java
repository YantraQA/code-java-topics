package _10_Session._1_TryCatchBlock;

public class _1_TryCatch {
	
	public static void main(String[] args) {
		
//		System.out.println("A");
//		System.out.println("B");
//		System.out.println("C");
//		
//		int a = 9/0;			// this line will throw an exception which need to be handled
//		
//		System.out.println("D");
//		System.out.println("E");
//		System.out.println("F");
		
//		//-------------------------------------------------------------------------------------
		
//		System.out.println("A");
//		System.out.println("B");
//		System.out.println("C");
//		
//		try 
//		{
//			int a = 9/0;			// this line will throw an exception which need to be handled
//		} 
//		catch (Exception e) 
//		{
//			// TODO: handle exception
//		}
//		
//		System.out.println("D");
//		System.out.println("E");
//		System.out.println("F");
		
		//-------------------------------------------------------------------------------------
		
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		
		try 
		{
			int a = 9/0;			// this line will throw an exception which need to be handled
		} 
		catch (Exception e) 		// e is just a reference variable name for exception, can even write other variable name also
		{
			e.printStackTrace();    // This will print the proper hierarchy from where the exception is coming 
			System.out.println("An Exception occured at division of integer a"); // User defined message for more clarification
		}
		
		System.out.println("D");
		System.out.println("E");
		System.out.println("F");
		
	}

}