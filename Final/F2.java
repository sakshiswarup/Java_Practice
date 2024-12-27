package Final;

//Interface Continuation
//Object of interface cannot be created.
//Every variable in an interface by default final & static.
public interface F2 {
public static void main(String[] args) {
	F1 f = new F1();//error
	System.out.println(F1.MAX);
	System.out.println(F1.MIN);
}
}

//we cannot create incomplete static method in an interface
//public class F2 extends F1{//error
//	
//}
