package ThisKeyword;
// this()- using this keyword we can call constructor but the call should be done from
// another constructor & not a method.
public class T3 {
//    T3(){
//        System.out.println(100);
//    }
//    T3(int x){
//        this();
//    }
//    public static void main(String[] args) {
//        T3 t1 = new T3(100);
//
//    }
//    public void test(){
//        this();
//    }

//    T3(int x){
//        System.out.println(x);
//    }
//    T3(){
//       this(100);
//    }
//    public static void main(String[] args) {
//        T3 t1 = new T3();
//    }

    // Constructor Chaining-- Here we call one constructor to another constructor

    T3(int x, String y){
        System.out.println(x);
        System.out.println(y);
    }
    T3(double x){
        this(10,"mike");
    }
    T3(){
        this(100);

    }

    public static void main(String[] args) {
        T3 t1 = new T3();
    }
}
