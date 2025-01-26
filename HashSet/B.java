package HashSet;

import java.util.HashSet;
import java.util.Set;

public class B {
    public static void main(String[] args) {
        Set<String> arr = new HashSet<>();
        arr.add("India");
        arr.add("US");
        arr.add("UK");
        arr.add("China");
        arr.add("India");
        boolean isPresent = arr.contains("India");
        System.out.println(isPresent);

        boolean isRemoved = arr.remove("India");
        System.out.println(isRemoved);
        System.out.println(arr);
    }
}
