package Interface.lambadas;

//public class M {
//public static void main(String[] args) {
//	L l1 = new L();//error
//}
//}
//ex1
/*public class M{
	public static void main(String[] args) {
		L l1 =()->{
			System.out.println(1);
		};
		l1.test();
	}
}*/

//ex2
//public class M{
//	public static void main(String[] args) {
//		L l1 = (int x)->{
//			System.out.println(x);
//		};
//		l1.test1(100);
//		l1.test2();
//		
//	}
//	
//}

//ex3
public class M{
	public static void main(String[] args) {
		L l1 = (int x, int y)->{
			System.out.println(x);
			System.out.println(y);
		};
		l1.test1(10, 20);
	}
}