package ploymorphism;

public class Cat extends Dog {
	@Override
	public void noise(){
		System.out.println("bowww...");
	}
public static void main(String[] args) {
	Cat c1 =new Cat();
	c1.eat();
	c1.walk();
	c1.noise();
}
}
