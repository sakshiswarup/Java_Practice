package String_Concepts;
//isBlank() -introduced in java 11
// it always gives blank to true & isempty() because one space is there so it will give false
//public class S0 {
//public static void main(String[] args) {
//	String x1 = " ";
//	System.out.println(x1.isBlank());//true
//	System.out.println(x1.isEmpty());//false
//	System.out.println(x1.length());//1
//}
//}

//public class S0{
//	public static void main(String[] args) {
//		String x1="";
//		System.out.println(x1.isBlank());//true
//		System.out.println(x1.isEmpty());//true
//	}
//}

//.equalsIgnoreCase()
//public class S0{
//	public static void main(String[] args) {
//		String x1="mike";
//		String x2="mike";
//		String x3="Mike";
//		System.out.println(x1.equals(x2));//true
//		System.out.println(x1.equals(x3));//false
//		System.out.println(x2.equalsIgnoreCase(x3));//true
//	}
//}

//Word Comparing
//public class S0{
//	public static void main(String[] args) {
//		String x1="java";
//		String x2="python";
//		System.out.println(x1.compareTo(x2));//first word comparing //o/p = -6
//	}
//}

//public class S0{
//	public static void main(String[] args) {
//		String x1="python";
//		String x2="java";
//		System.out.println(x1.compareTo(x2));//6 j--p
//	}
//}

//public class S0{
//	public static void main(String[] args) {
//		String x1="java";
//		String x2="jva";
//		System.out.println(x1.compareTo(x2));//-21
//		String x3="aab";
//		String x4="acc";
//		System.out.println(x3.compareTo(x4));//-2
//		String x5="abc";
//		String x6="bcd";
//		System.out.println(x5.compareTo(x6));//-1
//		System.out.println(x6.compareTo(x5));//1
//		String x7="bcd";
//		String x8="bcc";
//		System.out.println(x7.compareTo(x8));
//	}
//}

public class S0{
	public static void main(String[] args) {
		String x1="aab";
		String x2="Mike";
		System.out.println(x1.toUpperCase());
		System.out.println(x2.toLowerCase());
	}
}