package string_java;

import java.util.Scanner;

//Opening and closing bracket same don't give error if not same (mismatch) then it gives  error.

public class Str3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the opening or closing paranthesis");
	String str = scan.next();
	int count1=0;
	int count2=0;
	for(int i =0 ; i<str.length(); i++) {
		if (str.charAt(i) =='(') {
			count1++;
		}else if(str.charAt(i) == ')') {
			count2++;
		}
	}
	if(count1==count2) {
		System.out.println("No Error");
	}else {
		System.out.println("Error");
	}
}
}
