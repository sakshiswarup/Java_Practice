package SuperKeyword;

//Super keyword
//using supper key word we can access the member of parent class.
//ex1

//public class A {
//int x= 10;
//}

//ex2
//public class A{
//	public void xyz() {
//		System.out.println("xyz");
//	}
//}

//Using super keyword we can access static & non Static both.
//ex3

//public class A{
//	static  int x =10;
//}

//we cannot use supper keyword inside static
//ex4

//public class A{
//	static int j =100;
//}

//Using super keyword we can call constructor of parent class but then we can use super keyword in child class constructor
//and it should be very first statements
//ex5

//public class A{
//	A(){
//		System.out.println("A");
//	}
//}

//if we don't keep super keyword inside child class constructor then compiler will automatic place the supper keyword 
//such that it can call no args constructor of the parent class
//ex6
//public class A{
//	A(){
//		System.out.println("A");
//	}

//if you don't create child class constructor without argument then compiler will automatic place no args constructor 
//along with super keyword.   
//ex 7

//public class A{
//	A(){
//		System.out.println("A");
//	}
//}

//If in the parent class there is only constructor with arguments then as a programmer we can explicitly write in 
//super keyword in child class.
//ex8
//public class A{
//	A(int i){
//		System.out.println(i);
//	}
//}

//Note: Super keyword is not automatically kept when there are only constructors with args in parent class.
//super keyword will be placed automatically when in the parent class there is a constructor with no args.

//public class A{
//	A(int i){
//		System.out.println(i);
//	}
//	A(){
//		System.out.println("from test");
//	}
//}

//public class A{
//	A(int i){
//		System.out.println(i);
//	}
//	A(){
//		System.out.println("from A");
//	}
//}

//we can not use this keyword and super keyword in the same constructor to call another constructor as either of 
//statements become second statement(means this can't second or super cannot be second)
public class A{
	A(int i){
		System.out.println(i);
	}
	A(){
		System.out.println("from A");
	}
}
