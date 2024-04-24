package package2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class EmployeeImpl {

	public static void main(String[] args) {

List<Employee> employeeList = new ArrayList<Employee>();
         
employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 40000.0));


Optional<Employee> l0 = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
System.out.println(l0);

//How many male and female are there in organization
employeeList.stream().filter(s->s.getGender()=="Female").collect(Collectors.toList()).forEach(System.out::println);;
Map<Object, Long> map = employeeList.stream().map(s->s.gender).collect(Collectors.groupingBy(s->s, Collectors.counting()));
//System.out.println(map);
Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    System.out.println("============================");
    
    
//print the name of all departments in the organization
employeeList.stream().map(emp ->emp.getDepartment()).distinct().collect(Collectors.toList()).forEach(System.out::println);
Map<String, Long> map1 = employeeList.stream().map(em->em.getDepartment()).collect(Collectors.groupingBy(a->a,Collectors.counting()));
//System.out.println(map1);
System.out.println("============================");


//what is the average age of male and female employee
Map<String, Double> map2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
//System.out.println(map2);
System.out.println("============================");


//get the details of highest paid employee
Double i = employeeList.stream().map(emp1->emp1.getSalary()).reduce(Double::max).get();
System.out.println("highest paid salary::::"+i);
Optional<Employee> high = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));  

Optional<Employee> low = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));

System.out.println("lowww:::"+low);

Employee highestPaidEmployee = high.get();
System.out.println(highestPaidEmployee);
System.out.println("============================");


//get the names of all employee who have joined after 2015
List list = employeeList.stream().filter(emp2->emp2.getYearOfJoining()>2015).map(s->s.getName()).collect(Collectors.toList());
//System.out.println("name::::"+list);
System.out.println("============================");
//count the no of employees of each departments
Map<String, Long> l = employeeList.stream().collect(Collectors.groupingBy(a->a.getDepartment(),Collectors.counting()));
for (Entry entry : l.entrySet())
{
    System.out.println(entry.getKey()+" : "+entry.getValue());
}

System.out.println("============================");
//what is average salary of each department?
Map<Object, Double> d = employeeList.stream().collect(Collectors.groupingBy(s->s.getDepartment(), Collectors.averagingDouble(a->a.salary)));
//System.out.println("average salary:::"+d);

System.out.println("============================");
//get the youngest male employee in the product development department
Optional<Employee> yo = employeeList.stream().filter(e->e.getDepartment()=="Product Development" && e.gender=="Male").min(Comparator.comparingInt(Employee::getAge));
//System.out.println(yo);

System.out.println("============================");
//who has most working experience in the organization

//employeeList.stream().
	
	
	
	
	
	
	
	
	
	}

}
