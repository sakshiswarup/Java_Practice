package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//public class B {
//public static void main(String[] args) {
//try {
//	//connect to DB
//     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","test");
//	//Write sql queries
//	Statement stmnt =con.createStatement();
//	ResultSet result = stmnt.executeQuery("SELECT * FROM registration");
//	while(result.next()) {
//		System.out.println(result.getString(1));
//		System.out.println(result.getString(2));
//		System.out.println(result.getString(3));
//		}
//	//close connection
//	con.close();
//} catch (Exception e) {
//	e.printStackTrace();
//}
//}}
//search of mobile number
public class B {
public static void main(String[] args) {
try {
	//connect to DB
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","test");
	//Write sql queries
	Statement stmnt =con.createStatement();
	ResultSet result = stmnt.executeQuery("SELECT * FROM registration where mobile='2255749839'");
	while(result.next()) {
		System.out.println(result.getString(1));
		System.out.println(result.getString(2));
		System.out.println(result.getString(3));
		}
	
	//close connection
	con.close();
} catch (Exception e) {
	e.printStackTrace();
}
}}

