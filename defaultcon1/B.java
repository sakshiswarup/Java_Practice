package defaultcon1;

//public class B {
//public static void main(String[] args) {
//	A a1 = new A();
//	
//}
//}

//When you make a constructor default then that class inheritance  can be done  in  same package but not in different package.
public class B extends A{
	public static void main(String[] args) {
		A a1 = new A();
	}
}