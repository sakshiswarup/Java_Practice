package protectedcon2;

import protectedcon1.A;

//Access Specifiers in protected constructor.

//when you make a constructor  protected then it's object can be created in same package & same class but not in different package.
public class C extends A {
public static void main(String[] args) {
	//A a1 = new A();//error
}
}
