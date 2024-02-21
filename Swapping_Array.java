package java_1;

public class Swapping_Array {
	public static void main(String[] args) {
		int[] arr = { 34, 14, 24, 40, 35 };
		int temp;
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			}
		}
		for (int x : arr) {
			System.out.println(x);
		}
		System.out.println(arr[arr.length - 1]);// first max value of this sorted array
		System.out.println(arr[arr.length - 2]);// second max value
		
		System.out.println(arr[0]);//first min value
		System.out.println(arr[1]);//second min value
	}

}
