package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//find maximum number of given collections.

//public class D {
//public static void main(String[] args) {
//List<Integer> data = Arrays.asList(10,32,452,13,16,70);	
//Optional<Integer> maxVal = data.stream().max(Integer:: compareTo);//here :: is method reference(it is substitute of lambda expression)
//if(maxVal.isPresent()) {
//	Integer val = maxVal.get();
//	System.out.println(val);
//}
//}
//}
//find minimum number
public class D{
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(10,32,452,13,16,70);
		Optional<Integer> minVal = data.stream().min(Integer::compareTo);
		if(minVal.isPresent()) {
			Integer val = minVal.get();
			System.out.println(val);
		}
	}
}
