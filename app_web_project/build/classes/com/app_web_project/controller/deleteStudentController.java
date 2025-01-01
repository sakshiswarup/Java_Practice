package com.app_web_project.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app_web_project.model.DAOService;


@WebServlet("/deleteStudent")
public class deleteStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public deleteStudentController() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		
		DAOService service = new DAOService();
		service.ConnectDB();
		service.deleteStudentInfo(email);
		
        ResultSet result=service.getAllStudents();
		
		request.setAttribute("result",result);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/list_registration.jsp");
		rd.forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
