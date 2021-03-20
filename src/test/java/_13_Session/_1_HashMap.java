package _13_Session;

import java.util.HashMap;
import java.util.Map;

public class _1_HashMap {

	public static void main(String[] args) {

		// HashMap 
		// It stores values in the from of Key & Value
		// Ex - String & String, String & Integer, Integer & String
		// HashMap dosen't store the values on the basis of indexes

		// Declaration 
		//HashMap<String,String> credentials = new HashMap<String,String>();

		// Or Can be Declared as - Using Upcasting
		Map<String, String> credentials = new HashMap<String,String>();

		// Adding values to decleared HashMap
		credentials.put("Admin", "Tom");
		credentials.put("Manager", "John");
		credentials.put("enduser", "Steve");

		// Checking the size of the HashMap
		System.out.println("The size of HashMap is : " + credentials.size());

		// Fetching the Values from HashMap
		// The HashMap values could printed on cosole in random order as its not index based
		
		for (Map.Entry e : credentials.entrySet()) 
		{
			System.out.println(e.getKey() + "\t" + e.getValue());
		}

		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("------------------- Replacing one of the value from HashMap accessing the key--------------------------");
		
		// Replacing the value from HashMap
		credentials.replace("Manager", "Mark");

		// Fetching again the Values from HashMap
		// The Hashmap values could printed on cosole in random order as its not index based
		for (Map.Entry e : credentials.entrySet()) 
		{
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		// Checking a specific key available in HashMap
		System.out.println("Is current Credentials HashMap contains key as \"enduser\" : " + credentials.containsKey("enduser"));
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		// Checking a specific value available in HashMap 
		System.out.println("Is current Credentials HashMap contains value as \"Tom\" : " + credentials.containsValue("Tom"));

		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		// Checking is HashMap is empty
		System.out.println("Is the current credentials HashMap is empty : " + credentials.isEmpty());
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		// Removing a Key Value pair form HashMap
		credentials.remove("enduser", "Steve");
		for (Map.Entry e : credentials.entrySet()) 
		{
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
	}

}
