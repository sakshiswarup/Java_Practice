package java1;

//These variables are created inside method & should be accessed only within created method
//without initialization we cannot use local variable
//public class LocalVar {
//public static void main(String[] args) {
//	int x = 10;
//	System.out.println(x);
//	LocalVar localVar1 = new LocalVar();
//	localVar1.test();
//}
//public void test() {
//	//System.out.println(x);//error
//}
//}

public class LocalVar {
public static void main(String[] args) {
	int x = 10;
	System.out.println(x);
	LocalVar localVar1 = new LocalVar();
	localVar1.test();
}
public void test() {
	int x = 20;
	System.out.println(x);
}
}

//public class LocalVar{
//	public static void main(String[] args) {
//		int x;
//		System.out.println(x);//error because local variable x is not initialized
//	}
//}