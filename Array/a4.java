package Array;

import java.util.Scanner;

//Names in upperCase
//public class a4{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your name:");
//		String name= scan.next();
//		String [] countries= new String[3];
//		countries[0]="india";
//		countries[1]="Uk";
//		countries[2]="us";
//		int count=0;
//		for(String country:countries) {
//         System.out.println(country.toUpperCase());
//			}
//		}
//}

//change array to toLowerCase

//public class a4{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your name:");
//		String name= scan.next();
//		String [] countries= new String[3];
//		countries[0]="india";
//		countries[1]="Uk";
//		countries[2]="us";
//		int count=0;
//		for(String country:countries) {
//         System.out.println(country.toLowerCase());
//			}
//		}
//}

public class a4{
public static void main(String[] args) {
	
	String [] countries= new String[3];
	countries[0]="india";
	countries[1]="Uk";
	countries[2]="us";
	String []updateCountries=new String[4];
	updateCountries[0]=countries[0];
	updateCountries[1]= "china";
	updateCountries[2]=countries[1];
	updateCountries[3]=countries[2];
	for(String country:updateCountries) {
		System.out.println(country);
	}
}

}

//length of array
//public class a4{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your name:");
//		String name= scan.next();
//		String [] countries= new String[3];
//		countries[0]="india";
//		countries[1]="Uk";
//		countries[2]="us";
//		int count=0;
//		System.out.println(countries.length);//length method for array
//		for(String country:countries) {
//         if(country.length()>3) {//this length method of string
//      	   System.out.println(country);
//         }
//			}
//		}
//}
