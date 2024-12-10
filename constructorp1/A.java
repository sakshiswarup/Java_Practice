package constructorp1;
//Access Specifiers on constructors.
//Note- We can not inherit constructor.
//if we make a constructor private then it's object can be created inside same class only 
//but cannot create it's object outside of the class. 


//public class A {
// private A() {
//	 System.out.println("A");
// }
// public static void main(String[] args) {
//	A a1 = new A();
//}
//}
//---
//if you make a constructor private inhertance of that class is not allowed.

public class A {
	private A() {
	System.out.println("A");
}

}