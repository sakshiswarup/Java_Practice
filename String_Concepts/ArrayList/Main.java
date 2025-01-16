import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>();
        //Dynamic Array
        //It maintains the order of insertion
        //it supports duplicate elements

        arr.add("USA");
        arr.add("Uk");
        arr.add("India");
        System.out.println(arr);
//        System.out.println(arr.size());
//        arr.add(1,"India");
//        System.out.println(arr);
//        //arr.remove(1);
//        arr.remove("India");
//        System.out.println(arr);
//        arr.set(1,"France");
//        System.out.println(arr);
//        System.out.println(arr.get(1));
        //Sequence collection(java 21)
//        System.out.println(arr.getFirst());
//        System.out.println(arr.getLast());
//        arr.removeLast();
//        arr.removeFirst();
//        System.out.println(arr);
        //System.out.println(arr.reversed());
//contains()
        System.out.println(arr.contains("India"));//true
//removeAll()
        ArrayList<String> rm= new ArrayList<>();
        rm.add("a");
        rm.add("b");
        rm.add("c");
        System.out.println(rm);
        rm.removeAll(rm);
        System.out.println(rm);
    }
}
