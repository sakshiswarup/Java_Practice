package wrapperClass;
//Data structure is a collection of wrapper class.
//a wrapper class is  used to convert primitive data types  (like int,char,boolean etc) into objects. 
//each primitive type has corresponding wrapper class in java.lang package.
//key features like Autoboxing
//public class W1 {
//public static void main(String[] args) {
//	int num = 7;
//	Integer num1=num;//autoboxing = if u directly assigned primetive value to the object type.
//	System.out.println(num1);
//}
//}
//Auto unboxing

public class W1{
	public static void main(String[] args) {
		int num = 10;
		Integer num1= num;
		int num2 = num1;//if u want to fetch the value called as auto unboxing.
		System.out.println(num2);
		
		String str = "2";
		int num3 = Integer.parseInt(str);
		System.out.println(num3);
	}
}
