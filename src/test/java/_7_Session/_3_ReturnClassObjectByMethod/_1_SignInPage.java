package _7_Session._3_ReturnClassObjectByMethod;

public class _1_SignInPage  {

	public _2_HomePage login(String un, String pwd){
		
		System.out.println("username is "+ un);
		System.out.println("password is "+ pwd);
		System.out.println("click on login button");

		//return class object - home page class object from login() method
		// 1.
		return new _2_HomePage();
		
		// 2.
		//HomePage hp = new _2_HomePage();
		//return hp;
	}
	
}
