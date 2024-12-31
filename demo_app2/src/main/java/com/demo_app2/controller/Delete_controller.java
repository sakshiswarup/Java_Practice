package com.demo_app2.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo_app2.model.Calculator;


@WebServlet("/delete")
public class Delete_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Delete_controller() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("delete_numbers.jsp");//this going to implict object in jsp
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String num1 = request.getParameter("num1");//Fetching values
			String num2 = request.getParameter("num2");
			
			int x = Integer.parseInt(num1);
			int y = Integer.parseInt(num2);
			
			Calculator c = new Calculator();
			int result = c.deleteNumbers(x, y);
			
			request.setAttribute("res", result);
			RequestDispatcher rd = request.getRequestDispatcher("delete_numbers.jsp");//this going to implict object in jsp
			rd.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", "Invaild Input..");
			RequestDispatcher rd = request.getRequestDispatcher("delete_numbers.jsp");//this going to implict object in jsp
			rd.forward(request, response);
		}
		}

}
