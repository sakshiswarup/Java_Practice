package defaultcon2;

import defaultcon1.A;

//import defaultcon1.A;
//When you make a constructor default then class object can be created in same class & same package but not outside the package.
public class C {
public static void main(String[] args) {
	//A a1 = new A();//error
}
}

//When you make a constructor default then that class inheritance  can be done  in  same package but not in different package.
//public class C extends A{//error
//	
//}