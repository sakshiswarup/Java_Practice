package exceptions;
//RunTimeException = unchecked exception.
//These exception occured in runtime of the program.
public class RunTimeException {
public static void main(String[] args) {
	int x = 10/0;
	System.out.println(x);//Exception in thread "main" java.lang.ArithmeticException: / by zero
	                        //at exceptions.RunTimeException.main(RunTimeException.java:6)
}
}
