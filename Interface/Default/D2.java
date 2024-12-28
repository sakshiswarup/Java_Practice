package Interface.Default;

//public class D2 implements D1 {
//	public static void main(String[] args) {
//		D2 d = new D2();
//		d.test();
//	}
//
//
//}

//public class D2 implements D1{
//	public static void main(String[] args) {
//		D2 d = new D2();
//		d.test1();
//		d.test2();
//		d.test3();
//	}
//	@Override
//	public void test3() {
//		System.out.println(3);
//	}
//}

public class D2 implements D1{
	@Override
	public void addNumber(int x, int y) {
		System.out.println(x+y);
	}
	@Override
	public void addNumber(double x,double y) {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		D2 d = new D2();
		d.addNumber(20.2, 20.3);
		d.addNumber(10, 30);
	}
}