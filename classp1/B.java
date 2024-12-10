package classp1;
//Access specifiers on a class.
//A default class can be accessed in the same package only but not in different package

//public class B extends A{
//public static void main(String[] args) {
//	B b1 = new B();
//}
//}

//--
//A public class can be accessed in same package & in different package
public class B extends A{
public static void main(String[] args) {
	A a1 = new A();
}
}