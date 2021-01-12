package _4_Session._1_Array;

public class _1_Array_In_Java {

	public static void main(String[] args) {
		
		// Array are used to store the same kind of variable with a single name. 
		// Also to save similar data we don't have to maintain unnecessary different variables 
		// with different names.
		
		// Example
		int i = 10; 
		i = 20;
		int j = 30;
		//int k = 40;
		System.out.println("Value of i is " + i);
		System.out.println(i);
		// the value of i is getting overridden 
		// here is a problem if I want to store 10 and 20 and don't want to maintain a new variable.

		System.out.println("----------------------------------------------------");
		
		// Ways of declaration for Array
		//  Example - 1
		int[] q = new int[4]; // 0 1 2 3
		
		int x[] = new int[3]; // 0 1 2
		// or 
		int []y = new int[3]; 
		// or 
		int z[] = {10,20,30}; 
		// 0   1  2
		// 10 20 30
		
		// Here Index number starting from 0 to 2 and length of array is 3 i.e for 0 to 2
		// Note - The "new" keyword is to create data space into an array and not like to create objects with new keyword.
		
		x[0] = 10; // filling 10 int value at 0th index
		x[1] = 20; // filling 20 int value at 1st index
		x[2] = 50; // filling 50 int value at 2nd index
		//x[3] = 99;
		// Access the values from the array
		System.out.println(x[2]); // O/P - 50 // accessing data from 2nd index form the array
		//System.out.println(x[5]); // O/P - java.lang.ArrayIndexOutOfBoundsException as there is no such index for i array
		System.out.println(x.length); // O/P  - 3 the .length is a method used to calculate the length of an array.
		System.out.println(x[1]+x[2]); // O/P - 70
		
		System.out.println("----------------------------------------------------");
		
		// To print all/specific the values from array
		for(int k=0; k<x.length; k++) // if we write k<=i.length then after printing 10 20 50 it will throw exception
		// for(int k=0; k<=x.length-1; k++) // can be used also
		{
			System.out.println(x[k]);
			if(x[k]==20)
			{
				System.out.println("The value 20 found in the array at index no -> " + k);
			}	
		}

		System.out.println("----------------------------------------------------");
		
		// Example - 2 
		double k1[] = new double[5];
		k1[0] = 12.33;
		k1[1] = 45.56;
		// k1[2] = 45.56;
		k1[3] = 50; // can be stored as double can store int // 50.00
		k1[4]  = 99.78;
		//k1[7] = 66.45; // at this line compiler won’t show any error but it will throw a runtime exception when code is 
		//executed either we print the value or not in both conditions
		
		System.out.println(k1[0]);
		System.out.println(k1[2]); // O/P - 0.00 as we haven’t stored any value at 2nd index so default value is printed.
		// System.out.println(k1[7]); // this will throw java.lang.ArrayIndexOutOfBoundsException

		System.out.println("----------------------------------------------------");
		
		// Example - 3
		String browsers[] = new String[4];
		browsers[0] = "chrome";
		browsers[1] = "opera";
		browsers[2] = "firefox";
		//browsers[3] = "ie";
		browsers[3] = "safari";
		
		for(int row=0; row<browsers.length; row++)
		{
			System.out.println(browsers[row]);
			
			if(browsers[row].equals("chrome"))
			{
					System.out.println("Launch chrome…...");
			}
			else if(browsers[row].equals("opera"))
			{
					System.out.println("Launch opera....");
			}
			else if(browsers[row].equals("firefox"))
			{
					System.out.println("Launch firefox....");
			}
			else if(browsers[row].equals("ie"))
			{
					System.out.println("Launch ie.....");
			}
			else
			{
					System.out.println("No browser matches, enter the correct value");
			}
		}


		System.out.println("----------------------------------------------------");
//		
//		// Summary of topic 
//		// Exceptions in array comes? -> - ArrayIndexOutOfBoundException
//		// .length used to check the length of the array 
//		// Array will store data in form of indexes
//		// Array can be declared in many types
//		// While comparing primitive data types in array use == operator and for not primitive data types comparison use .equals method
//
//		// Limitation of Arrays
//		// 1. Suppose we have to store some kind of data like student name information,
//		// employee name and we have to use an array then we have to either declare the array 
//		// size more then extra memory allocation happens and vice versa.
//		// 2. Size of array is fixed once it's created so we use arraylist to overcome this problem
//		// 3. Similar kind of data has to be stored in Array - We can use Object Array or ArrayList, 
//		// but still in object array the size is fixed.(Object is super class of all classes)
//		// 4. Object array or normal array is used in real time applications where the data size is fixed 
//		// ex- days in week, months, dates in month. Object Array ex - Employee information with Name, DOB, EmpId, EmpDept
//		// 5. Garbage collector dont remove the excess space which is unused by the huge array sizes, 
//		// Gc will only removes objects which are unused

		System.out.println("----------------------------------------------------");
		Object emp[] = new Object[5];
		emp[0] = "Tom"; // name
		emp[1] = 25; // age
		emp[2] = 499; // salary in dollars
		emp[3] = true; // resident of india
		emp[4] = 'm'; // gender
		//emp[5] = false; // having A OWN SYSTEM
		for(int a=0; a<emp.length; a++)
		{
		System.out.println(emp[a]);
		}
	
//		// In the above example 
//		// it will print all information about the employee. 
//		// What if the parameters like having a laptop, contract type, etc then again we have to increase the size of the array. 
//
//		// So we can use these array and Object array where the parameters and size of data is permanent type or fixed type. 
//		// Ex - days in a week, months, 
//		// Number of branches of a company, 
//		// departments of the companies, 
//		// number of subjects in a semester, 
//		// flat numbers in an apartment.
//
//		//Note - 
//		// 1. if we don’t add the values in the array and try to print it then the default value of the data type will get printed.
//		// 2. New keyword in arrays is used to allocate memory not for creation of object (in array context).
//		
//		


	}

}
