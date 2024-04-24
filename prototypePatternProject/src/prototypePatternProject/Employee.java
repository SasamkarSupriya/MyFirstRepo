package prototypePatternProject;



public class Employee implements Cloneable{

	public int id;
	public String empName;
	private String companyName;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", companyName=" + companyName + "]";
	}
	
}
