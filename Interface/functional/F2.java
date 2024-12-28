package Interface.functional;

public class F2 implements F1 {
	
	@Override
public void test1() {
	System.out.println(1);
}
public static void main(String[] args) {
	F2 f = new F2();
	f.test1();
}
}
