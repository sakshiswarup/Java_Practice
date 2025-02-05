package Consumer_Supplier_FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Supplier;

//consumers= it takes an i/p but produces no o/p.
//public class C {
//public static void main(String[] args) {
//	Consumer<String> val= x->System.out.println(x);
//	val.accept("hello");
//}
//}

//supplier=it doesnot take input but produces output

public class C{
	public static void main(String[] args) {
		Supplier<String> val =()->"hello";
		String s = val.get();
		System.out.println(s);
	}
}

//public class C{
//	public static void main(String[] args) {
//		Supplier<Double>s= ()-> Math.random();
//		System.out.println(s.get());
//	}
//}