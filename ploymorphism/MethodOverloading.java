package ploymorphism;

//Here we can create more than one method in same class with same name provided,
//they have different number of arguments or different types of arguments.
public class MethodOverloading {
public int add(int x ,int y) {
	return x+y;
}
public double add(double x ,double y) {
	return x+y;
}
public static void main(String[] args) {
	MethodOverloading m1 = new MethodOverloading();
	int val1= m1.add (100,200);
	System.out.println(val1);
	double val2=m1.add(100.3, 200.2);
	System.out.println(val2);
}
}
