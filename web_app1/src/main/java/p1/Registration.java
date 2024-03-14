package p1;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Registration() {
		super();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Do get");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("firstname");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// <--this will tell tomcat where is your driver class now we connect
			// database to the servlettomcat is unable to make servlet connect to the
			// database because driver class is missing.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db", "root", "test");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate(
					"insert into registration values('" + name + "','" + city + "','" + email + "','" + mobile + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
