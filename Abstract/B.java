package Abstract;
//Abstract in java= An abstract class can consist of both complete and incomplete method in it.
public class B extends A {
	@Override
public void test1() {
	System.out.println(1);
}
public static void main(String[] args) {
	B b1 = new B();
	b1.test1();
	b1.test2();
}
}

//Abstract  class can consists of both static and non static methods/variable.
public class B extends A{
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.x);
		System.out.println(A.y);
	}
}

//An object of abstract class cannot be created.
//public class B extends A{
//	public static void main(String[] args) {
//		A a1 = new A();//error
//	}
//}

//Abstract class does not class multiple inheritance.
//abstract public class B{
//}

//with Interface
//interface- abstract - class
//public abstract class B implements A{
//	public abstract void test2();
//}

//with the help of supper keyword constructor create

public class B extends A{
	B(){
		super();
	}
	public static void main(String[] args) {
		B b1 = new B();
	}
}
