package Predicate_functional_interface;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Stream Api= to manipulate Data Structure
//divided by 2
//public class p1 {
//public static void main(String[] args) {
//	List<Integer> data=Arrays.asList(10,20,15,26,45,32,100);
//	List<Integer> newData = data.stream().filter(n->n%2==0).collect(Collectors.toList());
//	System.out.println(newData);
//}
//}

//not divided by 2
//public class p1{
//	public static void main(String[] args) {
//		List<Integer> data = Arrays.asList(10,20,15,26,45,32,100);
//		List<Integer> newData = data.stream().filter(n->n%2!=0).collect(Collectors.toList());
//		System.out.println(newData);
//	}
//}

//startwith

//public class p1{
//	public static void main(String[] args) {
//		List<String> data = Arrays.asList("mike","stallin","adam","moya");
//		List<String> newData = data.stream().filter(s->s.startsWith("m")).collect(Collectors.toList());
//	System.out.println(newData);
//	}
//}

//endWith()

public class p1{
  public static void main(String[] args) {
	List<String> data = Arrays.asList("mike","adam","starlin","joye");
	List<String> newData = data.stream().filter(s->s.endsWith("e")).collect(Collectors.toList());
	System.out.println(newData);
}

}