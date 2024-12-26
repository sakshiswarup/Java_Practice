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



