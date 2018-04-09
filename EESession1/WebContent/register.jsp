<%@page import="com.google.gson.Gson"%>
<%@page import="com.auribises.model.Response"%>
<%@ page import="com.auribises.db.JDBCHelper"%>
<%@ page import="com.auribises.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	
		User user = new User();
		
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		JDBCHelper helper = new JDBCHelper();
		helper.openConnection();
		int i = helper.registerUser(user);
		helper.closeConnection();
		
		if(i>0){
				
			//Cookie ck1 = new Cookie("keyName",user.name);
			//Cookie ck2 = new Cookie("keyEmail",user.email);
			
			//response.addCookie(ck1);
			//response.addCookie(ck2);
			
			session.setAttribute("keyName", user.name);
			session.setAttribute("keyEmail", user.email);
				
			Response res = new Response();
			res.success = 1;
			res.message = "User Registered Successfully";
			
			Gson gson = new Gson();
			
			String json = gson.toJson(res);
			out.print(json);
	%>
	
	<b> User Registered Successfully !!</b>
	<br/>
	<a href="welcome.jsp">Enter Home</a>
	
	
	
	<%		
		}else{
	%>	
		<b> User Registration Failed !!</b>		
	<%		
		}
		
	%>

</body>
</html>