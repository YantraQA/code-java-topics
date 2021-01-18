package _10_Session._2_ThrowsKeyword;

public class _2_ThrowsKeywordExample {
	
	public static void main(String[] args)  {

		_2_ThrowsKeywordExample objRef = new _2_ThrowsKeywordExample();
		objRef.launchBrowser();

	}

	public void launchBrowser() 
	{
		System.out.println("launchBrowser ..... ");
		launchURL();
	}

	public void launchURL() 
	{
		System.out.println("launchURL ..... ");
		login();
	}

	public void login() 
	{
		System.out.println("Do login to the application ......-> ");
		
		try 
		{
			int a = 9/0;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Something went wrong while log in to the application");
		}
		
		System.out.println("ABC");
		
	}

}
