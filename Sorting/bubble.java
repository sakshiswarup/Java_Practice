package Sorting;

//public class bubble {
//public static void main(String[] args) {
//	int []x = {34,14,24,40,30};
//	int temp=0;
//	for(int j=0; j<x.length-1; j++) {
//	for(int i =0; i<x.length-1;i++) {
//		if(x[i]>x[i+1]) {
//			temp = x[i];
//			x[i]=x[i+1];
//			x[i+1]=temp;
//		}
//		}
//	}
//	for(int z:x) {
//		System.out.println(z);
//	}
//}
//}

//maximum and minmum find in the given array or you can apply on salary (min/max) many more....
public class bubble{
	public static void main(String[] args) {
		int []arr = {15,10,20,35,45,40};
		int temp=0;
		for(int j=0;j<arr.length-1; j++) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		System.out.println(arr[arr.length-1]); //it will give max element
		System.out.println(arr[0]);//it will give min element
//		for(int z:arr) {
//			System.out.println(z);
//		}
		
	}
}
