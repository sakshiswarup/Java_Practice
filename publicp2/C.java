package publicp2;

import publicp1.A;

////public = different package sub class=yes
//public class C extends A{
// public static void main(String[] args) {
//	 C c1 = new C();
//	 c1.test();
//	 System.out.println(c1.x);
//}
//}

//--
//public = different package non sub class=yes
public class C{
public static void main(String[] args) {
	A a1 = new A();
	a1.test();
	System.out.println(a1.x);
}
}