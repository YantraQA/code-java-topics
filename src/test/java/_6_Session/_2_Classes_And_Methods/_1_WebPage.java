package _6_Session._2_Classes_And_Methods;

public class _1_WebPage {

	//	1. All the code we write in java is inside class. 
	//	Class is a template where we write our logic, similar to the kind of 
	//	things/logic we will write in the same class. 
	
	//	2. An object is an entity that comes from class.
	//	And when we create an object of this class we will have all the data members with each object.

	
	String title = "Welcome to BestGoods";
	String url = "https://www.bestgoods.com";
	String header = "bestgoods.com: Online Shopping - Buy mobiles, laptops, cameras, books, "
					+ "watches, apparel, shoes and e-Gift Cards. Free Shipping & Cash on Delivery Available.";
	String logoImage = "https://www.bestgoods.com/images/logo";

	// Non Static Methods
	public void topPannel() {
		// logic
		System.out.println("---------------- topPannel Start ------------------");
		System.out.println(url);
		System.out.println("This is a top pannel of the webpage");
		System.out.println(title);
		System.out.println(logoImage);
		System.out.println("----------------topPannel End ---------------------");
	}

	public void footerLinks() {
		// logic
		System.out.println("---------------- footerLinks Start ----------------");
		System.out.println("Footer Link 1");
		System.out.println("Footer Link 2");
		System.out.println("Footer Link 3");	
		System.out.println("---------------- footerLinks End ------------------");
	}

	
	public void centerPannel() {
		// logic
		System.out.println("---------------- centerPannel Start ---------------");
		System.out.println("Mobiles");
		System.out.println("Laptop");
		System.out.println("Books");
		System.out.println("Camera");
		System.out.println("---------------- centerPannel End -----------------");
	}

	public static void privacyPolicy() {
		// logic
		System.out.println("---------------- privacyPolicy Start --------------");
		System.out.println("About BestGoods Business");
		System.out.println("BestGoods Vendors");
		System.out.println("Privacy Notice");
		System.out.println("---------------- privacyPolicy End ----------------");
	}
	
	
	public static void main(String[] args) {
		
		_1_WebPage xc = new _1_WebPage();
		xc.topPannel();
		//xc.privacyPolicy();
		privacyPolicy();
		_1_WebPage.privacyPolicy();
		
	}
}
