package java_1;
//Swapping an Array
public class Swapping_Array {
	public static void main(String[] args) {
		int []arr = {34,14,24,40,35};
		int temp;
		for(int j =0; j<arr.length-1;j++) {
			for(int i =0; i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
				
			}
		}
		for(int x:arr) {
			System.out.println(x);
		}
	}

}
