package app_java_db;
import java.sql.*;//complete jdbc package is there.
public class B {
	public static void main(String[] args) {
		try {
			//connect to database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db","root","test");
			System.out.println(con);
			//Write SQL Queries
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate
			("DELETE FROM registration where email='adam@gmail.com'"); //for delete details of adam
			//Close Connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
