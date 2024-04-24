import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AverageSalaryEmployee {

	public static void main(String[] args) {

		Address a = new Address("pune");
		Address a1 = new Address("buldhana");
		Address a2 = new Address("jalna");

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(1, "a", 10000, a));
		empList.add(new Employee(2, "b", 20000, a1));
		empList.add(new Employee(3, "c", 30000, a2));

		double avg = empList.stream().mapToDouble(Employee::getSalary).average().getAsDouble();

		System.out.println(avg);

		List list = empList.stream().filter(emp -> emp.getAddress().getCity() == "jalna").collect(Collectors.toList());

		System.out.println(list);

		empList.stream().mapToDouble(Employee::getSalary).average().getAsDouble();

		Optional<Double> i = empList.stream().map(s -> s.getSalary()).reduce(Double::max);
		Optional<Double> i1 = empList.stream().map(s -> s.getSalary()).max(Double::compare);

		System.out.println(i);

		List<Integer> nums = new ArrayList<>();
		nums.add(3);
		nums.add(6);

		nums.stream().max(Integer::compare).get();
	}

}
