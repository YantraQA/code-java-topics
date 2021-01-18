package _9_Session._1_Abstraction._2_By_AbstractClass;

public class _3_TestPage {

	public static void main(String[] args) {
		
		//_1_Page abs = new _1_Page();
		
		System.out.println("------------------------------");
		
		_2_LoginPage lp = new _2_LoginPage();
		lp.title(); // overridden method from abstract class
		lp.url(); // overridden method from abstract class
		lp.footerLinks(); // overridden method from abstract class
		lp.doLogin(); // special method from login page class
		lp.logo(); // overridden Non abstract method from LoginPage class
		lp.privacyPolicy(); // Non abstract final method from abstract class
		
		System.out.println("------------------------------");
		
		_1_Page p = new _2_LoginPage();
		p.title(); // overridden method from abstract class
		p.logo(); // overridden Non abstract method from abstract class
		p.privacyPolicy(); // Non abstract final method from abstract class
		//p.doLogin(); // Not allowed - special method from login page class
		
		System.out.println("------------------------------");
	}
}