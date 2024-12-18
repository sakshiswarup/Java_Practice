package exceptions;

public class C {
public static void main(String[] args) {
	String x = "100";
	int val1 = Integer.parseInt(x);//here Integer is wrapper class
	System.out.println(val1);
	String y = "10.3";
	Float val2 = Float.parseFloat(y);
	System.out.println(val2);
	String z = "10.3";
	double val3= Double.parseDouble(z);
	System.out.println(val3);
	String a = "10";
	long val4= Long.parseLong(a);
	System.out.println(val4);
	String b = "5";
	byte val5= Byte.parseByte(b);
	System.out.println(val5);
	String c ="2";
	short val6=Short.parseShort(c);
	System.out.println(val6);
}
}
