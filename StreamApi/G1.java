package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//Group object based on salary
//public class G1 {
//	public static void main(String[] args) {
//		List<Employee> data = Arrays.asList(new Employee(1, "mike", 6000), new Employee(2, "starllin", 5000),
//				new Employee(3, "smith", 7000), new Employee(4, "adam", 5000));
//		Map<Integer, List<Employee>> newData = data.stream().collect(Collectors.groupingBy(e -> e.getSalary()));
//		// Map<Integer>,List<Employee>>
//		// newData=data.stream().collect(Collectors.groupingBy(Employee::getSalary));//method----
//		//-- reference alternative way to write only use in method
//		System.out.println(newData);
//		// System.out.println(newData.keySet());
//		Set<Integer> keys = newData.keySet();
//		for (int key : keys) {
//			List<Employee> newList = newData.get(key);
//			System.out.println("______" + key + "_____");
//			for (Employee e : newList) {
//				System.out.println(e.getId());
//				System.out.println(e.getName());
//				System.out.println(e.getSalary());
//			}
//			System.out.println("_______");
//		}
//	}
//}

public class G1{
	public static void main(String[] args) {
		List<Employee> data = Arrays.asList(
				new Employee(1,"mike",5000),
				new Employee(2,"starllin",6000),
				new Employee(3,"adam",5000)
				);
		 Map<String, List<Employee>> newData = data.stream().collect(Collectors.groupingBy(e->e.getName()));
		System.out.println(newData);
	
			
	}
}

