package Predicate_functional_interface;

import java.util.function.Predicate;

// Predecate functional interface takes one input and produce a boolean value output .

//public class P {
//public static void main(String[] args) {
//	Predicate<Integer> val = x ->x%2==0;
//	boolean x = val.test(100);
//	System.out.println(x);//o/p true
//}
//}

//public class P{
//
//	public static void main(String[] args) {
//		Predicate<Integer> val = x->x%2==0;
//		boolean test = val.test(101);
//		System.out.println(test);//false
//	}
//}

//public class P{
//	public static void main(String[] args) {
//		Predicate<String> val = str -> str.equals("mike");
//		boolean x = val.test("adam");
//		System.out.println(x);
//	}
//}

//length
public class P{
	public static void main(String[] args) {
		Predicate<String> p = str->str.length()>3;
		boolean val = p.test("mike");
		System.out.println(val);
	}	
}
