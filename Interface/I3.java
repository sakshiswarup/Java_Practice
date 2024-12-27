package Interface;

//4
public class I3 implements I2 {
public static void main(String[] args) {
	I3 i = new I3();
	i.test();
	i.test2();
}
@Override
public void test() {
	System.out.println(1);
}
@Override
public void test2() {
	System.out.println(2);
}
}
