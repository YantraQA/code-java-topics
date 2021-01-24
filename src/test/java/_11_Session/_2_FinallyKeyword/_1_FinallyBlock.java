package _11_Session._2_FinallyKeyword;

public class _1_FinallyBlock {
	
	
	public static void main(String[] args) {
		
		int a = 10;
		
//		try 
//		{
//			System.out.println("Division process .....");
//			int k = a/5;
//		} 
//		catch (Exception e) 
//		{
//			System.out.println("Some exception occured .......");
//		}
		
		// -----------------------------------------------------------------------
		
		try 
		{
			System.out.println("Division process .....");
			//int k = a/5;
			int k = a/0;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Some exception occured .......");
		}
		// optional block
		finally // This block executes every time whether the exception caught by catch block or not
		{
			System.out.println("Process ended ........");
		}
		
		// -----------------------------------------------------------------------
		
//		try 
//		{
//			System.out.println("Division process .....");
//			//int k = a/5;
//			int k = a/0;
//		} 
//		catch (NullPointerException e) 
//		{
//			e.printStackTrace();
//			System.out.println("Some exception occured .......");
//		}
//		// optional block
//		finally // This block executes every time whether the exception caught by catch block or not
//		{
//			System.out.println("Process ended ........");
//		}
		
		// -----------------------------------------------------------------------
		
		try 
		{
			System.out.println("Division process .....");
			//int k = a/5;
			int k = a/0;
		} 
		// optional block & without catch block it also can be used but try & catch should be together
		finally // This block executes every time whether the exception caught by catch block or not
		{
			System.out.println("Process ended ........");
		}
		
	}

}
