package _5_Session._1_Object_Array;

public class _1_Object_Array {

	public static void main(String[] args) {


		// object static array:
		Object emp[] = new Object[5];
		emp[0] = "Tom"; 	// Name
		emp[1] = 25;		// Age
		emp[2] = 10000;		// Salary 
		emp[3] = 'm';		// gender
		emp[4] = true;		// Resident of India

		System.out.println("Employee Imformation as below - ");
		for (int m = 0; m < emp.length; m++) {
			System.out.print(m+1 + ". ");
			System.out.println(emp[m]);
		}
		System.out.println(emp[4]);

	}


}

