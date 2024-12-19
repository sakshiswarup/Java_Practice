package typeCasting;
//Converting a particular datatype into a required data type is called type casting.
//two type- 1. auto upcasting 2. explit downcasting.
//Auto Upcasting = Converting smaller data type to bigger data type without any loss of data is called auto upcasting.

public class A {
public static void main(String[] args) {
	int i = 10;//4 bytes
	long j = i;//8 bytes
	System.out.println(i);
}
}
//--
//public class A{
//	public static void main(String[] args) {
//		byte i = 30;//1 memory size
//		short j = i;//2 bytes memory size
//	}
//}
//---
//public class A{
//	public static void main(String[] args) {
//		long i = 10;// here memory size is 8
//		byte j = i;//error //here memory size is 1byte.
//		System.out.println(i);
//	}
//}
//---
//whenever their lose of data during converstion regardless of memory size upcasting cannot happen.
//public class A{
//	public static void main(String[] args) {
//		float i = 10.3f;//here memory size is 4 bytes. and .3f dataloss
//		long j = i;//error //here memory size 8
//		System.out.println(i);
//	}
//}
//---
//public class A{
//	public static void main(String[] args) {
//		float i = 10.2f;//here memory size is 4 bytes but .2f data loss happening so upcasting is not happening here.
//		int j = i;//error //here memory size is 4 bytes
//		System.out.println(i);
//	}
//}
