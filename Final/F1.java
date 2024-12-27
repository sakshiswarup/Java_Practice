package Final;

//public class F1 extends F {
//	@Override
//public void test() {// we cannot override final method (error)
//	
//}
//}

//public class F1 extends F{//error
//}

//Interface Continuation
//Object of interface cannot be created.
//Every variable in an interface by default final & static.
//public interface F1{
//	int MAX =100;
//	int MIN=0;//even if i don't write final and static it will be final nd static(bold)
//	public static void main(String[] args) {
//		
//	}
//}

//we cannot create incomplete static method in an interface
public interface F1{
	public static void test() {//Static member cannot be inherited.
		
	}
}
//go to F2