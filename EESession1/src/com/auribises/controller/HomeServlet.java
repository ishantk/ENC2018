package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet({ "/HomeServlet", "/Welcome" })
public class HomeServlet extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		/*Cookie[] ckArr = request.getCookies();
		
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		
		//String name = request.getParameter("name");
		//String email = request.getParameter("email");
		
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("keyName");
		String email = (String)session.getAttribute("keyEmail");
		
		out.print("Welcome Home Dear User. Today is "+new Date()+"<br/>");
		out.print("Name: "+name+" Email: "+email);
		
	}

}
