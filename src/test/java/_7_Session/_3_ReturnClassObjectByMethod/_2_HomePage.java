package _7_Session._3_ReturnClassObjectByMethod;

public class _2_HomePage {
	
	public static void main(String[] args) {
		
		_1_SignInPage sip = new _1_SignInPage();
		
		_2_HomePage hp1 = sip.login("Tom", "test123");
		hp1.searchProduct("cellphone");
		hp1.addToCartProduct();
	}
	
	public void searchProduct(String productName)
	{
		System.out.println("Searching product in the inventory as " + productName + " .......");
	}
	
	public void addToCartProduct()
	{
		System.out.println("Adding product to the cart ...........");
	}

}
