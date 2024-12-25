package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		try {
			//connect to database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","test");
			System.out.println(con);
			//write sql queries
		    Statement stmnt = con.createStatement();
			stmnt.executeUpdate("DELETE FROM registration WHERE email= 'mikke@gmail.com'");		
			//close connection
			con.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
		
}

