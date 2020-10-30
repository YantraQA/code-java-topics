package _9_Session._2_Encapsulation;

public class _2_TestCompany {

	public static void main(String[] args) {
		
		_1_Company comp = new _1_Company();
		
		System.out.println(comp.name);
		System.out.println(comp.EmpCount);
		System.out.println(comp.logo);
		
		
		comp.setEngine("google");
		
		System.out.println(comp.getEngine());
		
		comp.setEmpCount(1000);
		System.out.println(comp.getEmpCount());

	}

}
