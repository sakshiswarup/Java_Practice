package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

//Here we can make input dynamically
//public class A1 {
//public static void main(String[] args) {
//	try {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your name");
//		String name = scan.next();
//		System.out.println("Enter the Email");
//		String email = scan.next();
//		System.out.println("Enter the mobile");
//		String mobile = scan.next();
//		//Establish connection
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","test");
//      //Execute Query
//		Statement stmnt = con.createStatement();
//		stmnt.executeUpdate("insert into registration values('"+name+"','"+email+"','"+mobile+"')");
//      //close connection
//		con.close();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//}
//}

//Delete the record

//public class A1{
//	public static void main(String[] args) {
//		try {
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Enter your Email:");
//			String email= scan.next();
//			//Establish Connection
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","test");
//          //Execute Query
//			Statement stmnt = con.createStatement();
//			stmnt.executeUpdate("DELETE FROM registration WHERE email='"+email+"'");
//          //close connection
//			con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}

//Update record
//public class A1{
//	public static void main(String[] args) {
//		try {
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Enter your Email:");
//			String email=scan.next();
//			System.out.println("Enter your mobile: ");
//			String mobile=scan.next();
//			//Establish Connection
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","test");
//			//Execute Query
//			Statement stmnt = con.createStatement();
//			stmnt.executeUpdate("UPDATE registration SET mobile='"+mobile+"' WHERE email ='"+email+"'");
//			//close connection
//			con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}

//if exception occurs in code 
public class A1 {
public static void main(String[] args) {
	Connection con = null;
	try {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.next();
		System.out.println("Enter the Email");
		String email = scan.next();
		System.out.println("Enter the mobile");
		String mobile = scan.next();
		//Establish connection
	     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","test");
    //Execute Query
		Statement stmnt = con.createStatement();
		stmnt.executeUpdate("insert into registration values('"+name+"','"+email+"','"+mobile+"')");
   
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		//close connection
	try {                  //|
		con.close();         //|  
	} catch(Exception e2){   //| under try &catch block using con.close close the connections
		e2.printStackTrace(); //|
	}                           //|
	}
}
}
