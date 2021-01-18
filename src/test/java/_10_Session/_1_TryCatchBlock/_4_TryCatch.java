package _10_Session._1_TryCatchBlock;

public class _4_TryCatch {
	
	static int x = 9;
	static int y = 0; //(Integer) null; 

	public static void main(String[] args) {

		_4_TryCatch tc = new _4_TryCatch();

		tc.division(x, y);

	}

	public void division(int a, int b)
	{
		// One try with multiple catch blocks
		try
		{
			int c = a/b;
			System.out.println("The division of input " + a + " and" + b + " is -> " + c);
		}

		catch (ArithmeticException e) 
		{
			e.printStackTrace();    // This will print the proper hierarchy from where the exception is coming 
			System.out.println("An Exception occured inside division method"); // User defined message for more clarification
		}
		catch (NullPointerException e) {
			e.printStackTrace();    // This will print the proper hierarchy from where the exception is coming
			System.out.println("An Exception occured other than NullPointerException inside division method"); // User defined message for more clarification
		}
		catch (Exception e) 
		{
			e.printStackTrace();    // This will print the proper hierarchy from where the exception is coming
			System.out.println("An Exception occured other than ArithmeticException inside division method"); // User defined message for more clarification
		}
		
		
	}

}
