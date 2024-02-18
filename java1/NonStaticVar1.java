package java1;
//These variable belongs to object
//without object creation we cannot use this
//they are created outside method inside class.
//it is not mandatory to initialize non-static variable it takes default value when not initialize
public class NonStaticVar1 {
double x;//0.0
int y;//0
String z; //null
public static void main(String[] args) {
	NonStaticVar1 nonStaticVar1= new NonStaticVar1();
	System.out.println(nonStaticVar1.x);
	System.out.println(nonStaticVar1.y);
	System.out.println(nonStaticVar1.z);
}
}
