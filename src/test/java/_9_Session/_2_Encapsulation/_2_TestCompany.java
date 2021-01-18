package _9_Session._2_Encapsulation;

public class _2_TestCompany {

	public static void main(String[] args) {
		
		_1_Company comp = new _1_Company();
		
		System.out.println(comp.name);
		System.out.println(comp.EmpCount);
		System.out.println(comp.logo);
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		comp.setName("Alphabet Corporation");
		System.out.println("Company Name is - ");
		System.out.println(comp.getName());
		
		System.out.println("-----------------------------------");
		
		comp.setLogo("src=\"https://www.alphabet.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png\"");
		System.out.println("Company Logo Url is - ");
		System.out.println(comp.getLogo());
		
		System.out.println("-----------------------------------");
		
		comp.setEmpCount(1000);
		System.out.println("Company Employee capacity is - ");
		System.out.println(comp.getEmpCount());
		
		System.out.println("-----------------------------------");
		
		comp.setEngine("google");
		System.out.println("Company is using search engine as - ");
		System.out.println(comp.getEngine());
		
		System.out.println("-----------------------------------");
		
		comp.setRevenue(1_00_00_000); //10000000
		System.out.println("Company's yearly revenue is - ");
		System.out.println(comp.getRevenue());
		
		System.out.println("--------------------------------------------------------------------------------------");
		

	}

}
