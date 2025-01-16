import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//ArrayList
public class A {
    public static void main(String[] args) {
        List<String> arr =new ArrayList<>();
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Cherry");

//        Iterator<String> val = arr.iterator();
//        while(val.hasNext()){//if value is check in next position then print nd move pointer to next
//            String x = val.next();
//            System.out.println(x);
//        }
        //or another way to iterate values
        for(String x: arr){
            System.out.println(x);
        }
    }
}
