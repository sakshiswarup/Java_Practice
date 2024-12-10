package defaultcon1;
//Default constructor on access specifiers.

//When you make a constructor default then class object can be created in same class & same package but not outside the package. 
//public class A {
//A(){
//	System.out.println("A");
//}
//public static void main(String[] args) {
//	A a1 = new A();
//}
//}
//--
// When you make constructor default then that class inheritance can be done in same package but not outside of package.

public class A{
	A(){
		System.out.println("A");
	}
	
}