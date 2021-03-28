package _10_Session._3_ThrowKeyword;


public class _1_ThrowKeywordExample {
	
	// throw keyword is used to create custom exception by user
	// as java has not included all kind of exceptions
	// and there will be some cases where user needs to create it own exception according to 
	// some specific conditions
	
	
	public static void main(String[] args) {
		
	
		
//		try {
//			throw new Exception("User Defined Exception");
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("An User defined exception thrown due to the reason .......");
//		}
		
	//----------------------------------------------------------------------------------------------
		
		// Use case
		// 1. While reading data from any excel sheet the cell value gets empty or null
//		String username = " "; // " "; 
//		if(username.equals(" ") || username.equals(null))
//		{
//			try
//			{
//			throw new Exception("Blank Cell Value Exception");
//			}
//			catch (Exception e)
//			{
//				e.printStackTrace();
//				System.out.println("The value fetched from the excel sheet cell is either blank or null");
//			}
//		}
//		else {
//			System.out.println("Login with -> " + username);
//		}
		
		//----------------------------------------------------------------------------------------------
		
		  launchURL("https://www.test.com"); // (" ");
		
	}
	
	//----------------------------------------------------------------------------------------------
	
	// 2. Incorect URL Exception
	public static void launchURL(String url)
	{
		if(url.equals(" "))
		{
			try
			{
				throw new Exception("incorrectUrlException");
			}
			catch (Exception e)
			{
				e.printStackTrace();
				System.out.println("The entered url value is incorrect...");
			}
		}
		else {
			System.out.println("Launching the url -> "+ url);
		}
	}
	
	
}
