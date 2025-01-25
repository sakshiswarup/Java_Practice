package Generics;

import java.util.ArrayList;
import java.util.List;

//public class G2 {
//public static void main(String[] args) {
//	//G1 g1= new G1("mike",1);
//	G1 g1=new G1(100,1);//here both value vaild so it's not safe
//	System.out.println(g1.getId());
//	System.out.println(g1.getName());
//	
//}
//}

//public class G2{
//	public static void main(String[] args) {
//		G1<String,Integer> g1 = new G1<>("stallin",1);
//		System.out.println(g1.getName());
//		System.out.println(g1.getId());
//	}
//}

//WildCard generics =<?>

public class G2{
	public static void main(String[] args) {
		
	}
	public List<?> getList(){
		List<Integer> arr=new ArrayList<>();
		return arr;
	}
}