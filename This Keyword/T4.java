package ThisKeyword;

public class T4 {
//    T4(int x){
//        System.out.println(x);
//    }
//    T4() {
//        this(100);
//    }
//    public static void main(String[] args) {
//        T4 t1 = new T4();
//    }

    //Drawback
    //While creating constructor this keyword cannot be second statement inside another constructor.

//    T4(int x){
//        System.out.println(x);
//    }
//    T4(){
//        System.out.println("welcome error");
//        this(100);//error
//    }
//    public static void main(String[] args) {
//        T4 t1 = new T4();
//    }

    //so correct way write this
    T4(int x){
        System.out.println(x);
    }
    T4(){
        this (100);
        System.out.println("welcome no errors");
    }
    public static void main(String[] args) {
        T4 t1 =new T4();

    }
}
