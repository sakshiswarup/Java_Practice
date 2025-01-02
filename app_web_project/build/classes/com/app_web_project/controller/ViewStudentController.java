package com.app_web_project.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app_web_project.model.DAOService;


@WebServlet("/listStudent")
public class ViewStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ViewStudentController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			HttpSession session = request.getSession(false);
			//sessionTimeout
			session.setMaxInactiveInterval(10);
			if(session.getAttribute("email")!=null) {
				DAOService service = new DAOService();
				service.ConnectDB();
				
				ResultSet result=service.getAllStudents();
				
				request.setAttribute("result",result);
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/list_registration.jsp");
				rd.forward(request,response);
				}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request,response);
			}
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request,response);
		}
		
	}	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
