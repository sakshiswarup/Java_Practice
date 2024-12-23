package Array;

import java.util.Scanner;

public class a3{
	public static void main(String[] args) {
		int [] data = new int[3];
		data[0]=10;
		data[1]=30;
		data[2]=40;
		for(int x: data) {//for each= all data copy to x.
			System.out.println(x);
		}
	}
}

//counts how many times in India
public class a3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your name:");
	String names = scan.next();
	String[] countries = new String[3];//local
	countries[0]="India";
	countries[1]="India";
	countries[2]="USA";
	int count = 0;
	for(String country:countries) {
		if(country.equals(names)) {
			count++;
		}
		
	}System.out.println(count);
}
}

//startsWith
public class a3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       System.out.println("Enter your name:");
		String name = scan.next();
		String[] countries = new String[3];
		countries[0] = "US";
		countries[1] = "India";
		countries[2] = "India";
		int count = 0;

		for (String country : countries) {
			if (country.startsWith(name)) {
				count++;
			}
		}
		System.out.println(count);
	}
}

//endsWith 
public class a3{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scan.next();
		String [] countries = new String[3];
		countries[0]="INDIA";
		countries[1]="USA";
		countries[2]="UK";
		int count=0;
		for(String country:countries) {
			if(country.endsWith(name)) {
				count++;
			}
		}
		System.out.println(count);
	}
}

