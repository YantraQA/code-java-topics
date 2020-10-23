package _7_Session._2_Overloading;

public class _2_SearchProduct {

	public void search(String product) {
		System.out.println("Product Search with Product Name");
	}

	public void search(String product, int price) {
		System.out.println("Product Search with Product Name and Price");
	}

	public void search(String product, int price, String seller) {
		System.out.println("Product Search with Product Name, Price and Seller Name");
	}

	public void payment(long CCNumber) {
		System.out.println("Payment With Credit Card Number");
	}

	public void payment(long CCNumber, int pin) {
		System.out.println("Payment With Credit Card Number and Pin");
	}

	public void payment(long CCNumber, int pin, String cardHolderName) {
		System.out.println("Payment With Credit Card Number, Pin and Card Holder Name");
	}
	

	public static void main(String[] args) {
		
		System.out.println("------------------------------------");

		_2_SearchProduct productSearch = new _2_SearchProduct();
		productSearch.search("Laptop");
		productSearch.search("Laptop", 500);
		productSearch.search("Laptop", 500, "Unicorn Enterprise");
		
		System.out.println("------------------------------------");
		
		_2_SearchProduct makePayment = new _2_SearchProduct();
		makePayment.payment(451245565);
		makePayment.payment(451245565, 4589);
		makePayment.payment(451245565, 4589, "Tom Peter");
		
		System.out.println("------------------------------------");
		
	}

	

}
