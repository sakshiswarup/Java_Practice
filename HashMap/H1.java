package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//public class H1 {
//public static void main(String[] args) {
//	System.out.println("mike".hashCode());
//}
//}

//public class H1{
//	public static void main(String[] args) {
//		System.out.println("India".hashCode());//70793495
//		System.out.println(("India".hashCode()%16));//7 index
//	}
//}

//public class H1{
//	public static void main(String[] args) {
//		Map<String,String> h1 =new HashMap<>();
//		h1.put("India", "new Delhi");
//		System.out.println("India".hashCode());
//		System.out.println(Math.abs(-70793495%16));
//	}
//}

//public class H1{
//	public static void main(String[] args) {
//		Map<Integer,String> m = new HashMap<>();
//		m.put(3, "mike");
//		m.put(1, "adam");
//		m.put(2, "starllin");
//		System.out.println(m);
//		System.out.println(m.get(1));
//	}
//}

//how to get value
//keyset only fetches keys
//approch1
//public class H1{
//	public static void main(String[] args) {
//		Map<Integer,String> m =new HashMap<>();//here order of insertion not maintained
//		m.put(3, "mike");
//		m.put(1, "adam");
//		m.put(2, "starlin");
//		
//		Set<Integer> keys=m.keySet();
//		for(Integer key:keys) {
//			System.out.println(m.get(key));
//		}
//	}
//}

//approch2
//entrySet() = it will fetch key and value in pair
public class H1{
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(3, "mike");
		m.put(2, "adam");
		m.put(4, "starlin");
		
	Set<Map.Entry<Integer, String>> entrySet = m.entrySet();
	
	for(Map.Entry<Integer,String> entry : entrySet) {
		System.out.println(entry.getKey() +"---"+entry.getValue());
	}
	}
}

