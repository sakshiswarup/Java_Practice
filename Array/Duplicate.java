package Array;
//Remove Duplicate element of an array.
//public class Duplicate {

//public static void main(String[] args) {
//	int[] x = {1,1,2,2,3,3,4,5,6}; length=9 9-1=8 ,index 0 to 8=6 is there .
//	int temp []= new int[x.length];
//	int j =0;
//	for(int i=0;i<x.length-1;i++) {
//		if(x[i]!=x[i+1]) {
//			temp[j]=x[i];
//			j++;
//		}
//	}
//	temp[j]=x[x.length-1];
//	for(int z:temp) {
//		System.out.println(z);//print{1,2,3,4,5,6,0,0,0}
//	}
//}
//}

public class Duplicate {
	public static void main(String[] args) {

		int[] x = { 1, 1, 2, 2, 3, 3, 4, 5, 6 };
		int temp[] = new int[x.length];
		int j = 0;
		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] != x[i + 1]) {
				temp[j] = x[i];
				j++;
			}
		}
		temp[j] = x[x.length - 1];
		for (int z = 0; z < j + 1; z++) {//it will print 1to6
			System.out.println(temp[z]);
		}
	}
}

