package _5_Session._3_Data_Conversion;

public class _1_Wrapper_Classes {

	public static void main(String[] args) 
	{

		// To convert data from one data type to another
		
		// 1. String to Integer 
		System.out.println("String to Integer");
		String x = "100";
		System.out.println(x+10); // 10010
		int i = Integer.parseInt(x); // converting string to int
		System.out.println(i+10); // 110
		System.out.println("------------------");
		
		// 2. Integer to String
		System.out.println("Integer to String");
		int q = 10; 
		System.out.println(q+5); // 15
		String s = String.valueOf(q);
		System.out.println(s+5); // 1015
		System.out.println("------------------");
		
		// 3. String to Double
		System.out.println("String to Double");
		String b = "12.33";
		double d = Double.parseDouble(b); // Converting String to double
		System.out.println(d+10.00);
		System.out.println("------------------");
		
		// Exmaple - 
//		String g = "$156";
//		int h = Integer.parseInt(g); // it will throw NumberFormatException
//		System.out.println(h);
		
		// Remove foreign characters while conversion String to integer
		// Approach 1 - ex amount = "$456"
		String amount1 = "$456";
		String temp1 = amount1.replace("$", "");
		int planeAmount1 = Integer.parseInt(temp1);
		System.out.println(planeAmount1 + 20);
		
		// Approach 2 - ex amount = "$456/-"
		String amount2 = "$456/-";
		String temp2 = amount2.substring(1,4);
		System.out.println("temp 2 " + temp2);
		int planeAmount2 = Integer.parseInt(temp2);
		System.out.println(planeAmount2 + 20);
		
		// Approach 3 - ex amount = "$4,567,75/-"
		String amount3 = "$4,567,75/-";
		String temp3 = amount3.replaceAll("[^0-9]", "");
		int planeAmount3 = Integer.parseInt(temp3);
		System.out.println(planeAmount3 + 20);
	}

}
