package java1;
//Non-static & not a void method

//public class C {
//public static void main(String[] args) {
//	C c1 = new C();
//	int x = c1.test();
//	System.out.println(x);
//}
//public int test() {
//	return 100;
//}
//}

public class C{
	public static void main(String[] args) {
		C c1 = new C();
		String x = c1.test();
		System.out.println(x);
	}
	public String test() {
		return "sakshi";
	}
}