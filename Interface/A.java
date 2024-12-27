package Interface;
//1
//Interface supports multiple inheritance.
//public interface A {
// public void test1();
//}

//2
//Diamond problem solution with interface
//interface A,  interface B extends interface A, interface C extends interface A,interface D implements class B,C.
//public interface A{
//	public void test();
//}

//ex=1
//public interface A{
//	public void test1();
//}

//ex2
//public class A{
//	
//}

//Private/Protected incomplete method not allowed in interface.
//interface cannot have constructor
//public interface A{
//	A(){//error
//		
//	}
//}