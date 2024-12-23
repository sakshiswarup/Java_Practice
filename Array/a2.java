package Array;


public class a2{
	public static void main(String[] args) {
		int []x=new int[3];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		for(int i =0; i<x.length;i++) {
			System.out.println(x[i]);
		}
	}
}


public class a2 {
public static void main(String[] args) {
	String[] names= new String[3];
	names[0]="mike";
	names[1]="stallin";
	names[2]="joy";
	names[3]="sam";
	for(int i= 0; i<names.length;i++) {
		System.out.println(names[i]);//ArrayOutOfBound Exception.
	}
}
}

//for handle exception
//public class a2{
//	public static void main(String[] args) {
//		String[] names= new String[3];
//		try {
//			names[0]="mike";
//			names[1]="joe";
//			names[2]="stallin";
//			names[3]="sam";
//			
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
//		for(int i =0; i< names.length;i++) {
//			System.out.println(names[i]);
//		}
//	}
//}

public class a2{
	public static void main(String[] args) {
		int [] data = new int[3];
		
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);//by default 0,0,0
		}
	}
}
