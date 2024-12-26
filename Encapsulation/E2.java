package Encapsulation;
//how to access data from E1 .
public class E2 {
public static void main(String[] args) {
	E1 e1 = new E1();
	e1.setName("mike");
	e1.setUsername("mike");
	e1.setEmail("mike@gmail.com");
	e1.setMobile("9572330948");
	e1.setPassword("testing");
	
	System.out.println(e1.getName());
	System.out.println(e1.getUsername());
	System.out.println(e1.getEmail());
	System.out.println(e1.getMobile());
	System.out.println(e1.getPassword());
}
}
