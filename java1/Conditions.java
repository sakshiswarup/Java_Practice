package java_1;
//if else 

//public class Conditions {
//public static void main(String[] args) {
//	int x = 20;
//	if(x>5) {
//		System.out.println("x is greater");
//	}else {
//		System.out.println("smaller");
//	}
//}
//}
 
//public class Conditions{
//	public static void main(String[] args) {
//		int x =100;
//		if (x>50) {
//			System.out.println("x is greater");
//		}if(x>200) {
//			System.out.println("x is less than 200");//here 200 is greater then 100 so condition false
//		}else if(x>80) {// here condition is true print (elseif) next process will stop here.
//			System.out.println("elseif");
//		}else {
//			System.out.println("return");
//		}
//	}
//}

public class Conditions{
	public static void main(String[] args) {
		int x =100;
		if (x<50) {
			System.out.println("x is greater");
		}if(x>200) {
			System.out.println("x is less than 200");
		}else if(x<80) {
			System.out.println("elseif");
		}else {
			System.out.println("return");// all conditions is false so else part going to run
		}
	}
}