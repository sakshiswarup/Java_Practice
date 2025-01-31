package Function_functional_interface;

import java.util.function.Function;

//It takes an i/p & produce one o/p
//public class F {
//public static void main(String[] args) {
//	Function<Integer,Integer> val= x->x*x;
//	Integer result = val.apply(10);
//	System.out.println(result);
//}
//}

//public class F{
//	public static void main(String[] args) {
//		Function<Integer,String> val = x->x+("welcome");
//		String result= val.apply(10);
//		System.out.println(result);
//	}
//}
public class F{
	public static void main(String[] args) {
		Function<String,String> f= x->x.toUpperCase();
	    String val= f.apply("mike");
	    System.out.println(val);
	}
}