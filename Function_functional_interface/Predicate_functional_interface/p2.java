package Predicate_functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Stream Api
//public class p2 {
//public static void main(String[] args) {
//	List<String> data = Arrays.asList("Mike","mona","priya","starllin");
//	List<String> newData = data.stream().filter(s->s.equalsIgnoreCase("mike")).collect(Collectors.toList());
//	System.out.println(newData);
//	System.out.println(newData.size());
//}
//}

//greater than 3
//public class p2{
//	public static void main(String[] args) {
//		List<String> data = Arrays.asList("mike","starlin","tina","priya","mia");
//		List<String> newData = data.stream().filter(s->s.length()>3).collect(Collectors.toList());
//	    System.out.println(newData);
//	}
//	
//}

//Give me the salary where salary is greater than 5000
//public class p2{
//	public static void main(String[] args) {
//		List<Integer> salary = Arrays.asList(1000,2000,3000,6000,10000);
//		List<Integer> sal = salary.stream().filter(s->s>5000).collect(Collectors.toList());
//		System.out.println(sal);
//	}
//}

//Write a program to find how many times give word exits in a collection which is "mike
public class p2{
	public static void main(String[] args) {
		List<String> data = Arrays.asList("mike","adam","mike");
		List<String> newData = data.stream().filter(d->d.equals("mike")).collect(Collectors.toList());
		System.out.println(newData.size());//no of time mike occured in program
	}
}


