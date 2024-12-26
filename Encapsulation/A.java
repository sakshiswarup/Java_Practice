package Encapsulation;
//Encapsulation(Data Hiding)= here we wrap data/variables with the methods such that only methods can operate on that data/variables.
//here we make variables as private so that direct access to variable  is restricted.
//we create getter & setters method to operate the variables.
//Via this getters & Setter we can operate outside the class so on...
public class A {
private String password;

//here right click goto source - generate getters & setters.



public void setPassword(String password) {
	this.password = password;
}
public String getPassword() {//whenever we call this variables it will give the value of password variable.
	return password;
}

}
 