package Loop1;

import java.util.Scanner;

//public class forLoop {
//	public static void main(String[] args) {
//		for(int i=0;i<5;i++) {//here 0 to 4  printed
//			System.out.println(i);
//		}
//	}
//
//}

//public class forLoop{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		for(int i =0; i<3;i++) {
//			System.out.println("Enter the pin Number");
//			int pinNumber = scan.nextInt();
//			if(pinNumber==1234) {
//				System.out.println("Welcome");
//			}else {
//				System.out.println("Invalid pin number");
//			}if(i==2) {
//				System.out.println("Card is blocked");
//			}
//		}
//	}
//}
//if-else or nested if-else condition
public class forLoop{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Please enter your pin number");
			int pinNumber= scan.nextInt();
			if(pinNumber==1234) {
				System.out.println("Welcome");
			}else {
				System.out.println("Invaild pin");
			}if(i==2) {
				System.out.println("card is blocked");
			}
		}
	}
}