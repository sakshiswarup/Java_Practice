package LinkedHashSet;

import java.util.LinkedHashSet;

public class A {
    public static void main(String[] args) {
        LinkedHashSet<String> arr= new LinkedHashSet<>();
        arr.add("India");
        arr.add("USA");
        arr.add("Uk");
        arr.add("China");
        arr.add("India");
        System.out.println(arr);
        System.out.println(arr.reversed());
    }
}
