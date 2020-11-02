package _10_Session._1_TryCatchBlock;

public class _2_TryCatch {
	
	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		
		try 
		{
			int a = 9/0;			// this line will throw an exception which need to be handled
		} 
		catch (Throwable e) 		// Can mention throwable also as its a parent class of the all exceptions
		{
			e.printStackTrace();    // This will print the proper hierarchy from where the exception is coming 
			System.out.println("An Exception occured at division of integer a"); // User defined message for more clarification
		}
		
		System.out.println("D");
		System.out.println("E");
		System.out.println("F");
		
		//-------------------------------------------------------------------------------------
		
//		System.out.println("A");
//		System.out.println("B");
//		System.out.println("C");
//		
//		try 
//		{
//			int a = 9/0;					// this line will throw an exception which need to be handled
//		} 
//		catch (NullPointerException e) 		// Proper exception name should be given else it will throw an exception
//		{
//			e.printStackTrace();    		// This will print the proper hierarchy from where the exception is coming 
//			System.out.println("An Exception occured at division of integer a"); // User defined message for more clarification
//		}
//		
//		System.out.println("D");
//		System.out.println("E");
//		System.out.println("F");
	}
	
}
