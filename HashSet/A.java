package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A {
    public static void main(String[] args) {
        Set<String> arr = new HashSet<>();
        arr.add("India");
        arr.add("USA");
        arr.add("Uk");
        arr.add("China");
        arr.add("India");
        System.out.println(arr);
        System.out.println(arr.size());
//approch1
//        for(String val:arr){
//            System.out.println(val);
//        }
        //approch 2
        Iterator<String> itr = arr.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
