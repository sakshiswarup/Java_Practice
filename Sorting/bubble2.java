package Sorting;
//how do is remove elements where array is not sorted?
public class bubble2 {
public static void main(String[] args) {
	int []x= {10,5,20,10,30,40,20,20};
	int temp=0;
	for(int j = 0; j<x.length-1;j++) {
		for(int i=0; i<x.length-1; i++) {
			if(x[i]>x[i+1]) {
				temp=x[i];
				x[i]=x[i+1];
				x[i+1]=temp;
			}
		}
	}
	int [] arr= new int[x.length];
	int j=0;
		for(int i=0; i<x.length-1; i++) {
			if(x[i]!=x[i+1]) {
				arr[j]=x[i];
				j++;
			}
			arr[j]=x[x.length-1];
	}
		System.out.println("Sorted Array..");
		for(int i =0;i<arr.length-1; i++) {
			System.out.println(arr[i]);//[5,10,20,30,40,0,0]
		}
}
}
