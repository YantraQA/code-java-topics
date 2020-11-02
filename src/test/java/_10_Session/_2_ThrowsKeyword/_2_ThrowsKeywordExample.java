package _10_Session._2_ThrowsKeyword;

public class _2_ThrowsKeywordExample {
	
	public static void main(String[] args) throws Exception {

		_2_ThrowsKeywordExample objRef = new _2_ThrowsKeywordExample();
		objRef.launchBrowser();

	}

	public void launchBrowser() throws Exception
	{
		System.out.println("launchBrowser ..... ");
		launchURL();
	}

	public void launchURL() throws Exception
	{
		System.out.println("launchURL ..... ");
		login();
	}

	public void login() throws Exception
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
