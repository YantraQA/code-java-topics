package _8_Session._1_Constructors._1_WithoutConstructor;

public class _1_Employee {

	// class variables:
	String name;
	int age;
	String dept;
	int empId;
	static String compName = "Unicorn Systems";

	public static void main(String[] args) {

		// Assigning the values of class variables to the different object
		// for employee e1 and e2
		_1_Employee e1 = new _1_Employee();
		e1.name = "Tom";
		e1.age = 25;
		e1.dept = "QA";
		e1.empId = 101;
		
		_1_Employee e2 = new _1_Employee();
		e2.name = "Steve";
		e2.age = 30;
		e2.dept = "HR";
		e2.empId = 102;
		
		// Accessing the assigned values of the employee e1 and e2 
		System.out.println("Employee e1 details are -> ");
		System.out.println("Name: " + e1.name);
		System.out.println("Age: " + e1.age);
		System.out.println("Department: " + e1.dept);
		System.out.println("Employee ID: " + e1.empId);
		
		System.out.println("---------------------------");
		
		System.out.println("Employee e2 details are -> ");
		System.out.println("Name: " + e2.name);
		System.out.println("Age: " + e2.age);
		System.out.println("Department: " + e2.dept);
		System.out.println("Employee ID: " + e2.empId);
		
		System.out.println("---------------------------");
	}

}
