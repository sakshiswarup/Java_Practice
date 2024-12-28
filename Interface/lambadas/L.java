package Interface.lambadas;
//Lambdas Expression= (java 8) = It reduces number of lines of code in java.
//without functional interface we can't create lambdas expression
//we can't create object of interface but reference variable.

//ex 1
//@FunctionalInterface
//public interface L {
//public void test();
//}

//ex2
//@FunctionalInterface
//public interface L{
//	public void test1(int x);
//	default void test2() {
//		System.out.println(2);
//	}
//}

//ex3
@FunctionalInterface
public interface L{
	public void test1(int x,int y) ;
	
}