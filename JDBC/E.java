package app_java_db;


import java.sql.*;
import java.util.Scanner;

public class E {
//public static void main(String[] args) {
//	try {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your name:");
//		String name = scan.next();
//		
//		System.out.println("Enter your city:");
//		String city = scan.next();
//		System.out.println("Enter your email id:");
//		String email = scan.next();
//		System.out.println("Enter your Mobile Number:");
//		String mobile = scan.next();
//		
//		//connect to database
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db","root","test");
//		System.out.println(con);
//		
//		//Write SQL Queries
//		Statement stmnt = con.createStatement();
//		stmnt.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
//		con.close();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//}
//}

	
	//Delete Record
	
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your email id:");
			String email = scan.next();
			
			//connect to database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db","root","test");
			System.out.println(con);
			
			//write a sql queries
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("DELETE FROM registration WHERE email='"+email+"'");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
}}