package _6_Session._2_Classes_And_Methods;

public class _2_WebPageExecution {

	public static void main(String[] args) {
		
		// Creating the object of an _1_WebPage Class
		_1_WebPage webpage = new _1_WebPage();
		
		// Calling non static methods from _1_WebPage class for execution of the logic
		webpage.topPannel();
		webpage.footerLinks();
		webpage.centerPannel();	
		//webpage.privacyPolicy();
			
		// Calling static methods from _1_WebPage class for execution of the logic
		_1_WebPage.privacyPolicy();
		

	}

}
