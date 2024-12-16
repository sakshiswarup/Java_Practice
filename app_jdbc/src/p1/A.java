package p1;

import java.sql.*;
//JDBC

public class A {
 public static void main(String[] args) {
	 try {
		 //connect to database
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","test");
		 System.out.println(con);
		 
		 //write sql queries..
		 
		 Statement stmnt = con.createStatement();
		 stmnt.executeUpdate("insert into registration values('adam','adam@gmail.com','957499883')");
		 
		 //close connection
		 
		 con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
 }
	 
}
