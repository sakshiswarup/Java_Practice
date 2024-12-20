package wrapperClass;
//static methods = the methods like parseInt parseFloat etc are static members of their respective wrapper class.


//public class W3 {
//public static void main(String[] args) {
//	String x = "100";
//	int val1 = Integer.parseInt(x);//the integer wrapper class's static method parseInt() is used to covert the string "100 into
                                  //the primitive integer 100.
//	System.out.println(val1);
//	String y = "10.3";
//	Float val2 = Float.parseFloat(y);
//	System.out.println(val2);
//	String z = "10.3";
//	double val3= Double.parseDouble(z);
//	System.out.println(val3);
//	String a = "10";
//	long val4= Long.parseLong(a);/Long val4 = Long.parseLong(a);
//	System.out.println(val4);
//	String b = "5";
//	byte val5= Byte.parseByte(b);
//	System.out.println(val5);
//	String c ="2";
//	short val6=Short.parseShort(c);
//	System.out.println(val6);
//String d = "mike";
//char val7= d.charAt(0);
//System.out.println(val7);
//}
//}

public class W3{
	public static void main(String[] args) {
		String x = "1000";
		int val1= Integer.parseInt(x);
		System.out.println(val1);
		String y = "10.3";
		Float val2 = Float.parseFloat(y);
		System.out.println(val2);
		String z = "10";
		Double val3 = Double.parseDouble(z);
		System.out.println(val3);
		String a ="2";
		Long val4 = Long.parseLong(a);
		System.out.println(val4);
		String b ="3";
		Byte val5= Byte.parseByte(b);
		System.out.println(val5);
		String c = "10";
		Short val6 = Short.parseShort(c);
		System.out.println(val6);
		String d = "mike";
		char val7= d.charAt(0);
		System.out.println(val7);
	}
}