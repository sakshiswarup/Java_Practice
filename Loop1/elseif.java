package loop;

//public class elseif {
//    public static void main(String[] args) {
//        int x=3;
//        //int x= 1;
//        if(x==0){
//            System.out.println(0);
//        } else if (x==1) {
//            System.out.println(1);
//        } else if (x==2) {
//            System.out.println(2);
//        }else {
//            System.out.println("No match found");//o/p: No match found
//        }
//    }
//}

//else-if statement = only work for true statements.
//here once condition is true than next program stop there.
// public class elseif{
//    public static void main(String[] args) {
//        int x =10;
//        if(x>50){
//            System.out.println(1);
//        }else if(x<20){
//            System.out.println(2); //output is 2.
//        } else if (x>5) {
//            System.out.println(3);
//            }
//        else{
//            System.out.println("else");
//        }
//    }
//}

//public class elseif{
//    public static void main(String[] args) {
//        int x = 10;
//        if(x>50){
//            System.out.println(1); //output 1
//        } else if (x>70){
//            System.out.println(2);
//            }else if(x>30){
//            System.out.println(2);
//        } else{
//            System.out.println("else");
//        }
//    }
//}

public class A{
    public static void main(String[] args) {
        int x =10;
        if(x<50){
            System.out.println(1);//here only print 1 because in else-if if one statement is true program stop there.
        }else if(x<30){
            System.out.println(2);
        }else{
            System.out.println(3);
        }
    }
}