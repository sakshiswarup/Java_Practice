package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addReg")
public class Registration extends HttpServlet {
	private static final long serialVersionUID=1L;
    public Registration() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     System.out.println("do get");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x = request.getParameter("name");
		String y = request.getParameter("email");
		String z = request.getParameter("mobile");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","test");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into registration values('"+x+"','"+y+"','"+z+"')");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
