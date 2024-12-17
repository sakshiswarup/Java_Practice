package ploymorphism;
//example- Overriding concepts.

public class B extends A {
	@Override
	public void test1() {
		System.out.println(300);
	}

	@Override
	public int test2() {
		return 400;
	}

	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
		int val = b1.test2();
		System.out.println(val);
	}
}

//Use Access specifiers
//here we reducing the power of access specifiers to public to default.

public class B extends A{
@Override
void test1() {//Error, here we reducing the power of access specifiers to
public to default.
System.out.println(200);
	}
}

//Here we increasing scope to default to public.=yes

public class B extends A{
	@Override
	public void test1() {// no error
		System.out.println(200);
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
	}
}

//Here we change scope to protected to default= error

public class B extends A{
	@Override
	 void test1() {//error
		System.out.println(200);
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
	}
}

//Here we change scope to default to protected.= no error

public class B extends A {
	@Override
	protected void test1() {
		System.out.println(200);
	}
	public static void main(String[] args) {
		B b1= new B();
		b1.test1();
		
	}
}

//Here we change scope to protected to public=No error
//public has more scope so everywhere works.
public class B extends A{
	@Override
	public void test1() {
		System.out.println(300);
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
	}
}

//Here we change scope protected to private=Error

public class B extends A{
	@Override
	private void test1() {//error
		System.out.println(200);
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
	}
}

//private method cannot be inhereted.
//here we change scope to private to default=Error

public class B extends A{
	@Override
	void test1() {//error
		System.out.println(200);
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
	}
}
