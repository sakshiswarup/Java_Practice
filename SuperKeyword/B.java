package SuperKeyword;
//ex 1

//public class B extends A {
//public static void main(String[] args) {
//	B b1 = new B();
//	b1.test();
//}
//public void test() {
//	System.out.println(super.x);
//}
//}

//ex2
//public class B extends A{
//	public static void main(String[] args) {
//		B b1 = new B();
//		b1.test();
//	}
//	public void test() {
//		super.xyz();
//	}
//}

//Using super keyword we can access static & non Static both.
//ex3
//public class B extends A{
//	public static void main(String[] args) {
//		B b1 = new B();
//		b1.test();
//	}
//	public void test() {
//		System.out.println(super.x);
//	}
//}

//we cannot use supper keyword inside static
//ex4

//public class B extends A{
//	public static void main(String[] args) {
//		B b1 = new B();
//		b1.test();
//	}
//	public static void test() {
//		System.out.println(super.j);//not use super in static method 
//	}
//}

//Using super keyword we can call constructor of parent class but then we can use super keyword in child class constructor
//and it should be very first statements
//ex5

//public class B extends A{
//	B(){
//		super();
//	}
//	public static void main(String[] args) {
//		new B();
//	}
//}

//public class B extends A{
//	B(){
//		System.out.println("B");
//		super();//super keyword is in the first statement
//	}
//	public static void main(String[] args) {
//		new B();
//	}
//}

//if we don't keep super keyword inside child class constructor then compiler will automatic place the supper keyword 
//such that it can call no args constructor of the parent class
//ex6

//public class B extends A{
//	B(){
//		//super(); by compiler automatic placed
//	}
//	public static void main(String[] args) {
//     new B();		
//	}

//public class B extends A{
//	//here automatic default constructor with super keyword applied.
//	public static void main(String[] args) {
//		new B();
//	}
//}

//if you don't create child class constructor without argument then compiler will automatic place no args constructor 
//along with super keyword.   
//ex 7

//public class B extends A{
//	B(){
//		//super(); placed by compiler
//		System.out.println("B");
//	}
//	public static void main(String[] args) {
//		new B();
//	}
//}