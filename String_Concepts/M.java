import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M {
    public static void main(String[] args) {
   //     List<Long> numbers = new ArrayList<>();//mutable list
//        numbers.add(9635629033L);
//        numbers.add(96356392904L);
//        numbers.add(95937210328L);

        M m1= new M();
        List<Long> n = List.of(9635629033L,96356392904L,95937210328L);//immutable List example whose values cannot be modified.
       // m1.addMoney(numbers);
        m1.addMoney(n);
    }
    public void addMoney(List<Long> x){
       // x.add(9632882022L);//one more added
        //above if we add in immutableCollection exce[ption java.util.ImmutableCollections.uoe
        for(Long l:x){
            System.out.println("RS 500 added");
        }
    }
}
