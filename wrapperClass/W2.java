package wrapperClass;
//The main advantage of wrapper class is easy to manipulation of data
public class W2 {
public static void main(String[] args) {
	Integer i = 10;
	System.out.println(i);
	System.out.println(Integer.MAX_VALUE);//The max^m value of integer can store (2^31-1).
	System.out.println(Integer.MIN_VALUE);//the min^m value of integer can store (2^31).
	System.out.println(i.longValue());//convert the value Integer to long
	System.out.println(i.doubleValue());//convert the value to integer to double.
	System.out.println(i.hashCode());//return hash code for integer object.
	System.out.println(i.SIZE);//in java SIZE is always 32 bits.
	System.out.println(i.toString());//convert the value to integer to string.
	System.out.println(i.byteValue());//convert the value to integer to byte.
	
	Integer j = new Integer(100);//older way in java9
	System.out.println(j);
}
}



