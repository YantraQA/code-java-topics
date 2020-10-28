package _8_Session._1_Constructors._2_WithConstructor;

public class _2_RegistrationPage {
	
	String firstName; 	// Mandatory filed
	String lastName;  	// Mandatory filed
	long phoneNumber; 	// Mandatory filed
	String emailId; 	// Mandatory filed
	String password;	// Mandatory filed
	String address;		// Non mandatory filed
	String dob;			// Non mandatory filed
	String dlNumber;	// Non mandatory filed
	String gender;		// Non mandatory filed
	boolean agelimit;	// Non mandatory filed
	int otp;			// Mandatory filed

	public _2_RegistrationPage() {
		System.out.println("Please pass some values...");
	}

	// with Mandatory + Non Mandatory fields
	public _2_RegistrationPage(String firstName, String lastName, long phoneNumber, String emailId, String password,
			String address, String dob, String dlNumber, String gender, boolean agelimit, int otp) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.password = password;
		this.address = address;
		this.dob = dob;
		this.dlNumber = dlNumber;
		this.gender = gender;
		this.agelimit = agelimit;
		this.otp = otp;
	}

	// with Mandatory only fields
	public _2_RegistrationPage(String firstName, String lastName, long phoneNumber, String emailId, String password,
			int otp) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.password = password;
		this.otp = otp;
	}

	public void doRegistrationWithAllFields() {
		System.out.println("processing registration with.....\n " + firstName + " and " + lastName + " and " + phoneNumber);
		System.out.println(" " + password + " and " + address + " and " + dob);
		System.out.println(" " + dlNumber + " and " + gender + " and " + agelimit);
		System.out.println(" " + otp);
	}
	
	public void doRegistrationWithMindatoryFileds() {
		System.out.println("processing registration with.....\n " + firstName + " and " + lastName + " and " + phoneNumber);
		System.out.println(" " + emailId + " and " + password + " and " + otp);
	}
	
	public void getOTP(){
		System.out.println(otp);
	}

}
