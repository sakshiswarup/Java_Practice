package ploymorphism;

// example-Overriding concepts
public class A {
	public void test1() {
		System.out.println(100);
	}

	public int test2() {
		return 200;
	}
}

//Use Access specifiers
//here we reducing the power of access specifiers to public to default.
public class A{
	public void test1() {
		System.out.println(100);
	}
}

//here we increasing the power of access specifiers default to public.-no error

public class A{
	void test1() {
		System.out.println(100);
	}
}

//here we change scope power to protected and default-error

public class A{
	protected void test1() {
		System.out.println(100);
	}
}

//here we change scope to default to protected = no error

public class A{
	void test1() {
		System.out.println(100);
	}
}

//Here we change scope to protected to public=No error.
//public has more scope so everywhere works.
public class A{
	protected void test1() {
		System.out.println(100);
	}
}

//here we change scope to protected to private=Error
public class A{
	protected void test1() {
		System.out.println(100);
	}
}

//private method cannot be inhereted.
//Here we change scope to private to default= Error
public class A{
	private void test1() {
		System.out.println(100);
	}
}
