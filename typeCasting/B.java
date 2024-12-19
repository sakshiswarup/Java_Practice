package typeCasting;
//Explict Downcasting= converting bigger data type into smaller data type is called as explict down casting.
//data loss might be happen
//public class B {
//public static void main(String[] args) {
//	int i = 10;
//	byte j = (byte)i;
//	System.out.println();
//}
//}

//public class B{
//	public static void main(String[] args) {
//		long i = 30;
//		int j = (int)i;
//		System.out.println(j);
//	}
//}
//during conversion if any loss of data then regardless of memory size we need to perform explict down casting

//float to long
//public class B{
//	public static void main(String[] args) {
//		float i = 10.3f;//data loss happening
//		long j = (long)i;
//		System.out.println(j);
//	}
//}

//float to int
//public class B{
//	public static void main(String[] args) {
//		float i = 10.5f;//data loss
//		int j = (int)i;
//		System.out.println(j);
//	}
//}
//---
//public class B{
//	public static void main(String[] args) {
//		long i = 100;
//		byte j=(byte)(int)i; here first i coverted into int then next byte.
//		System.out.println(j);
//	}
//}

public class B{
	public static void main(String[] args) {
		int i = 10;
		long j = (long)i;
		System.out.println(j);
	}
}