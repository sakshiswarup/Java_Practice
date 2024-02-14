package java1;
//Non static & a void method
//public class D {
//public static void main(String[] args) {
//	D d1 = new D();
//	d1.test1();
//	d1.test2();
//}
//public void test1() {
//	System.out.println(200);
//}
//public void test2() {
//	System.out.println("sakshi");
//}
//}

//Method & Arguments
public class D{
	public static void main(String[] args) {
		D d1 = new D();
		d1.test(500, "Sakshi", 10.5);
	}
	public void test(int x, String y, double z) {//arugments (int x, String y, double z)
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}