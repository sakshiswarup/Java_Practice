package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read")
public class ReadRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ReadRegistration() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();//response.getWriter();this is build in method present in response object
		try {
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>");//th table header
		out.println("Name");
		out.println("</th>");
		out.println("<th>");
		out.println("City");
		out.println("</th>");
		out.println("<th>");
		out.println("Email");
		out.println("</th>");
		out.println("<th>");
		out.println("Mobile");
		out.println("</th>");
		out.println("</tr>");

		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db", "root", "test");
			Statement stmnt = con.createStatement();
			 ResultSet result = stmnt.executeQuery("select * from registration");
			 while(result.next()) {
					out.println("<tr>");
					out.println("<td>");//td table data
					out.println(result.getString(1));
					out.println("</td>");
					out.println("<td>");//td table data
					out.println(result.getString(2));
					out.println("</td>");
					out.println("<td>");//td table data
					out.println(result.getString(3));
					out.println("</td>");
					out.println("<td>");//td table data
					out.println(result.getString(4));
					out.println("</td>");
					out.println("</tr>");

			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
System.out.println("post");

	}

}
