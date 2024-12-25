package Custom_Exception;

import java.util.Scanner;

public class FastTag {
public static void main(String[] args) {
	int availableBalance = 50;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the toll amount");
	int amount= scan.nextInt();
	if(amount>availableBalance) {
		try {
			throw new LowBalance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}
