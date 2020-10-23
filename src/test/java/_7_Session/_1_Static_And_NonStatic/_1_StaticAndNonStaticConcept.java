package _7_Session._1_Static_And_NonStatic;

public class _1_StaticAndNonStaticConcept {
	
	String name;
	static int age = 25;
	
	public void getName() {
		System.out.println("get name");
	}
	
	public static void getStart() {
		System.out.println("get start");
	}

	public static void main(String[] args) {

		// 1. how to call static data members: variables and methods
		// no need to create the object
		// a. call them directly
		System.out.println("1.-------------- Calling Static Data Members without creation object -------------------");
		getStart();
		System.out.println(age);
		System.out.println("----------------------------------------------------------------------------------------");
		
		// b. call them by class name:
		System.out.println("2.-------- Calling Static Data Members without creation object with class name ---------");
		_1_StaticAndNonStaticConcept.getStart();
		System.out.println(_1_StaticAndNonStaticConcept.age);
		System.out.println("----------------------------------------------------------------------------------------");
		
		// 2. how to call non static data members: variables and methods:
		// you have to create the object
		System.out.println("3.---------------- Calling Non Static Data Members with creation object ----------------");
		_1_StaticAndNonStaticConcept obj = new _1_StaticAndNonStaticConcept();
		obj.getName();
		obj.name = "Steve";
		System.out.println(obj.name);
		System.out.println("----------------------------------------------------------------------------------------");
		
		// Question: can i access static variables and methods by object:
		System.out.println("4.----------------- Calling Static Data Members with obj refernece  --------------------");
		obj.getStart();
		System.out.println(obj.age);
		System.out.println("----------------------------------------------------------------------------------------");
		
		//can I create the object wihout any reference?
		System.out.println("5.----------- Creating an object without object reference and calling method -----------");
		new _1_StaticAndNonStaticConcept().getName();
		System.out.println(new _1_StaticAndNonStaticConcept().name = "Tom");
		System.out.println("----------------------------------------------------------------------------------------");
		
		System.out.println("6.----------- Creating an object And making its reference null ------------- -----------");
		_1_StaticAndNonStaticConcept obj1 = new _1_StaticAndNonStaticConcept();
		//obj1.getName();
		//obj1=null;
		//obj1.getName(); // this line will throw java.lang.NullPointerException exception

	}

}
