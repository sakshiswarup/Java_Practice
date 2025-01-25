package HashMap;

import java.util.HashMap;
import java.util.Map;

public class H {
public static void main(String[] args) {
	Map<String,Integer> h= new HashMap<>();
	h.put("9572392981", 1982);//here two key:value pair
	h.put("9283749301", 8976);
	h.put("8293048301", 6666);
	System.out.println(h);
	System.out.println(h.remove("8293048301"));
	System.out.println(h);
}
}
