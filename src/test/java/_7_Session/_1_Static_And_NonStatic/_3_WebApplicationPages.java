package _7_Session._1_Static_And_NonStatic;

public class _3_WebApplicationPages {

	// data members of the class: class vars, class methods
	String title;
	String url;
	String header;
	static String logo = "http://www.aws3.amazon.com/images/logo.png";

	public void topPanel() {
		System.out.println("Top panel");
	}

	public void leftPanel() {
		System.out.println("leftPanel");

	}

	public void footerLinks() {
		System.out.println("footerLinks");

	}

	public static void privacyPolicy() {
		System.out.println("privacyPolicy");
	}

	public static void main(String[] args) {

		_3_WebApplicationPages p1 = new _3_WebApplicationPages();
		_3_WebApplicationPages p2 = new _3_WebApplicationPages();
		_3_WebApplicationPages p3 = new _3_WebApplicationPages();
		

		// Assigning the values for Login page
		p1.title = "LoginPage";
		p1.header = "Login to app";
		p1.url = "http://abc.com/login";
		System.out.println("-----------------------------------------------");

		// Assigning the values for Home page
		p2.title = "HomePage";
		p2.header = "Welcome to Home Page";
		p2.url = "http://abc.com/home";

		System.out.println("------------- WebPage for Login --------------");
		System.out.println(p1.title + " | " + p1.header + " | " + p1.url);
		p1.leftPanel();
		p1.topPanel();
		p1.footerLinks();
		System.out.println("Logo -> "+_3_WebApplicationPages.logo);
		_3_WebApplicationPages.privacyPolicy();
		System.out.println("----------------------------------------------");
		
		System.out.println("---------- WebPage for after login -----------");
		System.out.println(p2.title + " | " + p2.header + " | " + p2.url);
		p2.leftPanel();
		p2.topPanel();
		p2.footerLinks();
		System.out.println("Logo -> "+_3_WebApplicationPages.logo);
		_3_WebApplicationPages.privacyPolicy();
		System.out.println("----------------------------------------------");

		//System.out.println(p3.header); // This will print default String value as null 
		
		System.out.println("----------------------------------------------");

	}

}
