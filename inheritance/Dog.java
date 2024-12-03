package inheritance;

public class Dog extends Animal {
    //here in this below code method overriding happening so it will print Bow Bow.
    public void noise(){
        System.out.println("Bow Bow..");
    }
   public static void main(String[] args){
       Dog dog = new Dog();
       dog.eat();
       dog.walk();
       dog.sleep();
       dog.noise();
   }
}
