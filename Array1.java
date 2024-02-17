package java_1;

public class Array1 {
public static void main(String[] args) {
	int [] data = new int[4];
	data [0]= 100;
    data [1]= 200;
    data[2]=300;
    data[3]=400;
    for(int x:data) { //for each value present in data move to x variable
    	System.out.println(x);
    }
}
}
