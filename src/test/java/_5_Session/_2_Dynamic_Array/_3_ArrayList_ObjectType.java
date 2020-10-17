package _5_Session._2_Dynamic_Array;

import java.util.ArrayList;

public class _3_ArrayList_ObjectType {

	public static void main(String[] args) {
		
		ArrayList<Object> employeeInf = new ArrayList<Object>();
		employeeInf.add("Tom");
		employeeInf.add('m');
		employeeInf.add(499);
		employeeInf.add(true);
		
		System.out.println("----------------------");
		System.out.println("After adding elements in the arraylist of Object type size is -> " + employeeInf.size());
		
		
		// Printing all values of arraylist
		System.out.println("Printing the all values form arraylist");
		for (int i = 0; i < employeeInf.size(); i++) {
			System.out.println(employeeInf.get(i));
		}	
		
		System.out.println("----------------------");
		// Removing all elements from the arraylist in one go
		employeeInf.clear();
		System.out.println("After using .clear() method on arraylist of Object type size is -> " + employeeInf.size());

	}
}
