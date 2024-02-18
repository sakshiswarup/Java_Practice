package java1;
//These variable are created outside the method but inside the class using static keyword.
//These variable have a global access .they can be used anywhere in class. 

public class Static1 {
	static int x = 20;
public static void main(String[] args) {
	System.out.println(x); //20
	System.out.println(Static1.x);//20 its also correct
	Static1 static1 = new Static1();
	static1.test();
}
public void test() {
	System.out.println(x);//20
}
}

//it is not mandatory to initialize static variable 
//if we don't initialize then depending on datatype default value will get stored in it.

//public class Static1{
//	static int x;
//	static float y;
//	static char z;
//	static String i;
//public static void main(String[] args) {
//	System.out.println(x);//0
//	System.out.println(y);//0.0
//	System.out.println(i);//null
//	System.out.println(z);
//}
//}