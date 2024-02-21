package java_1;

//public class Array {
//public static void main(String[] args) {
//	String[] names = new String[4];
//	names[0]="john";
//	names[1]="sam";
//	names[2]="mike";
//	names[3]="scatlin";
//	for(int i = 0;i<names.length; i++) {
//		System.out.println(names[i]);
//	}
//}
//}

//public class Array {
//public static void main(String[] args) {
//	String[] names = new String[4];
//	names[0]="john";
//	names[1]="sam";
//	names[2]="mike";
//	names[3]="scatlin";
//	names[4]="adam";//ArrayIndexOutOfBoundsException
//	for(int i = 0;i<names.length; i++) {
//		System.out.println(names[i]);
//	}
//}

//ArrayIndexOutOfBoundsException resolves with the help of try & catch block
public class Array {
public static void main(String[] args) {
	String[] names = new String[4];
	try {
		names[0]="john";
		names[1]="sam";
		names[2]="mike";
		names[3]="scatlin";
		names[4]="adam";
	} catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
	for(int i = 0;i<names.length; i++) {
		System.out.println(names[i]);
	}
}
}
