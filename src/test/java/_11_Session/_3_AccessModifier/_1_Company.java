package _11_Session._3_AccessModifier;

public class _1_Company {
	
	private int revenue = 50_000;
	protected String ceoName = "Mr. Thomas";
	String companyBranchName = "Unicorn Systems Berlin"; // this is default variable without keyword
	public int employeeCount = 300; 
	
	public static void main(String[] args) {
		
		_1_Company comp = new _1_Company();
		
		System.out.println("Compnay Revenue is -> " + comp.revenue);
		System.out.println("Compnay CEO name is -> " + comp.ceoName);
		System.out.println("Compnay branch name is -> " + comp.companyBranchName);
		System.out.println("Compnay employee count is -> " + comp.employeeCount);
		
		
	}

}
