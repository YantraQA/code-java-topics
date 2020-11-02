package _10_Session._2_ThrowsKeyword;

public class _1_ThrowsKeywordExample {

	public static void main(String[] args) {
	
		_1_ThrowsKeywordExample objRef = new _1_ThrowsKeywordExample();
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
		int a = 9/0;
	}

	// Below is the stack track of the excetion starting from main method -> launchBrowser -> launchURL -> login
	
	//Exception in thread "main" java.lang.ArithmeticException: / by zero
	//at _10_Session._2_ThrowsKeyword._1_ThrowsKeywordExample.login(_1_ThrowsKeywordExample.java:27)
	//at _10_Session._2_ThrowsKeyword._1_ThrowsKeywordExample.launchURL(_1_ThrowsKeywordExample.java:21)
	//at _10_Session._2_ThrowsKeyword._1_ThrowsKeywordExample.launchBrowser(_1_ThrowsKeywordExample.java:15)
	//at _10_Session._2_ThrowsKeyword._1_ThrowsKeywordExample.main(_1_ThrowsKeywordExample.java:8)
	//launchBrowser ..... 
	//launchURL ..... 
	//Do login to the application ......-> 

//-------------------------------------------------------------------------------------------------------------

	 //now throws these type of exceptions
//	public static void main(String[] args) throws Exception {
//	
//	_1_ThrowsKeywordExample objRef = new _1_ThrowsKeywordExample();
//	objRef.launchBrowser();
//	
//	}
//	
//	public void launchBrowser() throws Exception
//	{
//	System.out.println("launchBrowser ..... ");
//	launchURL();
//	}
//	
//	public void launchURL() throws Exception
//	{
//	System.out.println("launchURL ..... ");
//	login();
//	}
//	
//	public void login() throws Exception
//	{
//	System.out.println("Do login to the application ......-> ");
//	int a = 9/0;
//	}	
	
	// Here all methods are throwing the exceptions so jvm will catch this exception and gives output
	//Exception in thread "main" java.lang.ArithmeticException: / by zero
	//at _10_Session._2_ThrowsKeyword._1_ThrowsKeywordExample.login(_1_ThrowsKeywordExample.java:66)
	//at _10_Session._2_ThrowsKeyword._1_ThrowsKeywordExample.launchURL(_1_ThrowsKeywordExample.java:60)
	//at _10_Session._2_ThrowsKeyword._1_ThrowsKeywordExample.launchBrowser(_1_ThrowsKeywordExample.java:54)
	//at _10_Session._2_ThrowsKeyword._1_ThrowsKeywordExample.main(_1_ThrowsKeywordExample.java:47)
	//launchBrowser ..... 
	//launchURL ..... 
	//Do login to the application ......-> 
	
	// But this is not right way of handling exceptions
}
