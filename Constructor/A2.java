package Constructor;
//Constructor Overloading- here we can create more then more constructor in the same class provided they
// have different numbers of arguments or different type of arguments

public class A2 {
//    A2(){//no args
//        System.out.println(100);
//    }
//    A2(int x){//args1 type int
//        System.out.println(x);
//    }
//    A2(int x, double y){//args 2, type- int, double
//        System.out.println(x);
//        System.out.println(y);
//    }
//    public static void main(String[] args) {
//        A2 a1= new A2();
//        A2 a2 = new A2(10);
//        A2 a3 = new A2(10,20);
//    }
    A2(){
        System.out.println(10);
    }
    A2(String x){
        System.out.println(x);
    }
    A2(char x){
        System.out.println(x);
    }
    A2(String x, int y){
        System.out.println(x);
        System.out.println(y);
    }
public static void main(String[] args) {
    A2 a1 = new A2();
    A2 a2 = new A2("mike");
    A2 a3 = new A2('a');
    A2 a4 = new A2("ss",10);
}
}
