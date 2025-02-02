package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//GroupingBy in Stream Api
//public class G {
//public static void main(String[] args) {
//	List<String> names = Arrays.asList(
//			"john","mike","starlin","mike","adam"
//			);
//	Map<String, List<String>> newList = names.stream().collect(Collectors.groupingBy(name->name));
//	System.out.println(newList);
//}
//}

//Give me count which occur in this data Structure
public class G{
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
				"john","mike","starllin","mike","adam"
				);
		Map<String, Long> n = names.stream().collect(Collectors.groupingBy(name->name,Collectors.counting()));
		System.out.println(n);
	}
}