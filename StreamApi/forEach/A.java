package StreamApi.forEach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
public static void main(String[] args) {
	List<Employee> data=Arrays.asList(
			new Employee(1,"smith",12000),
			new Employee(2,"starllin",5000),
			new Employee(3,"smay",10000));
	 List<EmployeeDto> dto = data.stream().map(e->e.convertToDto(e)).collect(Collectors.toList());
	 for(EmployeeDto d:dto) {
		 System.out.println(d.getId());
		 System.out.println(d.getName());
		 System.out.println(d.getSalary());
	 }
}


}
