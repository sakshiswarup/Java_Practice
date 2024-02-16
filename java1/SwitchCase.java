package java_1;

//IN this switch case if we not write break keyword then 2 and after all lines continuously run  
//public class SwitchCase {
//public static void main(String[] args) {
//	int day = 2;
//	switch(day) {
//	case 1:
//		System.out.println("monday");
//	case 2:
//		System.out.println("tuesday");
//	case 3:
//		System.out.println("wednesday");
//	case 4:
//		System.out.println("thrusday");
//	case 5:
//		System.out.println("friday");
//	case 6:
//		System.out.println("saturday");
//	case 7:
//		System.out.println("sunday");	
//	}
//}
//}


public class SwitchCase {
public static void main(String[] args) {
	int day = 2;
	switch(day) {
	case 1:
		System.out.println("monday");
		break;
	case 2:
		System.out.println("tuesday");// only this case run 
		break;
	case 3:
		System.out.println("wednesday");
		break;
	case 4:
		System.out.println("thrusday");
		break;
	case 5:
		System.out.println("friday");
		break;
	case 6:
		System.out.println("saturday");
		break;
	case 7:
		System.out.println("sunday");
		break;
	}
}
}