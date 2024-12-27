package Interface;
//We can create only incomplete method (Abstract methods) in an Interface.
//Interfaces acts like a contrast on the class .
//That is when a class implements an interface then that class has to implement all incomplete method inherit on it.
//public interface I1 {
//public void test();{//error
//	
//}
//}

//public interface I1{
//	public void test();//correct way
//}
//

public interface I1{
	public void test();
	public void test2();
}

//3
//Static members are not inherited in the below program  I2 .test() during compilation is converted to I1 .test() 
//and I2.x is converted to I1.x .hence you get respective outputs.
//public class I1{
//	static int x =100;
//	public static void test() {
//		System.out.println(1);
//	}
//}

//4
public interface I1{
public void test();
}
