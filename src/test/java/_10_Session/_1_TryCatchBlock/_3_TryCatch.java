package _10_Session._1_TryCatchBlock;

public class _3_TryCatch {
	
	public static void main(String[] args) {
		
		_3_TryCatch tc = new _3_TryCatch();
	
		// Handling exception at method calling level
	
		try 
		{
			tc.division(9, 0);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();    // This will print the proper hierarchy from where the exception is coming 
			System.out.println("An Exception occured at division of integer a"); // User defined message for more clarification
		}
	
	}
	
	public void division(int a, int b)
	{
		int c = a/b;
		System.out.println("The division of input " + a + " and" + b + " is -> " + c);
	}
	
	//-------------------------------------------------------------------------------------
	
//	public static void main(String[] args) {
//		
//		_3_TryCatch tc = new _3_TryCatch();
//
//		tc.division(9, 0);
//
//	}
//	
//	public void division(int a, int b)
//	{
//	
//		// Handling exception inside method 
//
//		try
//		{
//		int c = a/b;
//		System.out.println("The division of input " + a + " and" + b + " is -> " + c);
//		}
//		catch (Exception e) 
//		{
//			e.printStackTrace();    // This will print the proper hierarchy from where the exception is coming 
//			System.out.println("An Exception occured inside division method"); // User defined message for more clarification
//		}
//	}

}