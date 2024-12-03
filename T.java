package ThisKeyword;

public class T {
    //This keywords- is special reference variable that hold object address.
//    public static void main(String[] args) {
//        T a1 = new T();
//        System.out.println(a1);
//        a1.test();
//    }
//    public void test(){
//        System.out.println(this);
//    }
    //---Using this keyword we can access non static members of the class
    int x = 10; //non static
    public static void main(String[] args){
        T a1 = new T();
        System.out.println(a1.x);
        a1.test();
    }
    public void test(){
        System.out.println(this.x);
    }
}

