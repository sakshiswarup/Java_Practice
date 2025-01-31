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