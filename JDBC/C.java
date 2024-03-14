package app_java_db;
import java.sql.*;
public class C {
public static void main(String[] args) {
	try {
		//connect to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db","root","test");
		System.out.println(con);
		//write sql queries
		Statement stmnt = con.createStatement();
	    stmnt.executeUpdate("Update registration SET mobile ='9637629077'WHERE email ='mike@gmail.com'");
	    //close connection
	    con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}

}
}
