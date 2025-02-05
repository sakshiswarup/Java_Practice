package StreamApi.forEach;

import java.util.Arrays;
import java.util.List;

//ForEach() method 
//public class F {
//public static void main(String[] args) {
//	List<String> name= Arrays.asList("John","Paul","George","Alex");
//	name.stream().forEach(n->System.out.println(n));
//}
//}
//StartWith "A"
public class F{
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice","John","Paul","Alex");
		names.stream().filter(name->name.startsWith("A")).forEach(n->System.out.println(n));
	}
}
