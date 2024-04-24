package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmployeeImpl {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1,"asha",120));
		list.add(new Employee(2,"supriya",180));
		list.add(new Employee(3,"pravin",140));
		list.add(new Employee(4,"ravi",10));
		
		// descending order
		List < Employee > employeesSortedList1 = list.stream()
	            .sorted((o1, o2) -> (int)(o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
	        System.out.println(employeesSortedList1);
		
//--------------------------------------------------------------------------------------------------
		List < Employee > employeesSortedList2 = list.stream()
	            .sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList()); //ascending order
	        System.out.println(employeesSortedList2);
	
	        
//--------------------------------------------------------------------------------------------------	
	        
	      OptionalDouble d =  list.stream().mapToDouble(e->e.getSalary()).average();
	        
	        System.out.println(d);
	        
	        
		Comparator<Employee> cmp = new Comparator<Employee>()
		
		{

	        @Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getSalary()>o2.getSalary()) {
				return 1;
				}
				else {
					return -1;
				}
	        }
	        };
	
         Collections.sort(list,cmp);
         
         for(Employee e : list) {
        	 System.out.println(e);
        	 
         }
	
	}
}
