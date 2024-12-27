package Interface;

//public class I2 implements I1 {
//	@Override
//	public void test() {
//		System.out.println(1);
//	}
//	public static void main(String[] args) {
//		I2 i = new I2();
//		i.test();
//	}
//}

public class I2 implements I1{
	@Override
	public void test() {
		System.out.println(1);
	}
	@Override
	public void test2() {
		System.out.println(2);
	}
	public static void main(String[] args) {
		I2 i = new I2();
		i.test();
		i.test2();
	}
	
}

//3
//public class I2 extends I1{
//	public static void main(String[] args) {
//		I2.test();//converted to I1.test();
//		System.out.println(I2.x);//it will converted to I1.x.
//	}
//}

//4
public interface I2 extends I1{
	public void test2();
}



