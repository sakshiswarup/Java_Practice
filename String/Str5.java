package string_java;
// How value of method converts even type such as int, long, float, double & char array to string.

final public class Str5 {
public static void main(String[] args) {
	char[] i = {'a','b','c'}; 
	String str = String.valueOf(i);
	System.out.println(str); output abc
}
}

//for boolean
final public class Str5 {
public static void main(String[] args) {
	boolean i = true; //output true
	String str = String.valueOf(i);
	System.out.println(str);
}
}

//for int
final public class Str5 {
public static void main(String[] args) {
	int i = 10;//output 10
	String str = String.valueOf(i);
	System.out.println(str);
}
}
