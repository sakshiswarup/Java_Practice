package String_Concepts;

//public class S1 {
// public static void main(String[] args) {
//	String x1 = "mike";
//	String x2 ="mike";
//	System.out.println(x1==x2);//o/p true
//}
//}

//public class S1{
//	public static void main(String[] args) {
//		String x1 = new String("mike");
//		String x2= new String("mike");
//		System.out.println(x1==x2);//false
//	}
//	
//}

//public class S1{
//	public static void main(String[] args) {
//		String x1="mike";
//		String x2 =new String("mike");
//		System.out.println(x1==x2);//false (different address)
//		System.out.println(x1.equals(x2));//true(values are same)
//	}
//}

//intern()= with the help of this added a string to the pool explicitly
//public class S1{
//	public static void main(String[] args) {
//		String x1 ="mike";
//		String x2=new String("mike").intern();
//		System.out.println(x1==x2);//true
//		System.out.println(x1.equals(x2));//true
//	}
//}

//length()

//public class S1{
//	public static void main(String[] args) {
//		String x1 ="mike";
//		System.out.println(x1.length());//4
//		
//		String x2="";
//		System.out.println(x2.length());//0
//		
//		String x3=null;
//		//System.out.println(x3.length());//java.lang.NullPointerException
//		System.out.println(x3);//null
//	}
//}

//Find out String is empty or not

public class S1{
	public static void main(String[] args) {
		String x1="";
		//option 1
		System.out.println(x1.isEmpty());//true
		//option 2
		System.out.println(x1.length());//0
	}
}
