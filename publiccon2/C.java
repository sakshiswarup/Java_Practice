package publiccon2;
//Access specifiers- public constructor

import publiccon1.A;
//when you make constructor public then that class object can be created in same class,same package & also in different package.
//public class C {
//public static void main(String[] args) {
//	A a1 = new A();
//}
//}
//---------
//when we make a constructor public then that class inheritance is allowed in same package & different package.
public class C extends A{
	public static void main(String[] args) {
		A a1 = new A();
	}
}