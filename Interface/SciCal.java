package Interface;

public class SciCal implements Calculator {
@Override
public void sum(int x, int y) {
	System.out.println(x*x + y*y);
}
}
