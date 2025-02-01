package Function_functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//with Stream API
//public class F1 {
//public static void main(String[] args) {
//	List<Integer> data = Arrays.asList(10,20,13,20,21);
//	List<Integer> newData = data.stream().map(x->x*x).collect(Collectors.toList());
//	System.out.println(newData);
//}
//}
//String convert in to upperCase

//public class F1{
//	public static void main(String[] args) {
//		List<String> data = Arrays.asList("mike","starllin","adam");
//		List<String> newData = data.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
//		System.out.println(newData);
//	}
//}
//Extra question in stream Api
//Sorting with DataStucture
//public class F1{
//	public static void main(String[] args) {
//		List<String> data = Arrays.asList("mike","starllin","adam","ban");
//		List<String> newData = data.stream().sorted().collect(Collectors.toList());
//		System.out.println(newData);
//	}
//}

//public class F1{
//	public static void main(String[] args) {
//		List<Integer> data = Arrays.asList(10,4,20,30,11,22);
//		List<Integer> newData = data.stream().sorted().collect(Collectors.toList());
//		System.out.println(newData);
//	}
//}

//remove duplicate element
public class F1{
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(10,20,10,4,11,50);
		List<Integer> newData = data.stream().distinct().collect(Collectors.toList());
		System.out.println(newData);//remove only duplicate element 
	}
}
//public class F1{
//	public static void main(String[] args) {
//		List<Integer> data = Arrays.asList(10,3,10,16,200);
//		List<Integer> newData = data.stream().distinct().sorted().collect(Collectors.toList());
//		System.out.println(newData);
//	}	
//}

public class F1{
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(10,2,10,16,29,200);
		List<Integer> newData = data.stream().sorted().filter(x->x%2==0).collect(Collectors.toList());//order doesnot matter in methodx
		System.out.println(newData);
	}
}
