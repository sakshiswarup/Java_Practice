package inheritance;

public class Cat extends Animal {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.eat();
        cat.walk();
        cat.sleep();
        cat.noise();
    }
}
