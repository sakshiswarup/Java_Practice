package Array;
//An array is a fixed size container that holds elements of the same types.
//it stores collections of values.
//The memory address should be continues=  index number * memory size + start memory address
//ex -x[1]= 1*4+20=24
//public class A1 {
//    public static void main(String[] args) {
//        String[] names =new String[3];
//        names[0]="mike";
//        names[1]="stallin";
//        names[2]="adam";
//        for(int i= 0; i<names.length;i++){
//            System.out.println(names[i]);
//        }
//    }
//}

import java.util.Scanner;
//counts how many times in India
//public class A1 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String names= scan.next();
//        String [] countries=new String[3];
//        countries[0]="us";
//        countries[1]="india";
//        countries[2]="india";
//        int count =0;
//        for(String country:countries){
//            if(country.equals(names)){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}
public class A1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you name:");
        String names = scan.next();
        String []countries= new String[3];
        countries[0]="us";
        countries[1]="uk";
        countries[2]="uk";
        int count=0;
        System.out.println(countries.length);
        for(String country: countries) {
            if(country.length()>3) {
                System.out.println(country);
            }
        }
    }
}
