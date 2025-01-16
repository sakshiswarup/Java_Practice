package Linked_List;

import java.util.LinkedList;
import java.util.List;

//public class L1 {
//    public static void main(String[] args) {
//        List<String> l= new LinkedList<>();
//        l.add("apple");
//        l.add("cherry");
//        l.add("banana");
//        System.out.println(l.getFirst());
//        System.out.println(l.getLast());
//        System.out.println(l.removeLast());
//        System.out.println(l);
//    }
//}

public class L1{
    public static void main(String[] args) {
        List<String> l= new LinkedList<>();
        l.add("apple");
        l.add("banana");
        l.add("cherry");
        l.add(1,"xxx");
        l.set(2,"abd");//good
        System.out.println(l.get(1));//poor performance
        System.out.println(l.remove(1));//good
        System.out.println(l);
    }
}