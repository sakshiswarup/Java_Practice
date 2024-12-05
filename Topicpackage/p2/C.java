package Topicpackage.p2;

import Topicpackage.p1.A; //here we have to import package to access different package.
import Topicpackage.p1.*;//wildcard
//public class C extends A {
//
//}
public class C {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
    }
}

