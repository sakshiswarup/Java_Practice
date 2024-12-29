package SuperKeyword;

//ex 7
//Every child constructor  if we don't keep super keyword (called by compiler automatically) that super keyword can call
//no args with constructor .it can't call args with parent class constructor
//public class C extends A {//o/p A 100
//	C(){
//		
//	}
//	C(int i){
//		//super by compiler
//		System.out.println(i);
//	}
//public static void main(String[] args) {
//	new C(100);
//}
//}

//If in the parent class there is only constructor with arguments then as a programmer we can explicitly write in 
//super keyword in child class.
//ex8

//public class C extends A{
//	C(){//error
//		System.out.println(i);
//	}
//	public static void main(String[] args) {
//		new C();
//	}
//}
//correct
//public class C extends A{//500 C
//	C(){
//		super(500);
//		System.out.println("C");
//	}
//	public static void main(String[] args) {
//		new C();
//	}
//}

//Note: Super keyword is not automatically kept when there are only constructors with args in parent class.
//super keyword will be placed automatically when in the parent class there is a constructor with no args.
//ex9
//public class C extends A{//from test C
//	C(){
//		System.out.println("C");
//	}
//	public static void main(String[] args) {
//		new C();
//	}
//}

//ex10
//public class C extends A{//from A C from A 100
//	C(){
//		System.out.println("C");
//	}
//	C(int i){
//		System.out.println(i);
//	}
//	public static void main(String[] args) {
//		new C();
//		new C(100);
//	}
//}

//public class C extends A{
//	C(){
//		System.out.println("C");
//	}
//	C(int i){
//		this(); super();//error
//		System.out.println(i);
//	}
//	public static void main(String[] args) {
//		System.out.println(i);
//	}
//}

//if your child class constructor consist of this keyword then in that constructor 
//super keyword will not be automatically placed.

public class C extends A{
	C(){
		//super keyword placed automatically
		System.out.println("C");
	}
	C(int i){
		this();
		System.out.println(i);
	}
	public static void main(String[] args) {
		new C(100);
	}
}