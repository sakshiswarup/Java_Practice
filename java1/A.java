package java1;
//Non-static variable created inside class but outside method
//only after we can create object we can access non-static member
public class A {
int x = 10;
public static void main(String[] args) {
	A a1 = new A();
	System.out.println(a1.x);
}
}

//whenever we create object non static member is loaded into object.
//public class A {
//int x = 20;
//
//public static void main(String[] args) {
//	A b1 = new A();
//	A b2 = new A();
//	System.out.println(b1.x);
//	System.out.println(b2.x);
//	
//}
//}