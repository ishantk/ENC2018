<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>Scriptlet</h3>
	
	<%-- <h3>c is: <% out.print(c); %></h3> error --%>
	<h3>pi is: <% out.print(pi); %></h3>
	
	<% 
		int a = 10;
		int b = 20;
		int c = a+b;
		
		out.print("c is: "+c);
	
	%>
	
	<h3>c is: <% out.print(c); %></h3>
	
	<h3>Declarative</h3>
	<%!
		double pi = 3.14;
		int squareOfNum(int num){
			return num*num;
		}
	%>
	
	<h3>Square of 9 is: <% out.print(squareOfNum(9)); %></h3>
	
	<h3>Square of 11 is: <%= squareOfNum(11) %></h3>
	
	<%
		int[] arr = {10,20,30,40,50};
		//try{
			out.print(arr[20]);
		//}catch(Exception e){
		//	out.print("Exception: "+e);
		//}
		
	%>

</body>
</html>