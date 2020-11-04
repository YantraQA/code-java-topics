package _11_Session._3_AccessModifier.Test;

import javax.sound.sampled.ReverbType;

import _11_Session._3_AccessModifier._1_Company;

public class _3_TestCompany_2 extends _1_Company {
		
	// for protected 
	public String changeCeoName()
	{
		ceoName = "Mr. Tom";
		return ceoName;
	}
	
	// for default
//	public void changeCompanyBranch()
//	{
//		companyBranchName = "Unicorn Systems NYC";
//	}
	
	// for private
//	public void changeRevenueOfCompany()
//	{
//		revenue = 10_000;
//	}
	
	// for public 
	public int chnageEmployeeCountOfCompany()
	{
		employeeCount = 250;
		return employeeCount;
	}
	
	public static void main(String[] args) {
		
		_3_TestCompany_2 comp = new _3_TestCompany_2();
		
		System.out.println("The changed ceo name of the company is -> " + comp.changeCeoName());
		
		System.out.println("The changed employee count of the company is -> " + comp.chnageEmployeeCountOfCompany());
		
	}
	
	

}
