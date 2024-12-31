package com.app_web_project.model;

import java.sql.*;

//DAO Service= Data access object service ,are responsible to perform database operations
public class DAOService {

	private Connection con;
	private Statement stmnt;
	
	public void ConnectDB() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","test");
			stmnt =con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void closeConnection() {
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean verifyLogin(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
		  return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
