package loop;

//Switch Statements
//Break statements
public class Switch1 {
    public static void main(String[] args) {
        int  key = 0;
        switch (key){
            case 1:
                System.out.println(1);
                break; //if break is not there it will run continuously
            case 2:
                System.out.println(2);
                break;//if break is not there it will run continuously
            case 3:
                System.out.println(3);
                break;//if break is not there it will run continuously
            default:
                System.out.println("no match is found");
        }
    }
}
