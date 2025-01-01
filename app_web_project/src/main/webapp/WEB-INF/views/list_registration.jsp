<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<!-- Add menu page here -->
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Students</title>
</head>
<body>
	<h2>All Students</h2>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<%// (ResultSet) class downcasing happen here
		ResultSet res = (ResultSet)request.getAttribute("result");
		while(res.next()){
			
		
		%>
		<tr>
			<td><%=res.getString(1) %></td>
			<td><%=res.getString(2) %></td>
			<td><%=res.getString(3) %></td>
			<td><a href="deleteStudent?email=<%=res.getString(2)%>">delete</a></td>
			<td><a href="updateStudent?email=<%=res.getString(2)%>&mobile=<%=res.getString(3)%>">update</a></td>
		</tr>
		
		<%} %>
	</table>
</body>
</html>