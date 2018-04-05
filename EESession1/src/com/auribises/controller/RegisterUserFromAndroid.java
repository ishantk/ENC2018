package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auribises.model.Response;
import com.auribises.model.User;
import com.google.gson.Gson;


@WebServlet({ "/RegisterUserFromAndroid", "/RegisterAndroid" })
public class RegisterUserFromAndroid extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		User user = new User(name, email, password);
		// Register User using JDBC
		
		Response res = new Response();
		res.success = 1;
		res.message = "User Registered Successfully !!";
		
		Gson gson = new Gson();
		String json = gson.toJson(res);
		
		out.print(json);
		
	}

}
