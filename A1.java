package Constructor;

public class A1 {
    //Whenever we created object  constructor will be called
//    A1(){
//        System.out.println(100);
//    }
//    public static void main(String[] args){
//        A1 a1 = new A1();
//    }
    //---
    //method and non static
//    void A1(){
//        System.out.println(10);
//    }
//
//    public static void main(String[] args) {
//        A1 a1= new A1();
//    }
    //---
//   void A1(){//method
//        System.out.println(100);
//    }
//    public static void main(String[] args) {
//        A1 a1 = new A1();
//        a1.A1();
//    }
    //--Constructor with arguments.
//    A1(int x){
//        System.out.println(x);
//    }
//    public static void main(String[] args){
//        A1 a1= new A1(100);
//
//    }
    A1(double x, int y){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        A1 a1 = new A1(10.5,10);

    }
}
