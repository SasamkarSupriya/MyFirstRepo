import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeImplementation {

	public static void main(String[] args) {
	
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(1,"supriya",2000d));
		list.add(new Employee(2,"rahul",3000d));
		list.add(new Employee(3,"ashwini",1000d));
		list.add(new Employee(4,"kamal",8000d));
		
				
		
		
	List<Employee> result = list.stream().sorted((e1,e2) -> (int)e1.getSalary()-(int)e2.getSalary()).collect(Collectors.toList());
    System.out.println(result);
    
   // list.stream().sorted((e1,e2) -> (Integer.valueOf(e1.getName()) - Integer.valueOf(e2.getName()))).forEach(System.out::print);
    
    
    Map<String, Employee> map = new HashMap();
    
    map.put("a", new Employee(1,"supriya",2000d));
    map.put("b", new Employee(2,"rahul",3000d));
    map.put("c", new Employee(3,"ashwini",4000d));
    
    List lit = map.entrySet().stream()
    .filter(a->a.getValue().getName()=="supriya")
    .collect(Collectors.toList());
    
    System.out.println(lit);
    
	}

}
