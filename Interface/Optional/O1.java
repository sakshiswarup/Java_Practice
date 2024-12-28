package Interface.Optional;

import java.util.Optional;

//Optional class= it helps us to handle null pointer Exception.
//Optional.ofNullable (o) creates as Optional that can hold null without throwing an exception
//public class O1 {
//int x =10;
//public static void main(String[] args) {
//	O1 o =null;
//	Optional <O1> v = Optional.ofNullable(o);//here wraps the o object in an Optional object.
//	if(v.isPresent()) {
//		//check if the Optional Object contains a non-null value using v.isPresent.
//		//if true it tries to access and print the value of o.x.
//		//if false it prints "reference is null" indicating that o object = null.
//		System.out.println(o.x);
//	} else {
//		System.out.println("refernce is null");
//	}
//}
//}

public class O1 {
int x =10;
public static void main(String[] args) {
	O1 o =null;
	Optional <O1> v = Optional.ofNullable(o);
	if(v.isPresent()) {
		System.out.println(v.get().x);//v.get() retrieves the value inside the Optional, but only if it is present.
	} else {
		System.out.println("refernce is null");
	}
}
}