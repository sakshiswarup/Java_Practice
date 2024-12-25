package p1;

//Finally Block- finally block is extension of try_catch block
//Any code we write in finally block will run 100% regardless of exception.
//public class Finally {
//public static void main(String[] args) {
//	try {
//		int x = 10/2;
//		System.out.println(x);
//	} catch (Exception e) {
//		e.printStackTrace();
//	}finally {
//		System.out.println(100);
//	}
//}
//}

//public class Finally{
//	public static void main(String[] args) {
//		try {
//			int x = 10;
//			int y =2;
//			int z = x/y;
//			System.out.println(z);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			System.out.println(10);
//		}
//	}
//}

//How do we finally block forcefully?

//public class Finally{
//	public static void main(String[] args) {
//		try {
//			int x = 10/2;
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			System.exit(0);//it will forcefully stop finally block
//			System.out.println(100);
//		}
//	}
//}

public class Finally{
	public static void main(String[] args) {
		try {
			int x = 10/0;
			System.out.println(x);
		} finally {
			System.out.println(100);
		}
		System.out.println("welcome");//anything outside finally block not run
	}
}