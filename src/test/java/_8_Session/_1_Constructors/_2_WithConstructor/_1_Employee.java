package _8_Session._1_Constructors._2_WithConstructor;

public class _1_Employee {

	// class vars:
	String name;
	int age;
	String dept;
	int empId;
	static String compName = "Unicorn Systems";

	// Constructors is the mechanism called when an object of a class got created
	// Points to be noted - 1. It has no return type
	//						2. It has same name of the class name
	// 						3. If no constructor is provided by user java creates it
	// 						4. Types of  constructors: 	1. User defined Default constructor
	//													2. User defined constructor (parameterized or non parameterized)
	//						5. Constructor can be overloaded with different parameters

	public _1_Employee() // 0 parameter
	{ 
		System.out.println("default const...");
	}

	public _1_Employee(int i) // 1 parameter integer type
	{ 
		System.out.println("one param const..." + i);
	}

	public _1_Employee(String s) // 1 parameter String type
	{ 
		System.out.println("one param const..." + s);
	}

	// create parameterized constructor with all class variables initialized
	public _1_Employee(String name, int age, String dept, int empId) {
		// name = name; // this line has no effect 
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.empId = empId;
	}

	// created parameterized constructor with only two class variables initialized
	public _1_Employee(String name, int empId) {
		this.name = name;
		this.empId = empId;
	}

	public static void main(String[] args) {


		System.out.println("Calling zero pparameter constructor");
		_1_Employee e0 = new _1_Employee();
		System.out.println("-----------------------------------");
		
		System.out.println("Calling One pparameter constructor int type");
		_1_Employee e1 = new _1_Employee(10);
		System.out.println("-----------------------------------");
		
		System.out.println("Calling One pparameter constructor String type");
		_1_Employee e2 = new _1_Employee("Thomas");
		System.out.println("-----------------------------------");

		_1_Employee e3 = new _1_Employee("Jeff", 35, "Admin", 102);
		_1_Employee e4 = new _1_Employee("Harry", 25, "QA", 103);
		_1_Employee e5 = new _1_Employee("Louis", 45, "Dev", 104);

		System.out.println("-----------------------------------");
		System.out.println(e3.name + " " + e3.age + " " + e3.dept + " " + e3.empId + " " + _1_Employee.compName);
		System.out.println(e4.name + " " + e4.age + " " + e4.dept + " " + e4.empId + " " + _1_Employee.compName);
		System.out.println(e5.name + " " + e5.age + " " + e5.dept + " " + e5.empId + " " + _1_Employee.compName);
		System.out.println("-----------------------------------");

	}

}
