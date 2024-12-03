package ThisKeyword;

public class T2 {
//    public static void main(String[] args) {
//       T2 t1 = new T2();
//       t1.test1();
//     }
//     public void test1(){
//        this.test2();
//     }
//     public void test2(){
//         System.out.println(2);
//     }
    //Limitations - we cannot use this keyword inside static methods.

//    public static void main(String[] args) {
//        System.out.println(this);//error
//    }
//    public static void test1(){
//        System.out.println(this);//error
//    }

    //we can access static members using this keywords but not to be performed.
//    static int x = 10;
//    public static void main(String[] args) {
//        T2 t2 = new T2();
//        t2.test1();
//    }
//    public void test1(){
//        System.out.println(this.x);
//    }

    //This keyword hold's current objects address that is running in the program.

    public static void main(String[] args) {
        T2 t1 = new T2();
        t1.test();
        T2 t2 = new T2();
        t2.test();
        t1.test();
        t2.test();
    }
    public void test(){
        System.out.println(this);
    }
}
