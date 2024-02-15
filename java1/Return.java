package java1;
//We can use return keyword inside void method & its optional
//using return keyword we return control to method calling statement
//we can use return vale keyword only inside not a void method & its mandatory to use

public class Return {
public static void main(String[] args) {
	Return return1 = new Return();
	return1.test();
	return;
}
public void test() {
	System.out.println(200);
	return;
}
}

//if we write code after return keyword the we will get error

//public class Return {
//public static void main(String[] args) {
//	Return return1 = new Return();
//	return1.test();
//	return;
//}
//public void test() {
//	return;
//	System.out.println(200);//Unreachable code error
//	
//}
//}
