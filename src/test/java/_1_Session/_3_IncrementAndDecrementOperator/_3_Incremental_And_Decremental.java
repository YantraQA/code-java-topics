package _1_Session._3_IncrementAndDecrementOperator;

public class _3_Incremental_And_Decremental {

	public static void main(String[] args) {
		
		// ++ and --
//		int a = 1;
//		a = a+1;
//		System.out.println(a);
		
		System.out.println("*********** pre increment **********");
		int i = 1;
		int j = ++i; //pre increment
		System.out.println(i); // 2
		System.out.println(j); // 2

		System.out.println("*********** post increment **********");
		int p = 1;
		int q = p++; //post increment
		System.out.println(p); // 2
		System.out.println(q); // 1

		System.out.println("*********** pre decrement **********");
		int m = 2;
		int n = --m; //pre decrement
		System.out.println(m); // 1 
		System.out.println(n); // 1 

		System.out.println("*********** post decrement **********");
		int c = 0;
		int d = c--;
		System.out.println(c); // -1
		System.out.println(d); // 0

		int f = -1;
		int g = --f;
		System.out.println(f); // -2  
		System.out.println(g); // -2  
		
		char abc = 'A';
		System.out.println(++A); // B 

	}

}
