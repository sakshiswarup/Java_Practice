package LinkedHashMap;

import java.util.LinkedHashMap;

public class L {
public static void main(String[] args) {
	LinkedHashMap<Integer,String> l = new LinkedHashMap<>();//here same order enter in insertion time get o/p in same order.
	l.put(2,"abs");
	l.put(1,"mike");
	l.put(3, "jack");
	
	System.out.println(l);
	System.out.println(l.get(1));//mike

}
}
