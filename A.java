package app_java_db;
import java.sql.*;//complete jdbc package is there.

//first create lib folder then put there mysql_connector

public class A {
	public static void main(String[] args) {
		try {
			//connect to database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db","root","test");
			System.out.println(con);
			//Write SQL Queries
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate
			("insert into registration values('adam','chennai','adam@gmail.com','1243245152')");
			//Close Connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
