package _6_Session._1_Default_Values;

public class _1_DefaultValues
{ 	
	public static String str;
	public static int i;
	public static double d;
	public static boolean b;
	public static char c;
	public static byte z;
	
	
	public static void main(String[] args)
	{	
		System.out.println(str); 
		System.out.println(i); 
		System.out.println(d); 
		System.out.println(b); 
		System.out.println(c); 
		System.out.println(z); 
				
		System.out.println("--------------------------------------");
		
		//int p; // only variable declared without initialing value
		//System.out.println(p); // this will show an error as the variable p is local to main method and
		
		//value for it has to be declared.
		int div1 = 9/3;
		System.out.println(div1);
		int div2 = 0/3;
		System.out.println(div2);
//		int div3 = 9/0; 
//		System.out.println(div3);
				
	}
}

