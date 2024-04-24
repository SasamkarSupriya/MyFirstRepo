package package1;

public class Employee {
	
	private long id;
	private String names;
	private double salary;
	
	
	
	public Employee(long id, String names, double salary) {
		super();
		this.id = id;
		this.names = names;
		this.salary = salary;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", names=" + names + ", salary=" + salary + "]";
	}
	public Object compareTo(Employee o2) {
		
		if(this.salary>o2.getSalary()) {
			return 1;
		}
		else {
			return -1;
		}
	}

	
}
