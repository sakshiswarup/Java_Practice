package thread_example;

public class B  {
	
	public static void main(String[] args) {
		A a1 = new A("xxx");
		A a2 = new A("yyy");
		A a3 = new A("zzz");
		a1.start();
		a2.start();
		a3.start();
	}
}
