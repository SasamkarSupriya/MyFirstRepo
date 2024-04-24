package prototypePatternProject;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setCompanyName("cognizant");
		emp.setEmpName("supriya");
		
		System.out.println(emp);
			
		Employee cloneEmp = (Employee)emp.clone();
		
		
		System.out.println(cloneEmp);
		
	}

}
