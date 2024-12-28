package Interface.Default;
//Default= Using default keyword we can create complete method inside interface.
//this features was introduced in java 8

//public interface D1 {
// default public void test() {
//	System.out.println(1);
//}
//}

//public interface D1{
//	default public void test1() {
//		System.out.println(1);
//	}
//	default public void test2() {
//		System.out.println(2);
//	}
//	public void test3();
//}

//public interface D1{
//	static int x =10;
//	public static void main(String[] args) {
//		System.out.println(D1.x);
//		D1.test();
//	}
//	public static void test() {
//		System.out.println("From test");
//	}
//}

public interface D1{
	public void addNumber(int x , int y);
	public void addNumber(double x, double y);
}