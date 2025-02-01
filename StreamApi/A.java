package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Give me those employee who's salary is greater than 5000
//public class A {
//public static void main(String[] args) {
//	List<Employee> employee = Arrays.asList(
//			new Employee(2 , "mike" , 6000),
//			new Employee(1,"stallin",7000),
//			new Employee(3,"adam",5000)
//			);
//	List<Employee> newEmployee = employee.stream().filter(e->e.getSalary()>5000).collect(Collectors.toList());
//	for(Employee employees :newEmployee) {
//		System.out.println(employees.getId());
//		System.out.println(employees.getName());
//		System.out.println(employees.getSalary());
//		
//	}
//}
//}

//Give me those employee object name of the employee is "mike"

public class A{
	public static void main(String[] args) {
		List<Employee> employee = Arrays.asList(
				new Employee(1,"mike",7000),
				new Employee(2,"starllin",2000),
				new Employee(3,"mike",3000)
				);
		List<Employee> newEmployee = employee.stream().filter(e->e.getName().equals("mike")).collect(Collectors.toList());
		for(Employee employees:newEmployee) {
			System.out.println(employees.getId());
			System.out.println(employees.getName());
			System.out.println(employees.getSalary());
		}
	}
}
