package Interface;

public class SimpleCalc implements Calculator {
@Override
public void sum(int x ,int y) {
	System.out.println(x + y);
}
}

