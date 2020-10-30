package _9_Session._2_Encapsulation;

public class _1_Company {
	
	public String name;
	public String logo;
	public int EmpCount;
	private String searchEngine;
	private int revenue;

	// getter and setter:

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public int getEmpCount() {
		return EmpCount;
	}

	public void setEmpCount(int empCount) {
		EmpCount = empCount;
	}

	public String getEngine() {
		return searchEngine;
	}

	public void setEngine(String searchEngine) {
		this.searchEngine = searchEngine;
	}

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}

}
