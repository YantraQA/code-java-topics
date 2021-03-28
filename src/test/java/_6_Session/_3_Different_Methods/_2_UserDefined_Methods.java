package _6_Session._3_Different_Methods;


public class _2_UserDefined_Methods {
	
	// 1. No input no return method -  
	// it doesn't take any input and doesn't return anything
	public void test()
	{
		System.out.println("test method");
	}

	// 2. No input some return function - 
	// this function doesn't take any input but return something
	// Example 1
	public String nameOfCountry()
	{
		String countryName = "India";
		return countryName;
	}
	// Example 2
	public String[] listOfStudents()
	{
		System.out.println("Student List - ");
		String names[] = new String[3];
		names[0] = "Tom";
		names[1] = "Harry";
		names[2] = "John";
		return names;
	}
	
	// 3. Some input with some return 
	// Example 1
	public int add(int a, int b)
	{	
		int c = a+b;
		return c;
	}
	// Example 2
	public String factoryName(String NameOfFactory)
	{
		if (NameOfFactory.equals("nike")) {
			String fact1 = "nike";
			System.out.println("This is nike factory");
			return fact1;
		}

		else if (NameOfFactory.equals("puma")) {
			String fact2 = "puma";
			System.out.println("This is puma factory");
			return fact2;
		}
		return "no factory within the criteria found";
	}

	// Example 3
	public String countryCapital(String NameOfCountry) {
		if (NameOfCountry.equals("india")) {
			return "New Delhi";
		}

		if (NameOfCountry.equals("usa")) {
			return "Washington DC";
		} else {
			return "no country found";
		}
	}



	// Calling above user defined methods to execute the actual logic
	public static void main(String[] args) {
	
		_2_UserDefined_Methods userDefMethods = new _2_UserDefined_Methods();
		System.out.println("----------------------------------------------");
		
		// Calling Test Method
		userDefMethods.test();
		System.out.println("----------------------------------------------");
		
		// Calling nameOfCountry method
		// First Way
		String countryName = userDefMethods.nameOfCountry();
		System.out.println("The country name is - "  + countryName);
		// Second Way
		System.out.println("The country name is - " + userDefMethods.nameOfCountry().toUpperCase());
		System.out.println("----------------------------------------------");
		
		// Calling listOfStudents method
		String[] listOfStd = userDefMethods.listOfStudents();
		for (int i = 0; i < listOfStd.length; i++) {
			System.out.println((i+1) + " " + listOfStd[i]);
		}
		System.out.println("----------------------------------------------");
		
		// Calling add method
		int total = userDefMethods.add(10, 30);
		System.out.println("The total is -> " + total);
		System.out.println("----------------------------------------------");
		
		// Calling factoryName method
		String outputFromFarctory = userDefMethods.factoryName("nike");
		System.out.println(outputFromFarctory);
		System.out.println("----------------------------------------------");
		
		// Calling countryCapital method
		String countryCap = userDefMethods.countryCapital("india");
		System.out.println(countryCap);
		System.out.println("----------------------------------------------");
	}

}
