package java_1;
//Duplicate element in array
public class DuplicateElementInArray {
	public static void main(String[] args) {
		int[] x = { 1, 1, 2, 2, 3, 3, 4, 5, 6 ,6 }; //we can also write int x[]={}
		int[] temp = new int[x.length];
		int j = 0;
		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] != x[i + 1]) {
				temp[j] = x[i];
				j++;
			}
		}
		temp[j] = x[x.length - 1]; //here x[8-1]-->x[7] gives 5 so it goes to last index in j
		for (int z : temp) {
			System.out.println(z);
		}
	}
}
