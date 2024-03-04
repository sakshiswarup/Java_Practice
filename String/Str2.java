package string_java;
//count the no of the words in given string

public class Str2 {
public static void main(String[] args) {
	String str ="Sakshi Swarup";
	String []s= str.trim().split("");
	System.out.println(s.length);
	for(String x:s) {
		System.out.print(x);
	}
}

}


