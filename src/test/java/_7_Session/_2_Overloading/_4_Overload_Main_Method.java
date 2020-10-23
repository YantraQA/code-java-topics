package _7_Session._2_Overloading;

public class _4_Overload_Main_Method {
	
	public static void main(String []a) {
		System.out.println("Hey");
		
		main(10);
		main(10, 20);
	
	}
	
	public static void main(int p) {
		System.out.println("Hey hi " + p);

	}
	
	public static void main(int p, int q) {
		System.out.println("Hey bye" + p + q);

	}

}
