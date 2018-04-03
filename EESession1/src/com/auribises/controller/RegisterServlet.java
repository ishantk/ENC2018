package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auribises.db.JDBCHelper;
import com.auribises.model.User;


@WebServlet({ "/RegisterServlet", "/Register", "/Register.do" })
public class RegisterServlet extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("--Servlet Initialized--");
	}

	
	public void destroy() {
		System.out.println("--Servlet Destroyed--");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--Request Came--");
		
		User user = new User();
		
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		//System.out.println("Data Received: "+name+" - "+email+" - "+password);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		System.out.println(user);
		
		JDBCHelper helper = new JDBCHelper();
		helper.openConnection();
		int i = helper.registerUser(user);
		helper.closeConnection();
		
		if(i>0){
			out.print("Data Received.. "+user.name+" Registered Successfully !! ");
		}
		
		//out.print("Data Received.. You Shall be registered shortly !! "+name);
	}

	
	
}
