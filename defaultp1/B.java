package defaultp1;
//default Access Specifiers
//same package sub class - yes
//public class B extends A  {
//public static void main(String[] args) {
//	B b1 = new B();
//	b1.test();
//	System.out.println(b1.x);
//}
//}

//same package non sub class -
 public class B{
	 public static void main(String[] args) {
		A a1 = new A();
		a1.test();
		System.out.println(a1.x);
		}
 }