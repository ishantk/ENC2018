package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.auribises.db.JDBCHelper;
import com.auribises.model.User;


@WebServlet({ "/LoginServlet", "/Login.do" })
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("--Request Came--");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		User user = new User();
		
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		JDBCHelper helper = new JDBCHelper();
		helper.openConnection();
		boolean login = helper.loginUser(user);
		helper.closeConnection();
		
		// Session Tracking
		//1. Cookies
		/*Cookie ck1 = new Cookie("keyName", "Fionna");
		Cookie ck2 = new Cookie("keyEmail", user.email);
		
		response.addCookie(ck1);
		response.addCookie(ck2);*/
		
		if(login){
			//2. URL Re-Writing (Append the data as a part of URL)
			//out.print("<html><body><h3>Login is a Success<br/><br/><a href='Welcome?name=Fionna&email="+user.email+"'>Enter Home</a></h3></body></html>");
			
			//3. HttpSession
			HttpSession session = request.getSession();
			session.setAttribute("keyName", "Fionna");
			session.setAttribute("keyEmail", user.email);
			
			out.print("<html><body><h3>Login is a Success<br/><br/><a href='Welcome'>Enter Home</a></h3></body></html>");	
		}else{
			out.print("Login is a Failure");	
		}
		
	}

}
