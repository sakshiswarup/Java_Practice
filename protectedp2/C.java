package protectedp2;

import protectedp1.A;

//protected different package sub class= yes
//public class C extends A {
//public static void main(String[] args) {
//	C c1 = new C();
//	c1.test();
//	System.out.println(c1.x);
//}
//}

//---
//protected different package non sub class=No
public class C {
public static void main(String[] args) {
	A a1= new A();
	//a1.test();//error
	//System.out.println(a1.x);//error
}
}
