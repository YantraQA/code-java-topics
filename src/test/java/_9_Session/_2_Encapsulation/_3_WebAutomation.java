package _9_Session._2_Encapsulation;

public class _3_WebAutomation {
	
	public void launchBrowser() {
		interactWithBrowser();
	}

	private void interactWithBrowser() {
		checkBrowserCompatibility();
	}

	private void checkBrowserCompatibility() {
		checkBrowserVersion();
	}

	private void checkBrowserVersion() {
		checkBrowserWithOS();
	}

	private void checkBrowserWithOS() {
		System.out.println("launching the browser......");
	}

}
