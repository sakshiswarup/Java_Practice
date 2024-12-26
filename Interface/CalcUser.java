package Interface;

public class CalcUser {
public static void main(String[] args) {
	SimpleCalc c1 = new SimpleCalc();
	c1.sum(10,20);
	
	SciCal c2 = new SciCal();
	c2.sum(10,20);
}
}
