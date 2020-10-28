package _8_Session._1_Constructors._2_WithConstructor;

public class _3_RegistrationTest {
	
	public static void main(String[] args) {
		
		_2_RegistrationPage reg = new _2_RegistrationPage();
		
		// Registering user with all fields
		_2_RegistrationPage reg1 = new _2_RegistrationPage("Harry", "Joe", 89564556, "harryjoe@test.com", 
				"123@Abc", "18, Hollywood Ave, LA", "01-01-1987", "LA-101-9090", "male", true, 8956);
		
		// Registering user with only mandatory fields
		_2_RegistrationPage reg2 = new _2_RegistrationPage("Jonny", "Mathew", 45784556, "jonnymathew@test.com", "123@Abc", 4578);
		
		System.out.println("-------------------------------------");
		
		reg1.doRegistrationWithAllFields();
		
		System.out.println("-------------------------------------");
		
		reg2.doRegistrationWithMindatoryFileds();
		
		System.out.println("-------------------------------------");
		
	}

}
