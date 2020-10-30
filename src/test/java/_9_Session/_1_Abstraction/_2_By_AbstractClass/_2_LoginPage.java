package _9_Session._1_Abstraction._2_By_AbstractClass;

public class _2_LoginPage extends _1_Page{
	
	public _2_LoginPage(){
		System.out.println("Login page const...");
	}

	@Override
	public void title() {
		System.out.println("login page title");
	}

	@Override
	public void url() {
		System.out.println("http://google.com");
	}

	@Override
	public void footerLinks() {
		System.out.println("privacy policy");
	}
	
	@Override
	public void logo(){
		System.out.println("LoginPage -- logo");
	}
	
//	@Override
//	public void privacyPolicy()
//	{
//		System.out.println("fvdf");
//	}
	
	// Special method of login page class
	public void doLogin(){
		System.out.println("login to app...");
	}

}
