package String_Concepts;
//trim()
//public class S2 {
//public static void main(String[] args) {
//	String x1=" aab ";
//	String x2="\n\t Acc";
//	System.out.println(x1.trim());//o/p=aab
//	System.out.println(x2.trim());//Acc
//}
//}

//charAt()
//public class S2{
//	public static void main(String[] args) {
//	String x1="aabaacv";
//	System.out.println(x1.charAt(0));
//	}
//}

public class S2{
	public static void main(String[] args) {
		String x1="aabaacv";
		int count=0;
		for(int i =0; i<x1.length();i++) {
			if(x1.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println(count);
	}
}

//convert primitive data type to string

public class S2{
	public static void main(String[] args) {
		int x =10;
		String y =""+x;
		System.out.println(y);
		float z = 10.5f;
		String s =""+z;
		System.out.println(s);
	}
}
