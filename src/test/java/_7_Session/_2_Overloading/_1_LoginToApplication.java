package _7_Session._2_Overloading;

public class _1_LoginToApplication {
	
	// Overloading - Why? -> To avoid unnecessary creation of different method for same 
	// functionality & minimize the confusion while calling the methods
	// Means - The method signature should be different with a similar name.
	// Note - Method overloading has nothing to do with the internal logic of the overloaded methods
	
	// Overloading means - within class, when we have different methods with same name 
	// but 
	// 1. different number of parameters
	// 2. types (Data types)
	// 3. sequence of parameters

	public void login(){
		System.out.println("login 0 param method");
	}
	
	public void login(String username){
		System.out.println("login 1 parameters method -> Username");
	}
	

	public void login(int OTP){
		System.out.println("login 1 parameters method -> OTP");
	}
	
	public void login(String username, String password){
		System.out.println("login 2 parameters method -> Username & Password");
	}
	
	public void login(long phoneNumber, String password){
		System.out.println("login 2 parameters method -> Phone Number & Password");
	}
	
	public void login(String username, long phoneNumber){
		System.out.println("login 2 parameters method -> Username & Phone Number");
	}
	
	// This is a duplicate method
//		public void login(String emailid, long OTP){
//			System.out.println("login 2 parameters method -> emailId & OTP");
//		}
	
	public static void main(String[] args) {
		
		_1_LoginToApplication lp = new _1_LoginToApplication();
		lp.login();
		lp.login(3453);
		lp.login("John");
		lp.login("john", "john@123");
		lp.login(746256454, "john@123");
		lp.login("john", 746256454);
	
	}
	
}
