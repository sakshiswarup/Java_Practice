package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
 public static void main(String[] args) {
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","test");
		System.out.println(con);
		
		Statement stmnt = con.createStatement();
	    stmnt.executeUpdate("UPDATE registration SET mobile='9379845650', email='mikethyson@gmail.com' WHERE email='mike@gmail.com'");
	
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
