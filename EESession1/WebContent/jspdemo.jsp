<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>    
<%@ include file="printDate.jsp" %>
<%@ page import="com.auribises.model.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
			out.print(arr[2]);
		//}catch(Exception e){
		//	out.print("Exception: "+e);
		//}
		
	%>
	
	<jsp:include page="printDate.jsp"/>
	<%-- <jsp:forward page="welcome.jsp"/> --%>
	
	<%
		User uRef = new User();
		uRef.setName("John");
		uRef.setEmail("john@example.com");
		uRef.setPassword("john123");
	%>
	<br/>
	Name is: <%= uRef.getName() %>
	<br/>
	Email is: <%= uRef.getEmail() %>
	<br/>
	Password is: <%= uRef.getPassword() %>
	
	
	<jsp:useBean id="uRef1" class="com.auribises.model.User"/>
	<jsp:setProperty property="name" name="uRef1" value="Jennie"/>
	<jsp:setProperty property="email" name="uRef1" value="jennie@exmaple.com"/>
	<jsp:setProperty property="password" name="uRef1" value="Jennie123"/>
	
	<br/>
	Name is: <jsp:getProperty property="name" name="uRef1"/>
	<br/>
	Email is: <jsp:getProperty property="email" name="uRef1"/>
	<br/>
	Password is: <jsp:getProperty property="password" name="uRef1"/>
	
	<%
		int iVar = 10;
		for(int i=1;i<=10;i++){
			
		}
	%>
	
	<br/>
	<c:set var="age" value="20"/>
	Age is: <c:out value="${age}"/>
	
	<br/>
	<c:forEach var="j" begin="1" end="10">
		<b><c:out value="${j}"/> <br/><b>
	</c:forEach>

</body>
</html>