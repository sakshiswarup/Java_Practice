package Loop1;

import java.util.Scanner;

//break keyword
public class breakl {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	for(int i = 0; i<3;i++) {
		System.out.println("enter your pin");
		int pinNumber = scan.nextInt();
		if(pinNumber==5) {
			System.out.println("you are the winner");
			break;
		}else{
			//System.out.println("Please try again");
			if(i==1) {
				System.out.println("Better luck next time");
			}
			System.out.println("please try again");
		}
	}
}
}

